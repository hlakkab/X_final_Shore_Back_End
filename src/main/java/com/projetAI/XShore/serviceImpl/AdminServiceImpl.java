package com.projetAI.XShore.serviceImpl;

import com.projetAI.XShore.repository.AdminRepository;
import com.projetAI.XShore.models.Admin;
import com.projetAI.XShore.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Service;

@EnableAspectJAutoProxy(proxyTargetClass = false)
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository repository;

   	@Override
    public Admin findByMemailAndMpassword(String Memail, String Mpassword) {
		return repository.findByMemailAndMpassword( Memail, Mpassword);
	}
}
