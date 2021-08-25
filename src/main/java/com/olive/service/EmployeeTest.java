package com.olive.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class EmployeeTest {
	
	@Scheduled(fixedDelay = 10)
	public void Test() {
		System.out.println("Welcome To schedular ....." + new Date());
	}
	
	
	/*
	@Scheduled(fixedDelay = 3000)
	public void Test1() {
		System.out.println("Welcome To schedular ....." + new Date());
	}
	*/

}
