package com.meriameMoula.school.controllers;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
//No id
    private String firstName;
    private String lastName;
    private String email;
}
