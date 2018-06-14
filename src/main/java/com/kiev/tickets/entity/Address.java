package com.kiev.tickets.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import static lombok.AccessLevel.PRIVATE;

@AllArgsConstructor(access = PRIVATE)
@Builder
@Setter
@Getter
public class Address {
    private Integer id;
    private String country;
    private String city;
    private String street;
    private String apartment;
    private String postalCode;
}
