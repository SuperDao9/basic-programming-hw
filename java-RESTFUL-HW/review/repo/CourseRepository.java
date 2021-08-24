package com.udomsin.review.repo;

import org.springframework.data.repository.CrudRepository;

import com.udomsin.review.model.Course;

public interface CourseRepository extends CrudRepository<Course, Integer> {


}