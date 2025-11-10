package com.management.webSockets.Configurations;

import org.springframework.context.event.EventListener;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.messaging.SessionDisconnectEvent;

import com.management.webSockets.Entities.ChatMessage;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@RequiredArgsConstructor
@Slf4j
public class webSocketEventListener {
    private final SimpMessageSendingOperations messageSendingTemplate;

    @EventListener
    public void handleWebSocketDisconnectListener(SessionDisconnectEvent event) {
        StompHeaderAccessor headerAccessor = StompHeaderAccessor.wrap(event.getMessage());
        String username = (String) headerAccessor.getSessionAttributes().get("username");
        if (username != null) {
            log.info("User Disconnected : " + username);
            var chatMessage = ChatMessage.builder()
                .type(ChatMessage.MessageType.LEAVE)
                .sender(username)
                .build();

        messageSendingTemplate.convertAndSend("/topic/public", chatMessage);
        }
    }
}
