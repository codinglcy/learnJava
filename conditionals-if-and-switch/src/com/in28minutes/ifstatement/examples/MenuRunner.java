package com.in28minutes.ifstatement.examples;

import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// 입력 받은 수 그대로 다시 출력하기

		//		System.out.print("Enter Number1: ");
		//		int number1 = scanner.nextInt();
		//		System.out.println("The number you entered is... " + number1);

		// 두 수를 입력받고 연산 선택지를 준 후 선택 입력 받고 두 수를 연산한 결과 출력

		System.out.println("Enter Number1:");
		int num1 = scanner.nextInt();
		System.out.println();

		System.out.println("Enter Number2:");
		int num2 = scanner.nextInt();
		System.out.println();

		System.out.println("1 - Add");
		System.out.println("2 - Substract");
		System.out.println("3 - Divide");
		System.out.println("4 - Multiply");

		System.out.print("Choose Operation: ");
		int oper = scanner.nextInt();
		System.out.println();

		// int result = performOperationUsingNestedIfElse(num1, num2, oper);
		int result = performOperationUsingSwitch(num1, num2, oper);

		System.out.println("Result is... " + result);

	}

	private static int performOperationUsingNestedIfElse(int num1, int num2, int oper) {
		int result;
		if (oper == 1) {
			result = num1 + num2;
		} else if (oper == 2) {
			result = num1 - num2;
		} else if (oper == 3) {
			result = num1 / num2;
		} else if (oper == 4) {
			result = num1 * num2;
		} else {
			result = 0;
			System.out.println("Invalid operation!!");
		}
		return result;
	}

	private static int performOperationUsingSwitch(int num1, int num2, int oper) {
		int result;
		switch (oper) {
		case 1:
			result = num1 + num2;
		case 2:
			result = num1 - num2;
		case 3:
			result = num1 / num2;
		case 4:
			result = num1 * num2;
		default:
			result = 0;
			System.out.println("Invalid operation!!");
		}
		return result;
	}

}
