package com.gw.SpringBootTest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {
	
	@RequestMapping("/logininfo")
	public String LoginInfo()
	{
		return "LoginSuccess";
	}
}
