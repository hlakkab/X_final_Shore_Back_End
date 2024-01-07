package com.projetAI.XShore.services;


import com.projetAI.XShore.models.Admin;

public interface AdminService {
	 Admin findByMemailAndMpassword(String Memail, String Mpassword);
}
