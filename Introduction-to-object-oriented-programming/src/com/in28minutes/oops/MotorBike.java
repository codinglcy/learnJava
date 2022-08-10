package com.in28minutes.oops;

public class MotorBike {
	// state
	private int speed;

	MotorBike() {
		this(150);
	}

	MotorBike(int speed) {
		this.speed = speed;
	}

	// behavior
	void start() {
		System.out.println("Bike Started");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}

	public void increaseSpeed(int howMuch) {
		this.speed = this.speed + howMuch;
	}

	public void decreaseSpeed(int howMuch) {
		this.speed = this.speed - howMuch;
	}
}
