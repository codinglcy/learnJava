package com.in28minutes.threads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleCallableRunner {

	public static void main(String[] args)
				throws InterruptedException, ExecutionException {
		ExecutorService exeService = Executors.newFixedThreadPool(1);

		List<CallableTask> tasks = List.of(new CallableTask("in28Minutes"),
					new CallableTask("Ranga"), new CallableTask("Adam"));

		List<Future<String>> results = exeService.invokeAll(tasks);
		// invokeAll - 모든 task가 실행을 완료하도록 대기한 후, 결과를 얻어 낸 후에 리스트 안에 넣어주는 역할

		for (Future<String> result : results) {
			System.out.println(result.get());
		}

		exeService.shutdown();
	}

}
