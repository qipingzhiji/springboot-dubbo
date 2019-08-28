package com.example.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ticket.service.TicketService;
import org.springframework.stereotype.Component;

/**
 * Created by zhang_htao on 2019/8/27.
 */
@Component
@Service(interfaceClass = TicketService.class, version = "1.0.0")
public class TicketServiceImpl implements TicketService {

    @Override
    public String getTicket() {
        System.out.println("通过dubbo服务获得了一张票11");
        return "通过dubbo服务获得了一张票";
    }
}
