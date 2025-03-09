package com.ufukucar.controller;

// APIs

import com.ufukucar.exception.ResourceNotFoundException;
import com.ufukucar.model.Teacher;
import com.ufukucar.repository.TeacherRepository ;
import com.ufukucar.service.TeacherService ;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

//http://localhost:8090/swagger-ui/index.htm
@RestController
@RequestMapping("/api/v1/") // http://localhost:8090/api/v1
public class TeacherController {
    private final TeacherRepository  teacherRepository ;

    /* Eski usul kod
    @Autowired
    private final TeacherService  teacherService ;
    */


    //@Autowired
    private  TeacherService  teacherService ;

    public TeacherController(TeacherService  teacherService , TeacherRepository  teacherRepository ) {
        this.teacherService  = teacherService ;
        this.teacherRepository  = teacherRepository ;
    }



    @GetMapping("/teacher ")
    public List<Teacher> getAllTeacher () {
        return teacherService .getAllTeacher();
    }

    // ESKI HALI
    @GetMapping("/teacher /v1/{id}")
    public Teacher getOneTeacherv1 (@PathVariable Long id) {

        return teacherService .getOneTeacherv1(id);
    }

    @GetMapping("/teacher /{id}")
    public ResponseEntity <Teacher> getOneTeacher (@PathVariable Long id) throws ResourceNotFoundException {

        return teacherService .getOneTeacher(id);
    }


    @PostMapping("/teacher ")
    public Teacher createTeacher (@RequestBody Teacher teacher ) {

        return teacherService .createTeacher(teacher );
    }


    @DeleteMapping("/teacher /{id}")
    public Map<String, Boolean> deleteTeacher (@PathVariable Long id)  throws ResourceNotFoundException {
        return teacherService .deleteTeacher(id);
    }

    @PutMapping("/teacher /{id}")
    public Teacher updateTeacherv1 (@PathVariable Long id,
                                  @RequestBody Teacher teacher ) throws ResourceNotFoundException {

        return teacherService .updateTeacherv1(id, teacher );
    }

    public ResponseEntity <Teacher> updateTeacher (@PathVariable Long id,
                                  @RequestBody Teacher teacher ) throws ResourceNotFoundException {

        return teacherService .updateTeacher(id, teacher );
    }








}
