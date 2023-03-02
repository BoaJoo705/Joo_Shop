package kr.inhatc.spring.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.inhatc.spring.test.dto.TestDto;

@RestController
public class TestController {
	
	@GetMapping(value="/")
	public String hello() {
		return "Hello World";
	}
	
	@GetMapping("/test")
	public TestDto test() {
		TestDto dto = new TestDto();
		dto.setName("콩이");
		dto.setAge(7);
		return dto;
	}
}
