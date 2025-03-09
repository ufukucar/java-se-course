package com.ufukucar.controller;

// APIs

import com.ufukucar.exception.ResourceNotFoundException;
import com.ufukucar.model.Student;
import com.ufukucar.repository.StudentRepository;
import com.ufukucar.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;

//http://localhost:8090/swagger-ui/index.htm
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

    // ESKI HALI
    @GetMapping("/student/v1/{id}")
    public Student getOneStudentv1 (@PathVariable Long id) {

        return studentService.getOneStudentv1(id);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity <Student> getOneStudent (@PathVariable Long id) throws ResourceNotFoundException {

        return studentService.getOneStudent(id);
    }


    @PostMapping("/student")
    public Student createStudent (@RequestBody Student student) {

        return studentService.createStudent(student);
    }


    @DeleteMapping("/student/{id}")
    public Map<String, Boolean> deleteStudent (@PathVariable Long id)  throws ResourceNotFoundException {
        return studentService.deleteStudent(id);
    }

    @PutMapping("/student/{id}")
    public Student updateStudentv1 (@PathVariable Long id,
                                  @RequestBody Student student) throws ResourceNotFoundException {

        return studentService.updateStudentv1(id, student);
    }

    public ResponseEntity <Student> updateStudent (@PathVariable Long id,
                                  @RequestBody Student student) throws ResourceNotFoundException {

        return studentService.updateStudent(id, student);
    }








}
