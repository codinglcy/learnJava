package com.in28minutes.oops.level2.inheritance;

public class Student extends Person {
	private String colleageName;
	private int year;

	public Student(String name) {
		super(name);
	}

	public String getColleageName() {
		return colleageName;
	}

	public void setColleageName(String colleageName) {
		this.colleageName = colleageName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
