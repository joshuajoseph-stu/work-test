package com.Joshua.SpringBootDemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/home")
	public String getHomePage() {
		return "home";
	}
	@GetMapping("/login")
	public String getLoginPage() {
		return "login";
	}
	@GetMapping("/TrainHomeN")
	public String getTrainHomeN() {
		return "TrainHomeN";
	}
}
