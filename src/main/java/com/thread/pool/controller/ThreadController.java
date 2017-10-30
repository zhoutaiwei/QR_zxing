package com.thread.pool.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThreadController {

	@RequestMapping("/test")
	public String goTest(){
		return "success";
	}
}
