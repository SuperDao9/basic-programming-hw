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
import com.udomsin.review.model.User;
import com.udomsin.review.repo.UserRepository;


@RestController
public class UserCrudController {
	@Autowired UserRepository userRepo;

	
	@GetMapping("/listUser")
	@ResponseBody
	Iterator<User> listUser() {
		return userRepo.findAll().iterator();
	}
	
	@PostMapping("/addUserTest")
	@ResponseBody
	String addUserTest(@RequestParam("name") String name, @RequestParam("email") String email) {
		// Add course detail
		Course course = new Course();
		course.setName("DB Relationship");
		course.setYear("2020");
		
		User user = new User();
		user.setEmail(email);
		user.setName(name); 
		
		userRepo.save(user);
		return "User " + user.getName() + " Added" ;
	}
	
	@GetMapping("/selectUserTest")
	@ResponseBody
	String selectUserTest() {
		Iterable<User> users = userRepo.findAll();
		String out = "";
		
		for (User user : users) {
			out = out + " ID: " + user.getId() + " - " + user.getName() + ", " ;
		}
		return "Finish Select User :  " + out;
	}
	
	@PutMapping(path = "/updateUserTest/{user_id}")
	@ResponseBody
	String updateUserTest(@PathVariable("user_id") int userId, @RequestParam("name") String name, @RequestParam("email") String email) {
		
		if ( !userRepo.findById(userId).isEmpty()) {
		
			User user = userRepo.findById(userId).get();
			String currentUserDetail = user.getEmail() + " name: " + user.getName();
			user.setEmail(email);
			user.setName(name);
			userRepo.save(user);
			return "Finish update users : " + currentUserDetail ;
		} else
			return "Not Update - User ID : " + userId + " Not Found " ;
		
	}
	
	@DeleteMapping(path = "/deleteUserTest/{user_id}")
	@ResponseBody
	String deleteUserTest(@PathVariable("user_id") int userId) {
		
		if ( !userRepo.findById(userId).isEmpty()) {
			User user = userRepo.findById(userId).get() ;
			userRepo.delete(user);
			return "Deleted user:  " + userId ;
		} else {
			return "User " + userId + " Not Found " ;
		}
	
	}
	
}
