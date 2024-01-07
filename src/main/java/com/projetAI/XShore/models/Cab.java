package com.projetAI.XShore.models;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

@EnableAspectJAutoProxy(proxyTargetClass = false)
@Entity
@Table(name = "cabs")
public class Cab {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cid;
    @Column
    private String company_name;
    @Column
    private String driver_name;
    @Column
    private String source;
    @Column
    private String destination;
    @Column
    private String driver_mob;
    @Column
    private String date;
    @Column
    private String time;
    @Column
    private String compnyId;
    @Column
    private int price;
    @Column
    private int places;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPlaces() {
        return places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }
    
    public String getCompanyName() {
        return company_name;
    }

    public void setCompanyName(String company_name) {
        this.company_name = company_name;
    }
    
    public String getDriverName() {
        return driver_name;
    }

    public void setDriverName(String driver_name) {
        this.driver_name = driver_name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
    
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDriverMob() {
        return driver_mob;
    }

    public void setDriverMob(String driver_mob) {
        this.driver_mob = driver_mob;
    }
    
    public String getComanyId() {
        return compnyId;
    }

    public void setComanyId(String compnyId) {
        this.compnyId = compnyId;
    }

}