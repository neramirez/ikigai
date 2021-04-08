package ikigai.controller;

import ikigai.Json.ObjectiveJson;
import ikigai.entity.Objective;
import ikigai.service.ObjectiveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/objective")
public class ObjectiveController {
    @Autowired
    private ObjectiveService objectiveService;

    @PostMapping("/new")
    public Objective newObjective(@RequestBody ObjectiveJson objectiveJson) {
        return objectiveService.newObjective(objectiveJson);
    }
}
