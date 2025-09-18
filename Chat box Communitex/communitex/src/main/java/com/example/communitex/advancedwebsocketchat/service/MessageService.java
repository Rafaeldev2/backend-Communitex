package com.example.communitex.advancedwebsocketchat.service;

import com.example.communitex.advancedwebsocketchat.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageService {

    private final MessageRepository messageRepository;

    public Message saveMessage(User sender, String content) {
        Message message = new Message(sender, content);
        return messageRepository.save(message);
    }
}
