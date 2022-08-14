package com.in28minutes.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread {

	private int number;

	public Task(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		System.out.print("\nTask" + number + "Started");

		for (int i = number * 100; i <= number * 100 + 99; i++) {
			System.out.print(i + " ");
		}

		System.out.print("\nTask" + number + "Done");
	}
}

public class ExecutorServiceRunner {

	public static void main(String[] args) {
		//		ExecutorService exeService = Executors.newSingleThreadExecutor();
		ExecutorService exeService = Executors.newFixedThreadPool(2);

		//		exeService.execute(new Task1());
		exeService.execute(new Task(1));
		//		exeService.execute(new Thread(new Task2()));
		exeService.execute(new Task(2));
		exeService.execute(new Task(3));
		exeService.execute(new Task(4));

		//		// Task3
		//		for (int i = 301; i <= 399; i++) {
		//			System.out.print(i + " ");
		//		}
		//
		//		System.out.print("\nTask3 Done");
		//		System.out.print("\nMain Done");

		exeService.shutdown();
	}

}
