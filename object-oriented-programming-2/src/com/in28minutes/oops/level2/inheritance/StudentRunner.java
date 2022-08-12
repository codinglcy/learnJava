package com.in28minutes.oops.level2.inheritance;

public class StudentRunner {

	public static void main(String[] args) {
		//		Student student = new Student();
		//		student.setName("Ranga");
		//		student.setEmail("in28minutes@gmail.com");

		Employee employee = new Employee("Ranga");

		employee.setEmail("ranga@in28minutes.com");
		employee.setPhoneNumber("123-456-7890");

		employee.setEmployeeGrade('A');
		employee.setTitle("Programmer Analyst");
		employee.setEmployerName("James");

		System.out.println(employee);

	}

}
