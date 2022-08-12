package com.in28minutes.oops.level2;

public class Address {
	private String line;
	private String city;
	private String zip;

	public Address(String line, String city, String zip) {
		super();
		this.line = line;
		this.city = city;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return String.format("line - %s, city - %s, zip - %s", line, city, zip);
	}

}
