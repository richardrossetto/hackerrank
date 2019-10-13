package com.hackerrank.Challenge;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

/**
The Calendar class is an abstract class that provides methods for converting between a 
specific instant in time and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, 
HOUR, and so on, and for manipulating the calendar fields, such as getting the date of the next week.
You are given a date. You just need to write the method, getDay , which returns the day on that date. 
To simplify your task, we have provided a portion of the code in the editor.
For example, if you are given the date August 14th 2017, the method should return MONDAY as the day on that date.
**/

public class JavaDateTime {
	public static void main(String[] args) {
		System.out.println(findDay(13, 12, 2019));
	}

	public static String findDay(int month, int day, int year) {
		Calendar cal = Calendar.getInstance();
		cal.set(year, month -1, day);
		System.out.println(cal.getTime());
		
		return new SimpleDateFormat("EEEE", Locale.ENGLISH).format(cal.getTime()).toUpperCase();
	}

}
