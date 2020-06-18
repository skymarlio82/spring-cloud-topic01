
package com.whiz.demo.sc.services.producer.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/foo")
	public String foo(String foo) {
		return "Hello, " + foo + "!";
	}
}
