package com.in28minutes.oops.level2;

public class CustomerRunner {

	public static void main(String[] args) {
		Address homeAddress = new Address("line 1", "Hyderabad", "500035");
		Address workAddress = new Address("line 2", "Hyderabad", "500078");
		Customer customer = new Customer("James", homeAddress);
		customer.setWorkAddress(workAddress);

		System.out.println(customer);
	}

}
