package com.UpcomingEvents.UpcomingEvents.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UpcomingEvents.UpcomingEvents.models.Event;

public interface EventRepository extends JpaRepository<Event,Long>{
    
}
