package com.noljo.nolzo.event.entity;

import com.noljo.nolzo.payment.entity.Payment;
import com.noljo.nolzo.seat.entity.Seat;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id")
    private Long id;

    private String title;

    private String venue;

    private String description;

    private LocalDate startDate;

    private LocalDate endDate;

    @Enumerated(EnumType.STRING)
    private EventCategory eventCategory;

    private int ageLimit;

    private int rating;

    private int reviewCount;

    @OneToMany(mappedBy = "event", cascade = CascadeType.PERSIST)
    private List<Seat> seats = new ArrayList<>();
}
