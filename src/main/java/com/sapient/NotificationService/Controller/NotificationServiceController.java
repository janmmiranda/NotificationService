package com.sapient.NotificationService.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.sapient.NotificationService.Entity.Trade;

@Controller
@CrossOrigin("*")
public class NotificationServiceController {

	@Autowired
	private SimpMessagingTemplate template;
	
	public void sendMessage(Trade trade) {
		this.template.convertAndSend("/metallica", trade);
	}
}
