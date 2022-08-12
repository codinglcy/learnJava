package com.in28minutes.oops.level2.exerciseinterfaceandabstractclass;

public class AnimalRunner {

	public static void main(String[] args) {
		Animal[] animals = { new Dog(), new Cat() };

		for (Animal animal : animals) {
			animal.bark();
		}
	}

}
