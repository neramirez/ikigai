package ikigai.controller;

import ikigai.Json.ActivityJson;
import ikigai.entity.Activity;
import ikigai.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/activity")
public class ActivityController {
    @Autowired
    private ActivityService activityService;

    @PostMapping("/new")
    public Activity newActivity(@RequestBody ActivityJson activityJson) {
        return activityService.newActivity(activityJson);
    }
}
