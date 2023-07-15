package com.example.MappingPractice.Mapping.controller;

import com.example.MappingPractice.Mapping.model.Student;
import com.example.MappingPractice.Mapping.model.Student;
import com.example.MappingPractice.Mapping.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Validated
@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    //add student info
    @PostMapping("student")
    public void addStudent(@RequestBody @Valid Student student)
    {
        studentService.addStudent(student);
    }

    //get Students
    @GetMapping("students")
    public Iterable<Student> getStudents()
    {
        return studentService.getStudents();
    }

    //update Student by phoneNumber using StudentId
    @PutMapping("Student/{id}/{phoneNumber}")
    public void updateStudentByStudentPhoneNumber(@PathVariable String id, @PathVariable String phoneNumber)
    {
        studentService.updateStudentByStudentPhoneNumber(id,phoneNumber);
    }

    //delete Student using StudentId
    @DeleteMapping("Student/{id}")
    public void deleteStudentById(@PathVariable String id)
    {
        studentService.deleteStudentById(id);
    }
}
