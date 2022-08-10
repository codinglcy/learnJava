package com.in28minutes.oops;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book(1000);
		Book effectiveJava = new Book(1000);
		Book cleanCode = new Book(1000);

		artOfComputerProgramming.setNumOfCopies(20);
		effectiveJava.setNumOfCopies(42);
		cleanCode.setNumOfCopies(18);
	}

}
