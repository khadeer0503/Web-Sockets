package com.management.webSockets.Entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ChatMessage {
    private String sender;
    private String message;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAtLocalDateTime;

    @Enumerated(value=EnumType.STRING)
    private MessageType type;

    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE,
        TYPING
    }

}
