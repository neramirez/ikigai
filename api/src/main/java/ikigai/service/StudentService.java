package ikigai.service;

import ikigai.Json.StudentJson;
import ikigai.entity.Student;
import ikigai.entity.Tutor;
import ikigai.repository.HomeRepository;
import ikigai.repository.StudentRepository;
import ikigai.repository.TutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private HomeRepository homeRepository;

    @Autowired
    private TutorRepository tutorRepository;

    @Transactional
    public Student generateStudentTutor(Long studentId, Long tutorId) {
        Student student = studentRepository.findById(studentId).orElseThrow();
        student.addTutor(tutorRepository.findById(tutorId).orElseThrow());
        return student;
    }

    @Transactional
    public Student newStudent(StudentJson json) {
        return studentRepository.save(json.studentFromJson(homeRepository.findById(json.getHomeId()).orElseThrow()));
    }
}
