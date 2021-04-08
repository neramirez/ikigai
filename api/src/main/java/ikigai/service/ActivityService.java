package ikigai.service;

import ikigai.Json.ActivityJson;
import ikigai.entity.Activity;
import ikigai.repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ActivityService {
    @Autowired
    private ActivityRepository activityRepository;

    @Transactional
    public Activity newActivity(ActivityJson json) {
        return activityRepository.save(json.activityFromJson());
    }
}
