package com.nttdata.bootcamp.retoconfigservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class MessageController {
	
	@Value("${message.hello-world}")
	private String myHelloWorld;

	@GetMapping("/helloWorld")
	public @ResponseBody String myProduct() {
		return this.myHelloWorld;
	}
}
