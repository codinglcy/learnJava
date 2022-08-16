package com.in28minutes.concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {

	public static void main(String[] args) {
		ConcurrentMap<Character, LongAdder> occurrances = new ConcurrentHashMap<>();

		String str = "ABCD ABCD ABCD";
		for (char character : str.toCharArray()) {
			occurrances.computeIfAbsent(character, ch -> new LongAdder());

			LongAdder longAdder = occurrances.get(character);
			if (longAdder == null) {
				longAdder = new LongAdder();
			}
			longAdder.increment();
			occurrances.put(character, longAdder);
		}
		System.out.println(occurrances);
	}

}
