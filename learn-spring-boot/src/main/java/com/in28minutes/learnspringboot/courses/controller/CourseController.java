package com.in28minutes.learnspringboot.courses.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.learnspringboot.courses.bean.Course;

@RestController
public class CourseController {

	//http://localhost:8080/courses
	@GetMapping("/courses")
	public List<Course> getAllCourses() {
		return List.of(
					new Course(1, "Learn Microservices", "in28minutes"),
					new Course(2, "Learn Full Stack", "in28minutes"));
	}

	// http://localhost:8080/courses/1
	@GetMapping("/courses/1")
	public Course getCourse1() {
		//		return List.of(new Course(1, "Learn Microservices", "in28minutes"),
		//					new Course(2, "Learn Full Stack", "in28minutes"))
		//					.stream().filter(course -> course.getId() == 1)
		//					.toList();
		return new Course(1, "Learn Microservices1", "in28minutes");
	}
}
