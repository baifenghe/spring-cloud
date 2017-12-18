package com.bfh.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Author: bfh
 * Date: 2017/12/13
 */
@FeignClient("eureka-client")
public interface DcClient {

	@GetMapping("/dc")
	String consumer();

}
