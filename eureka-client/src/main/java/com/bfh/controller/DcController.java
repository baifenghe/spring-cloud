package com.bfh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: bfh
 * Date: 2017/12/13
 */
@RestController
public class DcController {

	@Autowired
	private DiscoveryClient discoveryClient;

	@GetMapping("/dc")
	public String dc() {
		String services = "【20011端口的client1】Services: " + discoveryClient.getServices();
		System.out.println(services);
		return services;
	}
}
