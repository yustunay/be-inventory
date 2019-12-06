package com.in28minutes.rest.webservices.restfulwebservices.barcode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BarcodeResource {

	@Autowired
	private SimpMessagingTemplate simpMessagingTemplate;
	
	@GetMapping("/barcode")
	public void barcode(@RequestParam(required = false) String text) throws Exception{
		System.out.println("Barcode : "+text);
		OrderItem order = null;
		if (Products.list.get(text)!=null) {
			order = new OrderItem(text, Products.list.get(text), 1);
		} else {
			order = new OrderItem(text,"NOT_FOUND", 1);
		}

		this.simpMessagingTemplate.convertAndSend("/topic/greetings", order);
	}
	
	
    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public OrderItem greeting(@RequestParam(required = true) String text) throws Exception {
        Thread.sleep(1000); // simulated delay
        return new OrderItem(text, Products.list.get(text), 1);
    }
	
}
