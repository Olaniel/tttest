package com.training.exproject.package3;
// проектировать класс можно по разному
public class Counter {
	
	private int minValue;	
	private int maxValue;
	
	private int value;
	
	public Counter() {
		
		minValue = 0;
		maxValue = 100;
		
		value = minValue;
	}

	public Counter(int _minValue, int _maxValue) {
		if(_minValue >= _maxValue) {
			throw new RuntimeException("Invalid parameters for the counter.");
		}
		
		minValue = _minValue;
		maxValue = _maxValue;
		
		value = minValue;
	}

	public Counter(int _minValue, int _maxValue, int startValue) {
		if(_minValue >= _maxValue) {
			throw new RuntimeException("Invalid parameters for the counter.");
		}
		if(startValue < _minValue || startValue > _maxValue) {
			throw new RuntimeException("Invalid initial counter state.");
		}
		
		minValue = _minValue;
		maxValue = _maxValue;
		
		value = startValue;
	}

	public int increase() {
		int increseValue = value + 1;
		if (increseValue <= maxValue) {
			value = increseValue;
		}
		return value;
	}

	public void decrease() {
		int decreaseValue = value - 1;
		if (decreaseValue >= minValue) {
			value = decreaseValue;
		}
	}

	public int getMinValue() {
		return minValue;
	}

	public int getMaxValue() {
		return maxValue;
	}

	public int getValue() {
		return value;
	}	
	
}
