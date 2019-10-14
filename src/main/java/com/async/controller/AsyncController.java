package com.async.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.async.service.AsyncService;

@RestController
public class AsyncController {
	
	@Autowired
	private AsyncService service;

	@GetMapping("/send")
	public ResponseEntity<String> send() throws Exception{
		service.sendMessage();
		String message = "Sent Async message successfully by Thread : "+ Thread.currentThread().getName();
		System.out.println(message);
		return ResponseEntity.ok(message);
		
	}
}
