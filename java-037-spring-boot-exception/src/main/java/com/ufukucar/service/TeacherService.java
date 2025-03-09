package com.ufukucar.service;


import com.ufukucar.exception.ResourceNotFoundException;
import com.ufukucar.model.Teacher;
import com.ufukucar.repository.TeacherRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TeacherService {

    /* eski usul kod
    @Autowired
    private TeacherRepository teacherRepository;
    */

    private final TeacherRepository teacherRepository;


    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }


    /*
        getAllTeacher
        getOneTeacher
        createTeacher
        deleteTeacher
        updateTeacher
     */


    public List<Teacher> getAllTeacher () {

        return teacherRepository.findAll();

    }


    public Teacher getOneTeacherv1 (Long id) {
        return teacherRepository.findById(id).get();
    }


    public ResponseEntity  <Teacher> getOneTeacher (Long id) throws ResourceNotFoundException {

        // Kontrol id
        Teacher teacher = teacherRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Hata aldık ID: " + id));

        return ResponseEntity.ok().body(teacher);


    }


    public Teacher createTeacher (Teacher teacher) {

        // FIX ME; null dönülmeden ne yapabiliriz ?
        // istekte veri tabanında var mı yok mu onun kontorlü
        if (teacherRepository.findById(teacher.getId()).isPresent()) {

            return null;
        }

        return teacherRepository.save(teacher);
    }



    public Map<String, Boolean> deleteTeacher (Long id) throws ResourceNotFoundException {


        // Kontrol id
        Teacher teacher = teacherRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("DELETE => Teacher Not Found ID: " + id));


        teacherRepository.deleteById(id);

         Map<String, Boolean> deleteResult = new HashMap<>();

         deleteResult.put("Deleted ID: " + id, Boolean.TRUE);

         return deleteResult;
    }


    public Teacher updateTeacherv1 (Long id, Teacher teacher) throws ResourceNotFoundException {

        // Kontrol id
        Teacher teacherInfo = teacherRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(" Teacher Not Found ID: " + id));

        teacher.setId(id);

        return teacherRepository.save(teacher);


    }



    public ResponseEntity <Teacher> updateTeacher (Long id, Teacher teacher) throws ResourceNotFoundException {

        // Kontrol id
        Teacher teacherInfo = teacherRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException(" Teacher Not Found ID: " + id));

        teacher.setId(id);

        return ResponseEntity.ok().body(teacherRepository.save(teacher));


    }



































}
