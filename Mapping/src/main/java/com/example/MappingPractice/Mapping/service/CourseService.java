package com.example.MappingPractice.Mapping.service;

import com.example.MappingPractice.Mapping.model.Course;
import com.example.MappingPractice.Mapping.repository.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    ICourseRepo courseRepo;

    public void addCourse(Course course) {
        courseRepo.save(course);
    }

    public Iterable<Course> getAllCourses() {
        return courseRepo.findAll();
    }

    public void updateCourseByCourseDuration(String id, String courseDuration) {
        courseRepo.updateCourseByCourseDuration(id,courseDuration);
    }

    public void deleteCourseById(String id) {
        courseRepo.deleteById(id);
    }
}
