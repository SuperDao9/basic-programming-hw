package com.udomsin.review.controller;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.udomsin.review.model.Course;
import com.udomsin.review.repo.CourseRepository;

@RestController
public class CourseCrudController {

	@Autowired CourseRepository courseRepo;
	
	@PostMapping("/addCourseTest")
	@ResponseBody
	String addCourseTest(@RequestParam("name") String name, @RequestParam("year") String year, @RequestParam("credit") String credit) {
		Course course = new Course();
		course.setName(name);
		course.setYear(year);
		course.setCredit(credit);
		
		courseRepo.save(course);
		return "Course Added";
		
	}
	
	@GetMapping("/listCourse")
	@ResponseBody
	Iterator<Course> listCourse() {
		return courseRepo.findAll().iterator();
	}
	   
	
	@GetMapping("/selectCourseTest")
	@ResponseBody
	String selectCourseTest() {
		Iterable<Course> courses = courseRepo.findAll();
		String out = "";
		
		for (Course course : courses) {
			out = out + " ID: " + course.getIdcourse() + " - " + course.getName() + " " + course.getYear() +  ", " ;
		}
		return "Finish Select Course :  " + out;
		
	}

	@PutMapping(path = "/updateCourseTest/{course_id}")
	@ResponseBody
	String updateUserTest(@PathVariable("course_id") int courseId, @RequestParam("name") String name, 
			@RequestParam("year") String year, 
			@RequestParam("credit") String credit) {
		
		if ( !courseRepo.findById(courseId).isEmpty()) {
		
			Course course = courseRepo.findById(courseId).get();
			String currentCourseDetail = course.getName() + " year " + course.getYear();
			course.setName(name);
			course.setYear(year);
			course.setCredit(credit);
			courseRepo.save(course);
			
			return "Finish update course : " + currentCourseDetail ;
		} else
			return "Not Update - Course ID : " + courseId + " Not Found " ;
		
	}
	
	@DeleteMapping(path = "/deleteCourseTest/{course_id}")
	@ResponseBody
	String deleteCourseTest(@PathVariable("course_id") int courseId) {
		
		if ( !courseRepo.findById(courseId).isEmpty()) {
			Course course = courseRepo.findById(courseId).get() ;
			courseRepo.delete(course);
			return "Deleted course:  " + courseId ;
		} else {
			return "Course " + courseId + " Not Found " ;
		}
	
	}
	
}
