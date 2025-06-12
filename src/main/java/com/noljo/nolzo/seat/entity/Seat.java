package com.noljo.nolzo.seat.entity;

import com.noljo.nolzo.event.entity.Event;
import com.noljo.nolzo.global.BaseEntity;
import com.noljo.nolzo.reservation.entity.Reservation;
import com.noljo.nolzo.ticket.entity.Ticket;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Seat extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seat_id")
    private Long id;

    private String rowName;

    private int seatNumber;

    private String seatSection;

    private String floor;

    private int price;

    @Enumerated(EnumType.STRING)
    private SeatStatus status;

    @OneToMany(mappedBy = "seat", cascade = CascadeType.PERSIST)
    private List<Ticket> tickets = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;
}
