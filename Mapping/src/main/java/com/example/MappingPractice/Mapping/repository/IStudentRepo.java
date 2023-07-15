package com.example.MappingPractice.Mapping.repository;

import com.example.MappingPractice.Mapping.model.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends JpaRepository<Student,String> {

    @Transactional
    @Modifying
    @Query(value = "update Students set Student_Phone_Number = :phoneNumber where Student_Id = :id",nativeQuery = true)
    void updateStudentByStudentPhoneNumber(String id, String phoneNumber);
}
