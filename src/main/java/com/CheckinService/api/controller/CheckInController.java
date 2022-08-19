package com.CheckinService.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/checkin")
public class CheckInController {
	
	@GetMapping("/checkin")
	public String gethello()
	{
		return "hello world";
	}
}
