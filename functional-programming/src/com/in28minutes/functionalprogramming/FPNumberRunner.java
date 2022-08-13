package com.in28minutes.functionalprogramming;

import java.util.List;

public class FPNumberRunner {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(4, 6, 8, 13, 3, 15);

		//		numbers.stream().forEach(num -> System.out.println(num));

		int sumodds = fpSumOdds(numbers);
		int sumevens = fpSumEvens(numbers);

		System.out.println(sumodds);
		System.out.println(sumevens);

		System.out.println(fpSum(numbers));
		System.out.println(normalSum(numbers));
	}

	private static int normalSum(List<Integer> numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number; // mutations
		}
		return sum;
	}

	private static int fpSum(List<Integer> numbers) {
		return numbers.stream().reduce(0, (number1, number2) -> number1 + number2);
	}

	private static int fpSumEvens(List<Integer> numbers) {
		int sumevens = numbers.stream().filter(num -> num % 2 == 0).reduce(0, (number1, number2) -> number1 + number2);
		return sumevens;
	}

	private static int fpSumOdds(List<Integer> numbers) {
		int sumodds = numbers.stream().filter(num -> num % 2 == 1).reduce(0, (number1, number2) -> number1 + number2);
		return sumodds;
	}


}
