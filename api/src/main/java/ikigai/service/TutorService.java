package ikigai.service;

import ikigai.Json.ActivityJson;
import ikigai.Json.TutorJson;
import ikigai.entity.Activity;
import ikigai.entity.Tutor;
import ikigai.repository.ActivityRepository;
import ikigai.repository.TutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TutorService {
    @Autowired
    private TutorRepository tutorRepository;

    @Transactional
    public Tutor newTutor(TutorJson json) {
        return tutorRepository.save(json.tutorFromJson());
    }
}
