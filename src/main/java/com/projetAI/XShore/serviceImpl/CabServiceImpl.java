package com.projetAI.XShore.serviceImpl;

import com.projetAI.XShore.repository.CabRepository;
import com.projetAI.XShore.models.Cab;
import com.projetAI.XShore.services.CabService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

import java.util.List;
@EnableAspectJAutoProxy(proxyTargetClass = false)
@Service
public class CabServiceImpl implements CabService {

    @Autowired
    private CabRepository repository;

    @Override
    public List<Cab> findAll() {
        return repository.findAll();
    }

	@Override
	public List<Cab> findByCompnyId(String CompnyId) {
		return repository.findByCompnyId(CompnyId);
	}
	
	 @Override
	 public Cab update(Cab cab) {
	    return repository.save(cab);
	 }
	 
		@Override
		public Cab findBycid(int cid) {
			return repository.findByCid(cid);
		}
		
	 

}
