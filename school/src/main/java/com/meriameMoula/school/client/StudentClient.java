package com.meriameMoula.school.client;


import com.meriameMoula.school.controllers.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//The FeignClient annotation is used to create a client for the Student microservice,it will be responseible for establishing a communication between the School microservice and the Student microservice and making an HTTP call to our distant Student service
@FeignClient(name = "student-service",url="${application.config.students-url}")
public interface StudentClient {
    @GetMapping("/schools/{schoolId}") //The same endpoint as the one in the StudentController
    List<Student> findAllStudentsBySchool( @PathVariable("schoolId") Integer schoolId);
    //This method will have an automatic implementation provided by Feign that will make an HTTP call to the Student microservice
}
