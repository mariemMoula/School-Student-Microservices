package com.meriameMoula.student.services;

import com.meriameMoula.student.entities.Student;
import com.meriameMoula.student.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository  studentRepository;

    public void saveStudent(Student student){
        studentRepository.save(student);
    }

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }


    public List<Student> findAllStudentsBySchool(Integer schoolId) {
       return studentRepository.findAllBySchoolId(schoolId);
    }
}
