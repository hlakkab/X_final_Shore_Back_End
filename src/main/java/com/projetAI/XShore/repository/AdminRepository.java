package com.projetAI.XShore.repository;

import com.projetAI.XShore.models.Admin;
import org.springframework.data.repository.Repository;


public interface AdminRepository extends Repository<Admin, Integer> {
	 Admin findByMemailAndMpassword(String Memail, String Mpassword);
}
