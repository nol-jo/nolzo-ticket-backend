package com.noljo.nolzo.ticket.controller;

import com.noljo.nolzo.ticket.service.TicketService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TicketController {
    private final TicketService ticketService;
}
