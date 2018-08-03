package app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import data.SimpleData;

@Controller
public class SimpleDataController {

	@RequestMapping("/simpleData")
	public ModelAndView simpleDataScriptlet() {

		String firstUser = SimpleData.getFirstUser();
		String firstPlace = SimpleData.getFirstPlace();
		
		String dataResult = "<br>User: " + firstUser + "<br> Place: " + firstPlace + "<br>";
		
		return new ModelAndView("simpleData", "result", dataResult);

		/*
		List<String> dataResult = new ArrayList<String>();
		dataResult.add(firstUser);
		dataResult.add(firstPlace);
		
		return new ModelAndView("simpleData", "result", dataResult);
		*/
	}
	
}
