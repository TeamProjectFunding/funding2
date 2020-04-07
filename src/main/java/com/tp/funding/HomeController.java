package com.tp.funding;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping(value="main")
	public String main() {
		return "main/main";
	}
	
	@RequestMapping(value="login")
	public String userLogin() {
		return "users/login";
	}
	
}
