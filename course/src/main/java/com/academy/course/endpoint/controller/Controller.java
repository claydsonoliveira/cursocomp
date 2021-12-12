package com.academy.course.endpoint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.academy.core.model.Course;
import com.academy.course.endpoint.service.CourseService;

import lombok.extern.slf4j.Slf4j;

public class Controller {

	@RestController
	@RequestMapping("v1/admin/course")
	@Slf4j
	public class CourseController {

		@Autowired
		private final CourseService courseService;
		
		public CourseController(CourseService courseService) {
			this.courseService = courseService;
		}

		@GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	    public ResponseEntity<Iterable<Course>> list(Pageable pageable) {
			return new ResponseEntity<>(courseService.list(pageable), HttpStatus.OK);
		}

	}

}
