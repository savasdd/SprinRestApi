package com.api.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restapi")
public class RestApiController {

	@GetMapping
	public String Merhaba() {
		return "Merhaba Dünya";
	}

}
