package com.howtodoinjava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.howtodoinjava.entity.CabEntity;
import com.howtodoinjava.service.CabManager;

@Controller
public class CabsController {
	
	@Autowired(required=true)
	private CabManager cabmanager;
	
	@RequestMapping(value = "/cabs", method = RequestMethod.GET)
	public String listCabs(ModelMap map) {
		System.out.println(cabmanager.getAllCabs());
		map.addAttribute("cab", new CabEntity());
		map.addAttribute("cabList", cabmanager.getAllCabs());
		return "cabListPage";
	}
	
	@RequestMapping(value="/home")
	public ModelAndView mainPage() {
		return new ModelAndView("home");
	}
}
