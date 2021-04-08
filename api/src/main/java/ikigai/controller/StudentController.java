package ikigai.controller;

import ikigai.Json.StudentJson;
import ikigai.entity.Student;
import ikigai.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/new")
    public Student newStudent(@RequestBody StudentJson studentJson) {
        return studentService.newStudent(studentJson);
    }
}
