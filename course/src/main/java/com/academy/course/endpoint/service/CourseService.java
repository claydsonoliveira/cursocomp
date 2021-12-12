package com.academy.course.endpoint.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.academy.core.model.Course;
import com.academy.core.repository.CourseRepository;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class CourseService {

	@Autowired
	private final CourseRepository courseRepository;
	
	public CourseService(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	public Iterable<Course> list (Pageable pageable){
		return courseRepository.findAll(pageable);
	}
	
}
