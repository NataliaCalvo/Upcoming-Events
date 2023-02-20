package com.UpcomingEvents.UpcomingEvents.models;

import java.util.List;

import javax.persistence.*;



@Entity
@Table(name = "users" )

public class User {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name= "id_user")
    private Long id;
    private String name;
    private String password;
    private String rol;
    @ManyToMany
    private List<Event> events;


    public User() {
    }


    public User(Long id, String name, String password, String rol, List<Event> events) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.rol = rol;
        this.events = events;
    }
    

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }


    public String getRol() {
        return rol;
    }


    public void setRol(String rol) {
        this.rol = rol;
    }


    public List<Event> getEvents() {
        return events;
    }


    public void setEvents(List<Event> events) {
        this.events = events;
    }

    

    

    
}
