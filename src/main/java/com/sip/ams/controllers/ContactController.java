package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String contact() {

		return "dashboard/contact";
	}

}
