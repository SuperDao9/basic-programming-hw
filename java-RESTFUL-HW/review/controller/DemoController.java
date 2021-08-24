package com.udomsin.review.controller;

import java.util.ArrayList;
import java.util.Iterator;

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
	public class DemoController {
	@RequestMapping("/")
	@ResponseBody
	String home() {
	return "Hello Super Dao World!";
	}

	ArrayList<UserTestTest> userList = new ArrayList<UserTestTest>();

	   @GetMapping("/users")
	   @ResponseBody
	   Iterator<UserTestTest> userGet() {
		   return userList.iterator();
	   }
	 
		// Request body
		@PostMapping(path = "/users", consumes = { MediaType.APPLICATION_JSON_VALUE}) 
		@ResponseBody
		String userPost(@RequestBody UserTestTest user) {
				userList.add(user); 
			    return "Added User-ID = " + user.getUserid() + ", Username = " + user.getUsername() + " Password = " + user.getPassword() + " Age = " + user.getAge() ;
		}
	   
	
		// Use username as Key, allow to update only password and age
		@PutMapping(path = "/users/{user_id}", consumes = { MediaType.APPLICATION_JSON_VALUE}) 
		@ResponseBody
		String userPut(@PathVariable("user_id") int userId , @RequestBody UserTestTest user) {
			  Iterator<UserTestTest> iterator = userList.iterator();
			   while(iterator.hasNext()) {
			      UserTestTest next = iterator.next();
			      if(next.getUserid() == userId) {
			    	  next.setUsername(user.getUsername());
			    	  next.setPassword(user.getPassword());
			    	  next.setAge(user.getAge());
			    	  break;
			      }
			   }
		    return("Updated User ID : " + userId + ", Username = " + user.getUsername() + " , password = " + user.getPassword());
	    }

	   // @DeleteMapping(path = "/users", consumes = { MediaType.APPLICATION_JSON_VALUE}) 
		// user_id = username
	   @DeleteMapping(path = "/users/{user_id}")
	   @ResponseBody
	   String userDelete(@PathVariable("user_id") int userId) {
		   Iterator<UserTestTest> iterator = userList.iterator();
		   while(iterator.hasNext()) {
		      UserTestTest next = iterator.next();
		      // if(next.getUsername().equals(userId)) {
		      if(next.getUserid() == userId) {
		          iterator.remove();
		      }
		   }
		   return "Deleted User : " + userId ;
	   }
}


