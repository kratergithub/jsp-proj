package app.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import data.SimpleData;

@Controller
public class SimpleDataController {

	@RequestMapping("/simpleData")
	public ModelAndView simpleDataScriptlet() {

		Map<String, Object> dataResult = new HashMap<String, Object>();

		String firstUser = SimpleData.getFirstUser();
		String firstPlace = SimpleData.getFirstPlace();
		String randomUser = SimpleData.getRandomUser();

		dataResult.put("firstUser", firstUser);
		dataResult.put("firstPlace", firstPlace);
		dataResult.put("randomUser", randomUser);

		return new ModelAndView("simpleData", "result", dataResult);
	}

}
