package com.meriameMoula.school.controllers;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.List;


@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//It will hold the same information as the School entity but with the list of students
public class FullSchoolResponse {
//No id

    private String name;
    private String email;
    List<Student> students;
}
