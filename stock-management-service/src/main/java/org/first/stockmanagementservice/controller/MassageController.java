package org.first.stockmanagementservice.controller;

import org.first.stockmanagementservice.webSocket.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.SimpMessagingTemplate;

public class MassageController {
    private SimpMessagingTemplate simpMessagingTemplate;

    //  /app/application
    @MessageMapping("/application")
    @SendTo("/all/messages")
    public Message send(final Message message) throws Exception {
        return message;
    }

    @MessageMapping("/private")
    public void sendToSpecificUser(@Payload Message message) {
        simpMessagingTemplate.convertAndSendToUser(message.getSendTo(), "/specific", message);
    }
}
