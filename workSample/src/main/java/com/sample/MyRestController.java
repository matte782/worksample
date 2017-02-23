package com.sample;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MyRestController {
	
	@RequestMapping("/")
	public Combined showData() {
		RestClient restClient = new RestClient();
		ServiceMap serviceMap = restClient.getService1();
		Respa respa = restClient.getService2();
		Combined combined = combine(serviceMap, respa);
		return combined;
	}
	
	public Combined combine(ServiceMap serviceMap, Respa respa) {
		Combined combined = new Combined();
		
		combined.setServiceMap(serviceMap);
		combined.setRespa(respa);
		
		return combined;
	}

}
