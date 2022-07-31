package com.example.ter.employee;

import lombok.*;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor

public class Employee {
    private Long id;
    private String name;
    private String email;
    private Gender gender;
}
