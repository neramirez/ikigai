package ikigai.service;

import ikigai.Json.DimensionJson;
import ikigai.entity.Dimension;
import ikigai.repository.DimensionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DimensionService {
    @Autowired
    private DimensionRepository dimensionRepository;

    @Transactional
    public Dimension newDimension(DimensionJson json) {
        return dimensionRepository.save(json.dimensionFromJson());
    }
}
