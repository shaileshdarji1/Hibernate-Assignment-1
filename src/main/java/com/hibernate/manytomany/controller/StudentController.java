package com.hibernate.manytomany.controller;

import com.hibernate.manytomany.entity.Student;
import com.hibernate.manytomany.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/all")
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @GetMapping("/{studentId}")
    public Student getStudent(@PathVariable("studentId") Integer id){
        return studentService.findStudentById(id);
    }

    @PutMapping("/update")
    public Student update(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id") Integer id){
        try {
          studentService.deleteStudent(id);
          return "Student Delete Successfully";
        }
        catch (Exception e){
            return "Student not delete";
        }

    }

}
