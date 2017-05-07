package com.besoft.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.besoft.dao.EventDao;
import com.besoft.model.Event;

@Controller
public class EventController {
	
	@RequestMapping(value = "/event", method = RequestMethod.GET)
	public String getEventViewDisplay(Model model){
		EventDao eventDao = new EventDao();
		 Event event = eventDao.getEvent();
		model.addAttribute("event", event);
		return "event";
	}

}
