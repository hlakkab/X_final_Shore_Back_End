package com.projetAI.XShore.services;

import com.projetAI.XShore.models.Cab;

import java.util.List;

public interface CabService {
	List<Cab> findAll();
	
    List<Cab> findByCompnyId(String CompnyId);
    
    Cab update(Cab cab);
    
    Cab findBycid(int i);
}
