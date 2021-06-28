package com.training.exproject.package3;

public class CounterInspector {

	public static void main(String[] args) {
		Counter counter = new Counter(-3, 3);
		Counter counter1 = new Counter();
		
		int x = counter.increase();
		System.out.println(counter.getValue());
		x = counter.decrease();
		System.out.println(counter.getValue());
		
		System.out.pr
	}

}
