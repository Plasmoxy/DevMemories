package com.matrixerrorseb.main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Main {
	
	public static void main(String[] args){
		
		Calendar kalendar = Calendar.getInstance();
		DateFormat formatData = new SimpleDateFormat("d.MMMM yyyy H:mm");
		System.out.println(formatData.format(kalendar.getTime()));
		
	}

}
