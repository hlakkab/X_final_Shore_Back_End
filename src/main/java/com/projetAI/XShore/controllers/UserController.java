package com.projetAI.XShore.controllers;

import com.projetAI.XShore.models.Cab;
import com.projetAI.XShore.models.Notif;
import com.projetAI.XShore.models.User;
import com.projetAI.XShore.services.NotifService;
import com.projetAI.XShore.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping({"/users"})
@EnableAspectJAutoProxy(proxyTargetClass = false)
public class UserController {
	
    @Autowired
    private UserService userService;
    @Autowired
    private NotifService notifService;

    @PostMapping
    public User create(@RequestBody User user){
        return userService.create(user);
    }

    @GetMapping(path = {"/{id}"})
    public User findOne(@PathVariable("id") int id){
        return userService.findById(id);
    }
        
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public User findByEmailAndPsw(@RequestBody User loginUser) 
	{
		return userService.findByEmailAndPsw(loginUser.getEmail(),loginUser.getPassword());
	}
    
    @PutMapping(path = {"/{id}"})
    public User update(@PathVariable("id") int id, @RequestBody User user){
        user.setId(id);
        return userService.update(user);
    }

    @DeleteMapping(path ={"/{id}"})
    public User delete(@PathVariable("id") int id) {
        return userService.delete(id);
    }

    @GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }

    @GetMapping("user/{id}")
    public User getClientInfo(@PathVariable("id") int id) {
        return userService.findById(id);
    } // New

    @GetMapping("cabs/{id}")
    public List<Cab> findAllCabsByUserId(@PathVariable("id") int id){
        return userService.getAllCabsByUserId(id);
    } //New

    @PostMapping("addCab/{id}")
    public void create(@PathVariable("id") int id,@RequestBody Cab cab){
        userService.createCab(cab,id);
    } //T9d dir prob

    @GetMapping("notif/{id}")
    public List<Notif> findnotif(@PathVariable("id") int id){
        return notifService.CompareNotifToUser(id);
    }

}
