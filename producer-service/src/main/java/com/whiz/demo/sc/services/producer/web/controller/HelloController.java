
package com.whiz.demo.sc.services.producer.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HelloController {

	@RequestMapping("/foo")
	public String foo(String foo) {
		log.trace("log.trace :: foo = {}", foo);
		log.debug("log.debug :: foo = {}", foo);
		log.info("log.info :: foo = {}", foo);
		log.warn("log.warn :: foo = {}", foo);
		log.error("log.error :: foo = {}", foo);
		return "Hello, " + foo + "!";
	}
}