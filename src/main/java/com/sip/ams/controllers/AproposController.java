package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AproposController {
	
	@GetMapping("/about")
	public String getPage() {
		return "dashboard/about";
	}

}
