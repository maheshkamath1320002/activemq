package com.anz.Activemqspronboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    @Autowired
    producer produce;
    @PostMapping("/publish")
    public void sendmessage(@RequestBody String message)
    {
        produce.publish(message);
    }
}
