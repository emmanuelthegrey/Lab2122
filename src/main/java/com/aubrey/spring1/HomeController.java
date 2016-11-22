package com.aubrey.spring1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/enroll", method = RequestMethod.POST)
	public String home(Model model, HttpServletRequest request) {
		//System.out.println(request.getQueryString());


		
		
//		logger.info("Welcome home! The client locale is {}.", locale);
//		
//		Date date = new Date();
//		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
//		
//		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("fn", request.getParameter("firstname"));
		model.addAttribute("ln", request.getParameter("lastname"));
		model.addAttribute("email", request.getParameter("email"));
		model.addAttribute("Java", request.getParameter("choice"));

		return "home";
	}
	@RequestMapping(value = "/order", method = RequestMethod.GET)
	public String order(Model model, HttpServletRequest request) {
		String[] fruits = request.getParameterValues("fruit");
		
		model.addAttribute("pizza", request.getParameter("pizza"));
		model.addAttribute("fruits", fruits);
		
		return "orderProcess";
	}

}
