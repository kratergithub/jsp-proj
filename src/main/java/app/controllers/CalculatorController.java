package app.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CalculatorController {

	@GetMapping("/calculator")
	public ModelAndView calculatorGet() {

		return new ModelAndView("calculator", "operationresult", "");
	}

	@PostMapping("/calculator")
	public ModelAndView calculatorPost(HttpServletRequest request) {

		String operationType = request.getParameter("operation");
		String operationResult = "";

		Map<String, Object> operationDataAndResult = new HashMap<String, Object>();
		
		try {
			int op1 = Integer.parseInt(request.getParameter("op1"));
			int op2 = Integer.parseInt(request.getParameter("op2"));

			operationDataAndResult.put("op1", op1);
			operationDataAndResult.put("op2", op2);
			
			if ("addition".equals(operationType)) {
				operationResult = String.valueOf(op1 + op2);
			} else if ("multiplication".equals(operationType)) {
				operationResult = String.valueOf(op1 * op2);
			} else {
				operationResult = "ERROR";
			}
		} catch (NumberFormatException e) {
			operationResult = "ERROR";
		}
		operationDataAndResult.put("operationResult", operationResult);

		return new ModelAndView("calculator", "operationDataAndResult", operationDataAndResult);
	}

}
