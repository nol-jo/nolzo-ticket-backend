package com.noljo.nolzo.ticket.dto;

import com.noljo.nolzo.seat.entity.Seat;
import com.noljo.nolzo.ticket.entity.Ticket;
import com.noljo.nolzo.ticket.entity.TicketStatus;
import lombok.Builder;

@Builder
public record TicketResponse(
        Long ticketId,
        TicketStatus ticketStatus,
        String eventTitle,
        String rowName,
        int seatNumber,
        String seatSection
) {
    public static TicketResponse of(Ticket ticket, Seat seat) {
        return TicketResponse.builder()
                .ticketId(ticket.getId())
                .ticketStatus(ticket.getStatus())
                .eventTitle("test") // 해당부분 구현 기다림
                .rowName(seat.getRowName())
                .seatNumber(seat.getSeatNumber())
                .seatSection(seat.getSeatSection())
                .build();
    }
}
