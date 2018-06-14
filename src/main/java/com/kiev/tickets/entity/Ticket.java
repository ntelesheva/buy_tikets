package com.kiev.tickets.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

import static lombok.AccessLevel.PRIVATE;

@AllArgsConstructor (access = PRIVATE)
@NoArgsConstructor
@Builder
@Setter
@Getter
public class Ticket {
    private Integer id;
    private User user;
    private Event event;
    private LocalDateTime dataOfBuy;
}
