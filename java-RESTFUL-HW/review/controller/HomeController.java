package com.udomsin.review.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.udomsin.review.model.UserTestTest;

@RestController
public class HomeController {
	
	@RequestMapping("/home")
	@ResponseBody
	String home2() {
	return "Hello Home!";
	}

	   @GetMapping("/home/{user_id}")
	   @ResponseBody
	   public String home3(@PathVariable("user_id") String userId,
			   @RequestParam("semester") String semester, @RequestParam("year") String year) {
		   return  "Multiple RequestParam - User_ID " + userId + " stay during = " + semester + " of the Year = " + year ;
	   }
	   
	   @PostMapping(path = "/posts/{my_input}")
	   @ResponseBody
	   public String posts(@PathVariable("my_input") String userInput) {
		   return  "User POST =  " + userInput  ;
	   }
	   
	   @GetMapping(path = "/posts2/{my_input}")
	   @ResponseBody
	   public String getPosts(@PathVariable("my_input") String userInput,
			   @RequestParam("semester") String semester, @RequestParam("classid") String classId) {
		   return  "User POST =  " + userInput + ", Semester " + semester + " , ClassID " + classId  ;
	   }
	   
	   // Request body
	   @PostMapping(path = "/testPost", consumes = { MediaType.APPLICATION_JSON_VALUE}) 
	   @ResponseBody
	   String testPost(@RequestBody UserTestTest user) {
		   return "Username = " + user.getUsername() + " Password = " + user.getPassword() + " Age = " + user.getAge() ;
	   }
	   
	   @GetMapping("/view")
	   @ResponseBody
	   String get() {
		   return "Hello GET view";
	   }
	   
	   @PostMapping("/add")
	   @ResponseBody
	   String add() {
		   return "Hello Post Add";
	   }
	   
	   @PutMapping("/update")
	   @ResponseBody
	   String update() {
		   return("Hello PUT update");
	   }
	   
	   @DeleteMapping("/delete")
	   @ResponseBody
	   String delete() {
		   return "Hello Delete";
	   }
}
