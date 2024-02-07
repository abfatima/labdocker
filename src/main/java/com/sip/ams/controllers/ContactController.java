package com.sip.ams.controllers;

import org.springframework.web.bind.annotation.*;

public class ContactController {

	@RequestMapping("/contact")
	public String contact() {

		return "dashboard/contact";
	}

}
