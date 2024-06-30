package com.ufukucar.controller;


import com.ufukucar.model.Student;
import com.ufukucar.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// http://localhost:8090/api/v1

@RestController
@RequestMapping("/api/v1/")
public class StudentController {

    // IoC (Inversion of Control) - Kontrolü Spring'e ver.
    // DI  (Dependency Inversion) - Bağımlılıklarn enjeksiyonu/zerki

    /**
    // Servis Enjekte ediliyor. Nesne referansı verdik, eski
    @Autowired // Bu şekilde bağladık
    StudentService studentService;
    */

    /** Yeni hali, Spring bunu öneriyor **/
    private final StudentService studentService;

    // Constructor içinde atama yapılmalı
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // GET
    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring Boot - Student Controller";
    }



    // GET - SELECT ALL
    // http://localhost:8090/api/v1/students ya da http://localhost:8090/api/v1/student/all
    @GetMapping({"/students", "student/all"})
    public List <Student> getStudents() {




        return  null;
    }




    // GET - SELECT WHERE
    // http://localhost:8090/api/v1/student/:id
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable (name = "id") Long id) {


        return null;
    }




    // POST - INSERT
    // http://localhost:8090/api/v1/student
    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student) {


        return null;
    }




    // PUT -- UPDATE
    // http://localhost:8090/api/v1/student/:id
    @PutMapping("/student/{id}")
    public Student putStudent(@PathVariable Long id) {


        return null;
    }





    // DELETE - DELETE
    // http://localhost:8090/api/v1/student/:id
    @DeleteMapping("/student/{id}")
    public Student deleteStudent(@PathVariable Long id) {


        return null;
    }






















}
