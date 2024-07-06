package com.ufukucar.controller;

// APIs

import com.ufukucar.model.Student;
import com.ufukucar.repository.StudentRepository;
import com.ufukucar.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;


@RestController
@RequestMapping("/api/v1/") // http://localhost:8090/api/v1
public class StudentController {
    private final StudentRepository studentRepository;

    /* Eski usul kod
    @Autowired
    private final StudentService studentService;
    */


    //@Autowired
    private  StudentService studentService;

    public StudentController(StudentService studentService, StudentRepository studentRepository) {
        this.studentService = studentService;
        this.studentRepository = studentRepository;
    }



    /*
        getAllStudent
        getOneStudent
        createStudent
        deleteStudent
        updateStudent
     */

    @GetMapping("/student")
    public List<Student> getAllStudent () {
        return studentService.getAllStudent();
    }

    @GetMapping("/student/{id}")
    public Optional<Student> getOneStudent (@PathVariable Long id) {

        return studentService.getOneStudent(id);
    }


    @PostMapping("/student")
    public Student createStudent (@RequestBody Student student) {

        return studentService.createStudent(student);
    }


    @DeleteMapping("/student/{id}")
    public Map<String, Boolean> deleteStudent (@PathVariable Long id) {
        return studentService.deleteStudent(id);
    }

    @PutMapping("/student/{id}")
    public Student updateStudent (@PathVariable Long id,
                                  @RequestBody Student student) {

        return studentService.updateStudent(id, student);
    }







}
