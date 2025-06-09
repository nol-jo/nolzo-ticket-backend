package com.noljo.nolzo.reservation.entity;

import com.noljo.nolzo.global.BaseEntity;
import com.noljo.nolzo.member.entity.Member;
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
public class Reservation extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    private ReservationStatus status;

    private int totalPrice;

    private Long reservationNumber;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "ticket_id")
    private List<Ticket> tickets = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;
}
