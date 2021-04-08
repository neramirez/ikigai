package ikigai.service;

import ikigai.Json.IntelligenceJson;
import ikigai.entity.Intelligence;
import ikigai.repository.IntelligenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class IntelligenceService {
    @Autowired
    private IntelligenceRepository intelligenceRepository;

    @Transactional
    public Intelligence newIntelligence(IntelligenceJson json) {
        return intelligenceRepository.save(json.intelligenceFromJson());
    }
}
