package com.example.secondTask.eo;

import org.springframework.web.client.RestTemplate;

public interface CustomerEO {

	public RestTemplate getCustomersByRestTemplate();
	
}
