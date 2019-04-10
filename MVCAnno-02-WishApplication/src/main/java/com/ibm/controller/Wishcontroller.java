package com.ibm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ibm.service.WishService;

@Controller
public class Wishcontroller {
	
	private WishService service;
	
	@RequestMapping("wish.htm")
	public ModelAndView process() {
		String msg=null;
		msg=service.generateWishMsg();
		return new ModelAndView("result","msg",msg);
		
	}

}
