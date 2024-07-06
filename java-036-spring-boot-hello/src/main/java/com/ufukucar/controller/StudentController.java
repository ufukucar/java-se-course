package com.ufukucar.controller;


import com.ufukucar.model.Student;
import com.ufukucar.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @GetMapping({"/students", "students/all"})
    public List <Student> getStudents() {

        return  studentService.getStudents();
    }




    // GET - SELECT WHERE
    // http://localhost:8090/api/v1/student/:id
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable (name = "id") Long id) {
        return studentService.getStudent(id);
    }




    // POST - INSERT
    // http://localhost:8090/api/v1/student
    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }




    // PUT -- UPDATE
    // http://localhost:8090/api/v1/student/:id
    @PutMapping("/student/{id}")
    //public Student updsateStudent(@PathVariable Long id, @RequestBody Student student) {
    public Optional <Student> updateStudent(@PathVariable Long id, @RequestBody Student student) {

        // Id değeri db de var mı yok mu?
        Student studentInfo = studentService.getStudent(id);

        if (studentInfo == null) {
            // return new Student();
            //return null;
            return Optional.empty();
        }

        student.setId(id);
        return studentService.updateStudent(student);
    }





    // DELETE - DELETE
    // http://localhost:8090/api/v1/student/:id
    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable Long id) {

        // Id değeri db de var mı yok mu?

        // FIXME try catch içine alınacak
        return studentService.deleteStudent(id);
    }






















}
