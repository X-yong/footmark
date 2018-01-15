package com.xy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
/*@RequestMapping("/login")*/
public class LoginController {

	@RequestMapping("/login")
	public String login() {
		System.out.println("登录");
		return "index";
	}
	
	
	
}
