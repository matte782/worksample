package com.sample;

import org.springframework.web.client.RestTemplate;

public class RestClient {
	
	public RestClient() {
		
	}
	
	public ServiceMap getService1() {
		RestTemplate restTemplate = new RestTemplate();
    	ServiceMap serviceMap = restTemplate.getForObject("http://api.hel.fi/servicemap/v1/?format=json", ServiceMap.class);
    	return serviceMap;
	}
	
	public Respa getService2() {
		RestTemplate restTemplate = new RestTemplate();
		Respa respa = restTemplate.getForObject("https://api.hel.fi/respa/v1/?format=json", Respa.class);
		return respa;
	}
	
}
