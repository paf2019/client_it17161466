package com.it17161466.client.clientImp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.it17161466.supplier.model.User;

@Component
public class RestClient implements CommandLineRunner {

	private static void callRestService() {
		RestTemplate restTemplate = new RestTemplate();
		User user = restTemplate.getForObject("http://localhost:8089/api/suppliers/supplier/1", User.class);
		System.out.println("User is :"+user.getName());
	}

	@Override
	public void run(String... args) throws Exception {
		callRestService();		
	}
}
