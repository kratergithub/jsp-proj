package app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@RequestMapping(value = { "/", "/welcome" })
	public ModelAndView helloWorld() {

		String welcomeMessage = "<br><div style='text-align:center;'>" + "Welcome!</div><br>";

		return new ModelAndView("welcomePage", "message", welcomeMessage);
	}

}
