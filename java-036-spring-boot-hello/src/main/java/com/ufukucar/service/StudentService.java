package com.ufukucar.service;


import com.ufukucar.model.Student;
import com.ufukucar.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Transactional
@Service
public class StudentService {


    // Data katmanını enjekte eder

    @Autowired // Bağımlılıkların enjeksiyonu
    StudentRepository studentRepository;


    public List<Student> getStudents() {

        return studentRepository.findAll();

    }


    public Student getStudent(Long id) {

        return studentRepository.findById(id).get(); // daha eski bir kod
        //return studentRepository.getReferenceById(id);
    }



    public Student addStudent(Student student) {

        return studentRepository.save(student);
    }



    public Optional <Student> updateStudent(Student student) {

        // FIXME Güncelleme bu kısma taşınacak

        return Optional.of(studentRepository.save(student));
    }



    public String deleteStudent(Long id) {

         Student studentInfo = studentRepository.getReferenceById(id);

         studentRepository.deleteById(id);

         // FIXME geri dönüşleri kontrol et!
         return studentInfo.getFirstName() + " " +  "Başarılı Olarak Silindi!";
    }



}
