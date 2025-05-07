package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.client.WelcomeApiClient;

@RestController
public class GreetRestController {

	@Autowired
	private WelcomeApiClient apiClient;

	@GetMapping("/greet")
	public String getGreetMsg() {

		String greetResponse = "Good Morning";

<<<<<<< HEAD
		String yy="Hey Bro HOw Are Bro";
=======
String yy="Hey Bro HOw Are U";
>>>>>>> 12e82dd01920a46b6a987343d9cd846bd6f1eadb
		String welcomeResponse = apiClient.invokeWelcomeApi();

		return greetResponse + ", " + welcomeResponse;
	}
}
