package com.example.demo.controller;

import com.example.demo.servcie.TicketServcieImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhang_htao on 20198/27.
 */
@RestController
public class HelloController {
    @Autowired
    private TicketServcieImpl ticketServcie;

    @RequestMapping("info")
    public Object getInfo(){
        return ticketServcie.sayInfo();
    }
}
