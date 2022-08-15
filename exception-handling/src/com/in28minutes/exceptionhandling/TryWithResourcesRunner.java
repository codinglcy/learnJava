package com.in28minutes.exceptionhandling;

import java.util.Scanner;

public class TryWithResourcesRunner {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {

			int[] numbers = { 12, 3, 4, 5 };

			int number = numbers[5];
		} // TryWithResources가 자동으로 실행이 모두 끝난 다음에 scanner.close()를 불러준다.
	}
}
