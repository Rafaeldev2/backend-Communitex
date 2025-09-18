package com.example.communitex.advancedwebsocketchat.repository;

import org.apache.logging.log4j.message.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
