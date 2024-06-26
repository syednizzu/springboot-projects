package com.example.secondTask.eo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import com.example.secondTask.restHelper.CustomerRestHelper;

@Component
public class CustomerEOImpl implements CustomerEO{

	Logger logger = LoggerFactory.getLogger(CustomerEOImpl.class);
	
	@Autowired
	private CustomerRestHelper custHelper;
	
	public RestTemplate getCustomersByRestTemplate() {
		logger.info("Retrieving all Customers data using Rest template from EO Layer...");
		return custHelper.getCustomersByRestTemplate();
	}
	
	
}
