package com.in28minutes.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableTask implements Callable<String> {

	private String name;

	public CallableTask(String name) {
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Hello " + name;
	}

}

public class CallableRunner {

	public static void main(String[] args)
				throws InterruptedException, ExecutionException {
		ExecutorService exeService = Executors.newFixedThreadPool(1);
		Future<String> welcomeFuture = exeService
					.submit(new CallableTask("in28Minutes"));
		System.out.println("\nnew CallableTask(\"in28Minutes\") executed");

		String welcomeMessage = welcomeFuture.get();

		System.out.println(welcomeMessage);

		System.out.println("\nMain Completed");
	}

}
