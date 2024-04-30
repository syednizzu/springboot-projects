package com.example.secondTask.restHelper;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import com.example.secondTask.controller.CustomerController;

@Component
public class CustomerRestHelperImpl implements CustomerRestHelper {
	
	Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	public RestTemplate getCustomersByRestTemplate() {
		logger.info("Retrieving all Students data using Rest template from RestHelper...");
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}
	
}