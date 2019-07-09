package com.lti.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

//Data Transfer Object
public class UserDTO {

	private String name;
	private int age;
	private String email;
	private String city;
	private MultipartFile profilepic;
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", email=" + email + ", city=" + city + ", getName()="
				+ getName() + ", getAge()=" + getAge() + ", getEmail()=" + getEmail() + ", getCity()=" + getCity()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public MultipartFile getProfilepic() {
		return profilepic;
	}
	public void setProfilepic(MultipartFile profilepic) {
		this.profilepic = profilepic;
	}
	
	
}
