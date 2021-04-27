package ikigai.service;

import ikigai.Json.DimensionJson;
import ikigai.entity.Dimension;
import ikigai.repository.DimensionRepository;
import ikigai.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DimensionService {
    @Autowired
    private DimensionRepository dimensionRepository;

    @Autowired
    private TopicRepository topicRepository;

    @Transactional
    public Dimension newDimension(DimensionJson json) {
        return dimensionRepository.save(json.dimensionFromJson());
    }

    @Transactional
    public Dimension generateDimensionTopic(Long dimensionId, Long topicId){
        Dimension dimension = dimensionRepository.findById(dimensionId).orElseThrow();
        dimension.addTopic(topicRepository.findById(topicId).orElseThrow());
        return dimension;
    }
}
