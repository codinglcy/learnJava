//Getting data
package com.in28minutes.learnspringframework.sample.enterprize.flow.data;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DataService {
	public List<Integer> retreveData() {
		return Arrays.asList(12, 34, 56, 78, 90);
	}
}
