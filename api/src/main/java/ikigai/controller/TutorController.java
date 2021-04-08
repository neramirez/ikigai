package ikigai.controller;

import ikigai.Json.ActivityJson;
import ikigai.Json.TutorJson;
import ikigai.entity.Activity;
import ikigai.entity.Tutor;
import ikigai.service.ActivityService;
import ikigai.service.TutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tutor")
public class TutorController {
    @Autowired
    private TutorService tutorService;

    @PostMapping("/new")
    public Tutor newTutor(@RequestBody TutorJson tutorJson) {
        return tutorService.newTutor(tutorJson);
    }
}
