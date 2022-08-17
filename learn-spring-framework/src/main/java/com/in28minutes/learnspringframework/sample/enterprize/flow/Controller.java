package com.in28minutes.learnspringframework.sample.enterprize.flow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.learnspringframework.sample.enterprize.flow.business.BusinessService;

//Sending response
@RestController
public class Controller {

	@Autowired
	private BusinessService businessService;


	// "/sum" => 값 반환
	@GetMapping("/sum")
	public long displaySum() {
		return businessService.calculateSum();
	}
}

