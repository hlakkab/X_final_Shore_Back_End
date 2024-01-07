package com.projetAI.XShore.services;

import com.projetAI.XShore.models.Cab;
import com.projetAI.XShore.models.User;

import java.util.List;

public interface UserService {

    User create(User user);

    void createCab(Cab cab, int id);

    User delete(int id);

    List<User> findAll();

    User findById(int id);

    User update(User user);
    
    User findByEmailAndPsw(String email, String psw);

    List<Cab> getAllCabsByUserId(int userId);

}
