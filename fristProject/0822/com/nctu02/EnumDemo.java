package com.nctu02;

   enum WeekDay{
	   Monday, Tuesday , Wednesday , Thursday , Friday , Saturday , Sunday;
}


public class EnumDemo {
	private WeekDay restdayDay;

	public WeekDay getRestdayDay() {
		return restdayDay;
	}

	public void setRestdayDay(WeekDay restdayDay) {
		this.restdayDay = restdayDay;
	}
	
}
