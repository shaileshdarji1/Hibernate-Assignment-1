package com.hibernate.manytomany.controller;

import com.hibernate.manytomany.entity.Course;
import com.hibernate.manytomany.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/course")
public class CourseController {

    @Autowired
    CourseService courseService;

    @PostMapping("/add")
    public Course addCourse(@RequestBody Course course){
        return courseService.addCourse(course);
    }

    @GetMapping("/all")
    public List<Course> getCourses(){
        List<Course> courses = courseService.getCourses();
        System.out.println(courses);
        return courses;
    }

    @GetMapping("/{courseId}")
    public Course getCourse(@PathVariable("courseId") Integer courseId){
        return courseService.findCourseById(courseId);
    }

    @PutMapping("/update")
    public Course updateCourse(@RequestBody Course course){
        return courseService.updateCourse(course);
    }

    @DeleteMapping("/delete/{courseId}")
    public String deleteCourse(@PathVariable("courseId") Integer courseId){
        try {
            courseService.deleteCourse(courseId);
            return "Course Delete successfully";
        }
        catch (Exception e){
            return "Course not deleted";
        }
    }
}
