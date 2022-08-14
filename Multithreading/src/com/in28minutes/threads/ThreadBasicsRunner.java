package com.in28minutes.threads;

class Task1 extends Thread {
	@Override
	public void run() {
		System.out.print("\nTask1 Started");

		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
		}

		System.out.print("\nTask1 Done");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		System.out.print("\nTask2 Started");

		for (int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
		}

		System.out.print("\nTask2 Done");
	}

}

public class ThreadBasicsRunner {

	public static void main(String[] args)
				throws InterruptedException {

		// Task1
		System.out.println("\nTask1 Kicked Off");
		Task1 task1 = new Task1();
		task1.setPriority(10);
		//		task1.run(); // 병렬 처리 실행 x
		task1.start(); // 병렬 처리 실행 ( 스레드 형식으로 실행)

		// Task2
		System.out.println("\nTask2 Kicked Off");
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.start();

		task1.join();

		// Task3
		System.out.println("\nTask3 Kicked Off");
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}

		System.out.print("\nTask3 Done");
		System.out.print("\nMain Done");

	}

}
