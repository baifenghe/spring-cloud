package com.bfh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Author: bfh
 * Date: 2017/12/13
 */
@RestController
public class DcController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/consumer")
	public String dc() {
		return restTemplate.getForObject("http://eureka-client/dc", String.class);
	}
}