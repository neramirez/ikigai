package ikigai.service;

import ikigai.Json.StudentJson;
import ikigai.entity.Student;
import ikigai.repository.HomeRepository;
import ikigai.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private HomeRepository homeRepository;

    @Transactional
    public Student newStudent(StudentJson json) {
        return studentRepository.save(json.studentFromJson(homeRepository.findById(json.getHomeId()).orElseThrow()));
    }
}
