package com.example.MappingPractice.Mapping.service;

import com.example.MappingPractice.Mapping.model.Student;
import com.example.MappingPractice.Mapping.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    IStudentRepo studentRepo;

    public void addStudent(Student student) {
        studentRepo.save(student);
    }

    public Iterable<Student> getStudents() {
        return studentRepo.findAll();
    }

    public void updateStudentByStudentPhoneNumber(String id, String phoneNumber) {
        studentRepo.updateStudentByStudentPhoneNumber(id,phoneNumber);
    }

    public void deleteStudentById(String id) {
        studentRepo.deleteById(id);
    }
}
