package com.anz.Activemqspronboot;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class producer {
    JmsTemplate jmsTemplate;

    public producer(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void publish(String message)
    {
        jmsTemplate.convertAndSend("Queue.example",message);
    }
}
