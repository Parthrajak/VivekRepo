package com.nit.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishController extends AbstractController {

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res) throws Exception {
		// get system date and time
		Calendar cl = Calendar.getInstance();
		// get current hour of the day
		int hour = cl.get(Calendar.HOUR_OF_DAY);
		String mgs = null;

		if (hour < 12)
			mgs = "good morning";
		else if (hour < 16)
			mgs = "good afternoon";

		else if (hour < 20)
			mgs = "good evening";
		else
			mgs = "good night";
		return new ModelAndView("result", "wmsg", mgs);
	}

}
