package com.projetAI.XShore.repository;

import com.projetAI.XShore.models.Notif;
import com.projetAI.XShore.models.User;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface NotifRepository extends Repository<Notif, Integer> {

    List<Notif> findAll();
    List<Notif> findByLocationAndDestination(String from,String to);

}
