package com.example.demo.servcie;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ticket.service.TicketService;
import org.springframework.stereotype.Component;

/**
 * Created by zhang_htao on 2019/8/27.
 */
@Component
public class TicketServcieImpl {
    @Reference(interfaceClass = TicketService.class,version = "1.0.0")
    TicketService ticketService;

    public  String sayInfo(){
        String ticket = ticketService.getTicket();
        System.out.println(ticket);
        return ticket;
    }
}
