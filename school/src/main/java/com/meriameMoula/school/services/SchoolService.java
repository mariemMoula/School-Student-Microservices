package com.meriameMoula.school.services;

import com.meriameMoula.school.client.StudentClient;
import com.meriameMoula.school.controllers.FullSchoolResponse;
import com.meriameMoula.school.entities.School;
import com.meriameMoula.school.repositories.SchoolRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SchoolService {
    private final SchoolRepository schoolRepository;

    private  final StudentClient studentClient;

    public void saveSchool(School school){
        schoolRepository.save(school);
    }

    public List<School> getAllSchools(){
        return schoolRepository.findAll();
    }

    public FullSchoolResponse findSchoolsWithStudents(Integer schoolId) {
        var school = schoolRepository.findById(schoolId)
                .orElse(
                        School.builder()
                                .name("School not found")
                                .email("School not found")
                                .build()
                );
        var students = studentClient.findAllStudentsBySchool(schoolId); // find all the students from the students microservice
        return FullSchoolResponse.builder()
                .name(school.getName())
                .email(school.getEmail())
                .students(students)
                .build();
    }
}
