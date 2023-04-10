package edu.global.ex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String home() {

		return "안녕하세요";
	}

	@GetMapping("/hello")
	public String hello() {
		
		return "hello..메롱!";
	}

	@GetMapping("/world")
	public String world() {
		
		return "<h1>앗 일본이다</h1>";
	}

}
