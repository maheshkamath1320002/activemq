package com.anz.Activemqspronboot;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import static jdk.internal.org.jline.utils.Colors.s;

@Component
public class consumer {
    @JmsListener(destination = "Queue.example")
    public void ReceiveMessage(String message)
    {
        System.out.println("message received Successfully"+message);
    }
}
