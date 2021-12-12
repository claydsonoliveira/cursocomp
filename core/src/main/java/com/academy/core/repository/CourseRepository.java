package com.academy.core.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.academy.core.model.Course;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
	
}
