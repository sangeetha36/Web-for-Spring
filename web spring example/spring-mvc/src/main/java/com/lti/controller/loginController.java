package com.lti.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {

	@RequestMapping("/login.lti")
	public String execute(
			               @RequestParam("username") String username ,
			               @RequestParam("password") String password,
			               Map<String, Object>model) {
		if(username.equals("vijay")&& password.equals("123")) {
			model.put("loggedInUsername",username); 
			return "Welcome.jsp";
		   
		}else {
	      model.put("message","Invalid Username/Password");		
				return "login.jsp";
	}
		
	}
	
}
