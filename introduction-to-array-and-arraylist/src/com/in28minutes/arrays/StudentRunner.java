package com.in28minutes.arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		Student student = new Student("Ranga", 99, 98, 100);

		int number = student.getNumberOfMarks();
		System.out.println("number of marks " + number);

		int sum = student.getTotalSumOfMarks();
		System.out.println("total sum of marks " + sum);

		int maximumMark = student.getMaximumMark();
		System.out.println("maximum mark " + maximumMark);

		int minimumMark = student.getMinimumMark();
		System.out.println("minimum mark " + minimumMark);

		BigDecimal average = student.getAverageMarks();
		System.out.println("average mark " + average);

		System.out.println(student);

		student.addNewMark(35);
		System.out.println(student);

		student.removeMarkAtIndex(1);
		System.out.println(student);

	}

}
