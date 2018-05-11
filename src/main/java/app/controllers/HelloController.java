package app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	// @RequestMapping(value = { "/", "/hello" }, method = RequestMethod.GET)
	@RequestMapping("/hello")
	public ModelAndView helloWorld() {

		return new ModelAndView("helloPage", "HelloMessage", "Welcome!");
	}

}
