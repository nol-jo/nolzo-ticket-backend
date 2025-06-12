package com.noljo.nolzo.ticket.repository;

import com.noljo.nolzo.ticket.entity.Ticket;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    List<Ticket> findByReservationIdIn(List<Long> reservationIdList);
}
