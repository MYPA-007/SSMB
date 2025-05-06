package com.test.x;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestApi 
{
	CustomerRestApi()
	{
		System.out.println("CUstomer Rest Api :: Constructor");
	}
	
	@GetMapping("/customer")
	public Customer getCustomer()
	{
		Customer c=new Customer();
		
		c.setAddress("rjpt");
		c.setEmail("saitejamypa.@gmkla");
		c.setName("Teja");
		return  c;
	}
}
