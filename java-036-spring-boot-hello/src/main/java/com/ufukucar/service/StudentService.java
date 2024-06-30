package com.ufukucar.service;


import com.ufukucar.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class StudentService {


    // Data katmanını enjekte eder

    @Autowired // Bağımlılıkların enjeksiyonu
    StudentRepository studentRepository;

















}
