package com.rays.basicProgram;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParsing {

	public static void main(String[] args) throws ParseException {

		String date = "25/06/2024";
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Date d = sdf.parse(date);

		System.out.println(d + " (String To date)");
		
		Date d1 = new Date();

		String StringDate = sdf.format(d1);

		System.out.println(StringDate + " (date To String)");

	}

}
