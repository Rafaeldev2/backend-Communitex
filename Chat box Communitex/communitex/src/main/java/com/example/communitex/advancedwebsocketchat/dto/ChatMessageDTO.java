package com.example.communitex.advancedwebsocketchat.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ChatMessageDTO {

    private String content;
    private String sender;
    private LocalDateTime timestamp;

    public ChatMessageDTO(String content, String sender, LocalDateTime timestamp) {
        this.content = content;
        this.sender = sender;
        this.timestamp = timestamp;
    }
}
