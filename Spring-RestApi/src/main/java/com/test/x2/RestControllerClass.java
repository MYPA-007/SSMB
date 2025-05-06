package com.test.x2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerClass 
{
	public RestControllerClass()
	{
		System.out.println("msg rest controller :: constructor ");
	}
	
	@GetMapping("/welcome")
	public ResponseEntity<String> getWelcomeMsg()
	{
	String msg="welcome to RestApi";
	return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	
	
	@GetMapping("/greet")
	public String getGreetMsg()
	{
		String msg="Good Morning";
		return msg;
	}
}
