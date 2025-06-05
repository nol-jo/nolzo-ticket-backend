package com.noljo.nolzo.seat.entity;

import com.noljo.nolzo.global.BaseEntity;
import jakarta.persistence.*;
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


}
