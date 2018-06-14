package com.kiev.tickets.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static lombok.AccessLevel.PRIVATE;

@AllArgsConstructor (access = PRIVATE)
@NoArgsConstructor
@Builder
@Setter
@Getter
public class User {
    private Integer id;
    private String firstName;
    private String secondName;
    private String email;
    private String password;
    private String payCard;
    private Gender gender;
    private Address address;
}
