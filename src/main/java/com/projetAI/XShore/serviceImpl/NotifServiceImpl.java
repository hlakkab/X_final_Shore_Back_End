package com.projetAI.XShore.serviceImpl;

import com.projetAI.XShore.models.Notif;
import com.projetAI.XShore.models.User;
import com.projetAI.XShore.repository.NotifRepository;
import com.projetAI.XShore.repository.UserRepository;
import com.projetAI.XShore.services.NotifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

import java.util.List;

@EnableAspectJAutoProxy(proxyTargetClass = false)
@Service
public class NotifServiceImpl implements NotifService {

    @Autowired
    private NotifRepository Notifrepository;
	@Autowired
	private UserRepository repository;

    @Override
    public List<Notif> findAll() {
        return Notifrepository.findAll();
    }

	@Override
	public List<Notif> CompareNotifToUser(int id) {

		User user= repository.findById(id);
		String from = user.getLocation();
		String to = user.getDestination();
		return Notifrepository.findByLocationAndDestination(from,to);

	}
	

}
