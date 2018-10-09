package com.sapient.NotificationService.Main;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.sapient.NotificationService.Entity.Trade;

@Component
public class Receiver  {
	
	@RabbitListener(queues= "${queue.name}", containerFactory="jsaFactory")
	public void receiveMessage(Trade trade) {
		System.out.println("Received <"+ trade +">");
	}
}
