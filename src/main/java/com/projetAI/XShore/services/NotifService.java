package com.projetAI.XShore.services;

import com.projetAI.XShore.models.Notif;
import com.projetAI.XShore.models.Trips;

import java.util.List;

public interface NotifService {

	List<Notif> findAll();

    List<Notif> CompareNotifToUser(int id);

}
