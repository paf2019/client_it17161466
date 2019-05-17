package com.it17161466.client.clientImp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//import com.it17161466.supplier.model.Items;
import com.it17161466.supplier.model.User;

@Component
public class RestClient implements CommandLineRunner {

	/*private static void callRestService1() {
		RestTemplate restTemplate = new RestTemplate();
		User user = restTemplate.getForObject("http://localhost:8091/api/login", User.class);
		System.out.println("User is :"+user.getName());
	}
	*/
	private static void callRestService2() {
		RestTemplate restTemplate = new RestTemplate();
		User user = restTemplate.getForObject("http://localhost:8092/api/suppliers/supplier/1", User.class);
		System.out.println("User is :"+user.getName());
	}
	
	/*private static void callRestService3() {
		RestTemplate restTemplate = new RestTemplate();
		Items item = restTemplate.getForObject("http://localhost:8093/api/items/item/1", Items.class);
		System.out.println("User is :"+item.getItem_name());
	}*/

	@Override
	public void run(String... args) throws Exception {
		//callRestService1();	
		callRestService2();	
		//callRestService3();	
	}
}
