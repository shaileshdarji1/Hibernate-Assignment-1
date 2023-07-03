package com.hibernate.manytomany.service;

import com.hibernate.manytomany.entity.Student;

import java.util.List;

public interface StudentService {

    public Student addStudent(Student student);

    public List<Student> getStudents();

    public Student updateStudent(Student student);

    public void deleteStudent(Integer id);

    public Student findStudentById(Integer id);
}
