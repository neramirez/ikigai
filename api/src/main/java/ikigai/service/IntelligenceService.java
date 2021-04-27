package ikigai.service;

import ikigai.Json.IntelligenceJson;
import ikigai.entity.Intelligence;
import ikigai.repository.AreaRepository;
import ikigai.repository.IntelligenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class IntelligenceService {
    @Autowired
    private IntelligenceRepository intelligenceRepository;

    @Autowired
    private AreaRepository areaRepository;

    @Transactional
    public Intelligence newIntelligence(IntelligenceJson json) {
        return intelligenceRepository.save(json.intelligenceFromJson());
    }

    @Transactional
    public Intelligence generateIntelligenceArea(Long intelligenceId, Long areaId){
        Intelligence intelligence = intelligenceRepository.findById(intelligenceId).orElseThrow();
        intelligence.addArea(areaRepository.findById(areaId).orElseThrow());
        return intelligence;
    }
}
