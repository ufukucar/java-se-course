package com.ufukucar.repository;


import com.ufukucar.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {


    // interface ler başka interface den miras alabilir

























}
