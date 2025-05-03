package com.example.whatsapp.repository;

import com.example.whatsapp.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChatRepository extends JpaRepository<Message, String> {
}
