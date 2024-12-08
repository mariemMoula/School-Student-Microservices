package com.meriameMoula.student.controllers;

import com.meriameMoula.student.entities.Student;
import com.meriameMoula.student.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.List;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody Student student){
        studentService.saveStudent(student);
    }

    @GetMapping
    public ResponseEntity<List<Student>> getAllStudents() {
    List<Student> students = studentService.getAllStudents();
    return ResponseEntity.ok(students);
    }

    @GetMapping("/schools/{schoolId}")
    public ResponseEntity<List<Student>> getAllStudents(
            @PathVariable("schoolId") Integer schoolId
    ) {
        List<Student> students = studentService.findAllStudentsBySchool(schoolId);
        return ResponseEntity.ok(students);
    }

}
