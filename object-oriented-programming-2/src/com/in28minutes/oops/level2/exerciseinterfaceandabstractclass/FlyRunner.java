package com.in28minutes.oops.level2.exerciseinterfaceandabstractclass;

public class FlyRunner {

	public static void main(String[] args) {
		Flyable[] flyingObjects = { new Bird(), new Airplane() };

		for (Flyable flyingObject : flyingObjects) {
			flyingObject.fly();
		}

	}

}
