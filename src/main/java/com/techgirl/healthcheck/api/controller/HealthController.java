package com.techgirl.healthcheck.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {
	@Autowired
	Environment environment;

	@GetMapping("/status/check")
	public String getHealthCheck(@RequestParam String systemId) {
		return "My" +systemId+"is working on" + environment.getProperty("server.port");
	}

}
