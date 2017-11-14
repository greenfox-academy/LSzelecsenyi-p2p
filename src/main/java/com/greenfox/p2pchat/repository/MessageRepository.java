package com.greenfox.p2pchat.repository;

import com.greenfox.p2pchat.model.ChatMessage;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<ChatMessage, Integer> {
}
