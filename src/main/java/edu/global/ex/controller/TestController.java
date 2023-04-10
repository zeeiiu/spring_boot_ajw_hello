package edu.global.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {

	@GetMapping("/test")
	public String test() {
		
		return "test"; // test.jsp  
	}

	@GetMapping("/test2")
	public String test2() {
		
		return "test/test2"; // test.jsp  
	}
	
	@GetMapping("/test/test3")
	public String test3() {
		
		return "test/test3"; // test.jsp  
	}
	

	@RequestMapping("/test4")
	public String test4() {
		
		return "test/test4"; // test.jsp  
	}

}
