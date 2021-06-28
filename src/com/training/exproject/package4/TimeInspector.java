package com.training.exproject.package4;

import java.util.Scanner;

public class TimeInspector {

	public static void main(String[] args) {
		Time t = new Time();
		
		Scanner sc = new Scanner(System.in);

		int h, m, s;
		
		h = 12;
		m = 23;
		s = 45;
		
		t.setHour(h);
		t.setMinute(m);
		t.setSecond(s);
		
		Time t2 = new Time(h, m, s);
		
	}

}
