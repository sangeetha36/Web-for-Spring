package com.lti.controller;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.dao.UserDao;
import com.lti.model.User;
import com.lti.model.UserDTO;

@Controller
public class RegisterController {
   
	@Autowired
	private UserDao dao;
	/*
	 * no need to read the form data manually
	 * Spring can automatically populate a bean object,spring can automatically
	 * store from data in the object of a POJO class
	 */
	@RequestMapping("/register.lti")
	public String execute(UserDTO userDTO,Map<String, Object> model) {

		//code for processing the upload file
		String path = "d:/uploads/";
		String filename = userDTO.getName() + "-"+ userDTO.getProfilepic().getOriginalFilename();
		String finalpath = path + filename;
		try {
			userDTO.getProfilepic().transferTo(new File(finalpath));
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		//instead of the code below we can use the library
		//like BeanUtils or ObjectMapper for automatically
		//copying data from object to another
		
		User user = new User();
		user.setName(userDTO.getName());
		user.setAge(userDTO.getAge());
		user.setEmail(userDTO.getEmail());
		user.setCity(userDTO.getCity());
		user.setProfilePicFilename(filename);
		
		//code to store the data in the database
		dao.addUser(user);
		model.put("message","registered Successfully");		
		return "register.jsp";
	}
   
	@RequestMapping(path = "/searchUser.lti",method = RequestMethod.POST)
   public String search(@RequestParam("email")String email,
		   Map<String , Object> model) {
		User user = dao.fetch(email);
		model.put("userData", user);
		
	   return "searchResult.jsp";
   }
}
	
	

