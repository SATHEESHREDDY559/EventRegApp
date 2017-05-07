package com.besoft.dao;

import com.besoft.model.Event;

public class EventDao {
	Event event = new Event();
	public Event getEvent(){
		event.setEventName("GradWalk");
		event.setEventLocation("Warrensburg");
		return event;
	}
	

}
