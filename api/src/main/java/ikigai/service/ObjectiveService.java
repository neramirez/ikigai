package ikigai.service;

import ikigai.Json.ObjectiveJson;
import ikigai.entity.Objective;
import ikigai.repository.ObjectiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ObjectiveService {
    @Autowired
    private ObjectiveRepository objectiveRepository;

    @Transactional
    public Objective newObjective(ObjectiveJson json) {
        return objectiveRepository.save(json.objectiveFromJson());
    }
}
