package com.ufukucar.service;


import com.ufukucar.exception.ResourceNotFoundException;
import com.ufukucar.model.Student;
import com.ufukucar.repository.StudentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class StudentService {

    /* eski usul kod
    @Autowired
    private StudentRepository studentRepository;
    */

    private final StudentRepository studentRepository;


    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    /*
        getAllStudent
        getOneStudent
        createStudent
        deleteStudent
        updateStudent
     */


    public List<Student> getAllStudent () {

        return studentRepository.findAll();

    }


    public Student getOneStudentv1 (Long id) {
        return studentRepository.findById(id).get();
    }


    public ResponseEntity  <Student> getOneStudent (Long id) throws ResourceNotFoundException {

        // Kontrol id
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Hata aldık ID: " + id));

        return ResponseEntity.ok().body(student);


    }


    public Student createStudent (Student student) {

        // FIX ME; null dönülmeden ne yapabiliriz ?
        // istekte veri tabanında var mı yok mu onun kontorlü
        if (studentRepository.findById(student.getId()).isPresent()) {

            return null;
        }

        return studentRepository.save(student);
    }



    public Map<String, Boolean> deleteStudent (Long id) throws ResourceNotFoundException {


        // Kontrol id
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("DELETE => Student Not Found ID: " + id));


        studentRepository.deleteById(id);

         Map<String, Boolean> deleteResult = new HashMap<>();

         deleteResult.put("Deleted ID: " + id, Boolean.TRUE);

         return deleteResult;
    }


    public Student updateStudentv1 (Long id, Student student) throws ResourceNotFoundException {

        // Kontrol id
        Student studentInfo = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(" Student Not Found ID: " + id));

        student.setId(id);

        return studentRepository.save(student);


    }



    public ResponseEntity <Student> updateStudent (Long id, Student student) throws ResourceNotFoundException {

        // Kontrol id
        Student studentInfo = studentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(" Student Not Found ID: " + id));

        student.setId(id);

        return ResponseEntity.ok().body(studentRepository.save(student));


    }



































}
