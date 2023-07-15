package com.example.MappingPractice.Mapping.repository;

import com.example.MappingPractice.Mapping.model.Course;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepo extends JpaRepository<Course,String> {

    @Transactional
    @Modifying
    @Query(value = "update Courses set Course_Duration = :courseDuration where Course_Id = :id",nativeQuery = true)
    void updateCourseByCourseDuration(String id, String courseDuration);
}
