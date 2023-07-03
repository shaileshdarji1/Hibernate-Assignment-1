package com.hibernate.manytomany.service;

import com.hibernate.manytomany.entity.Course;

import java.util.List;

public interface CourseService {

    public Course addCourse(Course course);

    public List<Course> getCourses();

    public Course updateCourse(Course course);

    public void deleteCourse(Integer id);

    public Course findCourseById(Integer id);
}
