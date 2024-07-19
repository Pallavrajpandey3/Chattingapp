package com.chatApp.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chatApp.massage.Massage;
 

@RestController
public class MainController {

	@MessageMapping("/massage")
	@SendTo("/topic/return-to")
	public Massage massage(@RequestBody Massage msg )
	{
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		return msg;
	}
	
}
