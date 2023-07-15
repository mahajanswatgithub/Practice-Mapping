package com.example.MappingPractice.Mapping.controller;
import com.example.MappingPractice.Mapping.model.Course;
import com.example.MappingPractice.Mapping.service.CourseService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Validated
@RestController
public class CourseController {

    @Autowired
    CourseService courseService;
    // add course info 
    @PostMapping("course")
    public void addCourse(@RequestBody @Valid Course course)
    {
        courseService.addCourse(course);
    }

    //get all Courses
    @GetMapping("Courses")
    public Iterable<Course> getAllCourses()
    {
        return courseService.getAllCourses();
    }

    //update Course by course duration using CourseId
    @PutMapping("course/{id}/{courseDuration}")
    public void updateCourseByCourseDuration(@PathVariable String id, @PathVariable String courseDuration)
    {
        courseService.updateCourseByCourseDuration(id,courseDuration);
    }

    //delete Course Duration using CourseDurationId
    @DeleteMapping("course/{id}")
    public void deleteCourseById(@PathVariable String id)
    {
        courseService.deleteCourseById(id);
    }
}
