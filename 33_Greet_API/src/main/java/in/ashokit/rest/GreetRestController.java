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
		String x="Odewa Monkey D Luffy";
		String greetResponse = "Good Morning";
		String yy="Hey Bro HOw Are Bro";
		String yy="Hey Bro HOw Are U";
		String welcomeResponse = apiClient.invokeWelcomeApi();
		return greetResponse + ", " + welcomeResponse;
	}
}
