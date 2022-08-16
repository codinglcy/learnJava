package com.in28minutes.concurrency;

public class Counter {
	private int i;

	synchronized public void increment() {
		i++;
	}

	public int getI() {
		return i;
	}

}
