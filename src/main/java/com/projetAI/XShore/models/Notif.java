package com.projetAI.XShore.models;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.persistence.*;

@EnableAspectJAutoProxy(proxyTargetClass = false)
@Entity
@Table(name = "Notification")
public class Notif {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String location;
    @Column
    private String destination;
    @Column
    private String message;
	
    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}