package com.kiev.tickets.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

import static lombok.AccessLevel.PRIVATE;

@AllArgsConstructor(access = PRIVATE)
@Builder
@Getter
@Setter
public class Event {
    private Integer id;
    private String name;
    private Address address;
    private LocalDateTime dateStart;
    private LocalDateTime dateEnd;
    private Integer basePrice;
    private String description;
}
