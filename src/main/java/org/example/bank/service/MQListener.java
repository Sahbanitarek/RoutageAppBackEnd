package org.example.bank.service;

import org.example.bank.entities.MessageEntity;
import org.example.bank.repository.MessageRepository;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import java.time.LocalDateTime;

@Component
public class MQListener {

    private final MessageRepository messageRepository;

    public MQListener(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @JmsListener(destination = "${spring.jms.template.default-destination}")
    public void receiveMessage(String message) {
        System.out.println("Message reçu: " + message);

        // Créer une entité avec le message et l'horodatage
        MessageEntity messageEntity = new MessageEntity(
                message,
                LocalDateTime.now().toString()
        );

        // Sauvegarder dans la base de données
        messageRepository.save(messageEntity);
    }
}