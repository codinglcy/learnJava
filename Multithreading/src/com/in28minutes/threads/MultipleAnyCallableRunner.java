package com.in28minutes.threads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultipleAnyCallableRunner {

	public static void main(String[] args)
				throws InterruptedException, ExecutionException {
		ExecutorService exeService = Executors.newFixedThreadPool(1);

		List<CallableTask> tasks = List.of(new CallableTask("in28Minutes"),
					new CallableTask("Ranga"), new CallableTask("Adam"));

		String result = exeService.invokeAny(tasks);
		// invokeAny - 가장 빨리 완료된 하나만 출력

		System.out.println(result);

		exeService.shutdown();
	}

}
