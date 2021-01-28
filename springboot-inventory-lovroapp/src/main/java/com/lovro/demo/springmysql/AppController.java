package com.lovro.demo.springmysql;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AppController {
	
	/**
	 * Start page
	 * @return
	 */
	@GetMapping("")
	public String viewHomePage() {
		return "index";
	}

}
