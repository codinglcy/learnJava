//Business Logic
package com.in28minutes.learnspringframework.sample.enterprize.flow.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.in28minutes.learnspringframework.sample.enterprize.flow.data.DataService;

@Component
public class BusinessService {

	@Autowired
	private DataService dataService;

	public long calculateSum() {
		List<Integer> data = dataService.retreveData();

		return data.stream().reduce(Integer::sum).get();
	}
}