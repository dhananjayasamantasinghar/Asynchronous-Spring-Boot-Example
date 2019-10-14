package com.async.service;

import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {

	@Async
	public void sendMessage() throws Exception{
		TimeUnit.SECONDS.sleep(10);
		System.out.println("Execute method asynchronously. "
			      + Thread.currentThread().getName());
		System.out.println(10/0);
	}
}
