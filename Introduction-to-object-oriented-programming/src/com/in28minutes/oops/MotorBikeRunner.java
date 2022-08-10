package com.in28minutes.oops;

public class MotorBikeRunner {

	public static void main(String[] args) {

		MotorBike ducati = new MotorBike(200);
		MotorBike honda = new MotorBike(100);

		ducati.start();
		honda.start();

		ducati.setSpeed(100);
		ducati.increaseSpeed(100);
		ducati.decreaseSpeed(50);

		System.out.println(ducati.getSpeed());

		honda.setSpeed(80);
		honda.increaseSpeed(100);
		honda.decreaseSpeed(50);

		System.out.println(honda.getSpeed());

	}

}
