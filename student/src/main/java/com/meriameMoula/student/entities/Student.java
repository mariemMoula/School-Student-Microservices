package com.meriameMoula.student.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id ;
    private String firstName;
    private String lastName;
    private String email;
    //Since we are working on microservices, we will refrence the School entity by its id
    private Integer schoolId;
    //We will ensure the data integrity manually
}
