package com.ibm.service;

import java.util.Calendar;




public class WishServiceImpl implements WishService {

	@Override
	public String generateWishMsg() {

		Calendar cl = Calendar.getInstance();

		int hour = cl.get(Calendar.HOUR_OF_DAY);

		if (hour <= 12)

			return "GoodMorning";
		else if (hour <= 16)

			return "Good After noon";
		else if (hour <= 16)
			return "Good evening";

		else

			return "Good Night";
	}

}
