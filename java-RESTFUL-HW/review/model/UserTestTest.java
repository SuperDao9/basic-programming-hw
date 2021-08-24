package com.udomsin.review.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class UserTestTest {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	private String username;
	private String password;
	private int age;
	private int userid;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id", referencedColumnName = "id")
	private Address address;
	
	@OneToMany(mappedBy = "user")
	private Set<Sale> sales;
	
	
	
	public Set<Sale> getSales() {
		return sales;
	}


	public void setSales(Set<Sale> sales) {
		this.sales = sales;
	}


	@Override
	public String toString() {
		return "id " + userid + " username " + username + " Password " + password + " age " + age  ;
		// return " username " + username + " Password " + password + " age " + age  ;
	}
	
	
//	public UserTestTest(Integer id, String username, String password, int age, int userid) {
//	super();
//	this.id = id;
//	this.username = username;
//	this.password = password;
//	this.age = age;
//	this.userid = userid;
//}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}
		
	
}
