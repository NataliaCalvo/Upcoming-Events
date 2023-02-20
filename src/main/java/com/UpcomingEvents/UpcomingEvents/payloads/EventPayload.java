package com.UpcomingEvents.UpcomingEvents.payloads;



import java.sql.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class EventPayload {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) 
    Long id;
    private String title;
    private Date date;
    private int max_users;
    private String description;
    private String image;
    private boolean available;



    public EventPayload() {
    
    }

    public EventPayload(Long id, String title, Date date, int max_users, String description, String image,
            boolean available) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.max_users = max_users;
        this.description = description;
        this.image = image;
        this.available = available;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getMax_users() {
        return max_users;
    }

    public void setMax_users(int max_users) {
        this.max_users = max_users;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
 

    
    

    
}
