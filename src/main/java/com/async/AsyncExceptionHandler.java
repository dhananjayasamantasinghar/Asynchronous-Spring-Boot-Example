package com.async;

import java.lang.reflect.Method;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.stereotype.Component;

@Component
public class AsyncExceptionHandler implements AsyncUncaughtExceptionHandler {

	@Override
	public void handleUncaughtException(Throwable ex, Method method, Object... args) {
		System.out.println("Exception Occured in "+method.getName()+" due to "+ex.getMessage()
		+" by Thread : "+ Thread.currentThread().getName());
	}

}
