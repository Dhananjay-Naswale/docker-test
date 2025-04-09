package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	//http:localhost:8080/world
		@GetMapping("/world")
		public String getMessage() {
			return "Hello world Pankaj Sir Academy";
		}
}
