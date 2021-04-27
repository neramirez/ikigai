package ikigai.controller;

import ikigai.Json.StudentJson;
import ikigai.entity.Student;
import ikigai.entity.Tutor;
import ikigai.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/new")
    public Student newStudent(@RequestBody StudentJson studentJson) {
        return studentService.newStudent(studentJson);
    }

    @PostMapping("/id/{studentId}/tutor/{tutorId}")
    public Student newStudentTutor(@PathVariable Long studentId, @PathVariable Long tutorId){
        return studentService.generateStudentTutor(studentId, tutorId);
    }
}
