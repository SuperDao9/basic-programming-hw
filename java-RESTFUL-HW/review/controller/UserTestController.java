package com.udomsin.review.controller;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.udomsin.review.exception.InputFieldException;
import com.udomsin.review.model.Address;
import com.udomsin.review.model.Sale;
import com.udomsin.review.model.UserTestTest;
import com.udomsin.review.repo.AddressRepository;
import com.udomsin.review.repo.SaleRepository;
import com.udomsin.review.repo.UserTestRepository;

@RestController
public class UserTestController {
	
	private static final Logger logger = LoggerFactory.getLogger(InputFieldException.class);
	
	//PropertiesConfigurator is used to configure logger from properties file
	// PropertyConfigurator.configure("log4j.properties");
    
	@Autowired UserTestRepository userTestRepo;
	@Autowired AddressRepository addressRepo;
	@Autowired SaleRepository saleRepo;
	
	@GetMapping("/test")
	@ResponseBody
	String test() {
		System.out.println(1/0);
		return "";
	}
	
	@GetMapping("/userTest")
	@ResponseBody
	Iterator<UserTestTest> listUser() {
		return userTestRepo.findAll().iterator();
	}

	
	@ResponseStatus(value=HttpStatus.CONFLICT, reason="Input field is wrong.")  
	@ExceptionHandler(InputFieldException.class)
	public void handleInputFieldException(InputFieldException ife) {
	    // InputFieldException ife = new InputFieldException();
		// Nothing to do …
		System.out.println("Handle Input Field Exception - UserNameWrong=" + ife.isUserIdWrong() + ", PasswordWrong=" + ife.isPasswordWrong() 
		+ ", AgeWrong=" + ife.isAgeWrong() + ", UserIdWrong=" + ife.isUserIdWrong());
		
		// Logger
		logger.debug("This is Debug");
		logger.info(" MyInfor: ");
		logger.warn(" Warning: ");
		logger.error(" Error: UserNameWrong=" + ife.isUserIdWrong() + ", PasswordWrong=" + ife.isPasswordWrong() 
		+ ", AgeWrong=" + ife.isAgeWrong() + ", UserIdWrong=" + ife.isUserIdWrong());
		
	}
	
	
	@PostMapping(path = "/userTest", consumes = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	String addUserTest(@RequestBody UserTestTest user) throws InputFieldException {
		
		if(user.getAge() > 100 || user.getAge() < 0) {
			throw new InputFieldException(false, false, true, false);
			// will exit here and not continue 
		}
		if(user.getPassword().length() == 0) {
			throw new InputFieldException(false, true, false, false);
		}
		
		
		// Add Address
		Address address = new Address();
//		address.setAddressNumber("27/42");
//		address.setRoad("Silom Rd");
//		address.setProvince("Bangkok");
	
		address = user.getAddress();
		user.setAddress(address);
		

		
		Set<Sale> sales = new HashSet<Sale>();
		
		Sale sale1 = new Sale();
		sale1.setName("Oak");
		sale1.setSalary(10000);

		sales.add(sale1);
		
		Sale sale2 = new Sale();
		sale2.setName("Thee");
		sale2.setSalary(20000);

		sales.add(sale2);
		
		userTestRepo.save(user);
		sale1.setUser(user);
		sale2.setUser(user);
		
		saleRepo.save(sale1);
		saleRepo.save(sale2);
		user.setSales(sales);
		
	
		return "Added user : " + user.getUsername() + " , password : " + user.getPassword()  ;
	}
	
//	@GetMapping("/selectUserTest")
//	@ResponseBody
//	String selectUserTest() {
//		Iterable<UserTestTest> users = userTestRepo.findAll();
//		String out = "";
//		
//		for (UserTestTest user : users) {
//			out = out + " ID: " + user.getId() + " - " + user.getUsername() + ", " 
//		}
//		return "Finish Select User :  " + out;
//	}
	
	@PutMapping(path = "/userTest/{user_id}", consumes = { MediaType.APPLICATION_JSON_VALUE} )
	@ResponseBody
	String updateUserTest(@PathVariable("user_id") int userId, @RequestBody UserTestTest user) {	
		
		if ( !userTestRepo.findById(userId).isEmpty()) {
			// 1. Get User by ID
			UserTestTest userFromDB = userTestRepo.findById(userId).get();
			Address newAddress = new Address();
			
			// 2. Assign New Value
			// userFromDB.setAddress(user.getAge());
			userFromDB.setPassword(user.getPassword());
			userFromDB.setAge(user.getAge());
			userFromDB.setUsername(user.getUsername());
			userFromDB.setUserid(user.getUserid());
			
			// 3. Assign new address
			newAddress.setAddressNumber(user.getAddress().getAddressNumber());
			newAddress.setRoad(user.getAddress().getRoad());
			newAddress.setProvince(user.getAddress().getProvince());
			
			userFromDB.setAddress(newAddress);
			userTestRepo.save(userFromDB);
			
			return "Finish update users : " + user.getUsername() ;
		} else
			return "Not Update - User ID : " + userId + " Not Found " ;
		
	}
	
	@DeleteMapping(path = "/userTest/{user_id}")
	@ResponseBody
	String deleteUserTest(@PathVariable("user_id") int userId) {
		
		if ( !userTestRepo.findById(userId).isEmpty()) {
			UserTestTest user = userTestRepo.findById(userId).get() ;
			userTestRepo.delete(user);
			return "Deleted user:  " + userId ;
		} else {
			return "User " + userId + " Not Found " ;
		}
	
	}
	
}
