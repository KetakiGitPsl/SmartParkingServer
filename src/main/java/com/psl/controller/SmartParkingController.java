package com.psl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.psl.entity.ParkingSlot;
import com.psl.service.SmartParkingService;

@Controller
public class SmartParkingController {
	@Autowired
	private SmartParkingService service;

	@RequestMapping(value="/" , method=RequestMethod.GET)
	public ModelAndView showHomePage(Model model){
		
		List<ParkingSlot> list = service.getAllParkingSlots();
		System.out.println("** " + list);
		
		ModelAndView mv = new ModelAndView("home");
		mv.addObject("list", list);
		return mv;
	}

	@RequestMapping(value="/updateSlot" , method=RequestMethod.PUT)
	public void updateParkingSlot(@RequestBody ParkingSlot s){
		service.updateParkingSlot(s.getSlotId(), s.getIsAvailable());
	}

	

}
