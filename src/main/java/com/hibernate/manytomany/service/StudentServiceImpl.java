package com.hibernate.manytomany.service;

import com.hibernate.manytomany.entity.Student;
import com.hibernate.manytomany.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    
    @Autowired
    StudentRepository studentRepository;

    @Override
    public Student addStudent(Student student) {

      return studentRepository.save(student);

    }

    @Override
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteStudent(Integer id) {
           studentRepository.deleteById(id);
    }

    @Override
    public Student findStudentById(Integer id) {
        return studentRepository.findById(id).orElse(null);
    }
}
