package com.in28minutes.loops;

public class myNumberRunner {

	public static void main(String[] args) {
		MyNumber number = new MyNumber(5);

		boolean isPrime = number.isPrime();
		System.out.println("isPrime " + isPrime);

		int sum = number.sumUptoN();
		System.out.println("sum " + sum);

		int sumOfDivisors = number.sumOfDivisors(); // 1과 입력숫자를 제외한 약수를 더한 값
		System.out.println("sumOfDivisors " + sumOfDivisors);

		number.printNumberTriangle();
	}

}
