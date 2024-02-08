package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AproposController {

	@GetMapping("/about")
	public String getPage() {

		return "dashboard/about";
	}

}
