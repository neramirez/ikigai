package ikigai.service;

import ikigai.Json.AreaJson;
import ikigai.entity.Area;
import ikigai.entity.Dimension;
import ikigai.entity.Intelligence;
import ikigai.repository.AreaRepository;
import ikigai.repository.DimensionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AreaService {
    @Autowired
    private AreaRepository areaRepository;

    @Autowired
    DimensionRepository dimensionRepository;

    @Transactional
    public Area newArea(AreaJson json) {
        return areaRepository.save(json.areaFromJson());
    }

    @Transactional
    public Area generateDimensionArea(Long dimensionId, Long areaId) {
        Area area = areaRepository.findById(areaId).orElseThrow();
        area.addDimension(dimensionRepository.findById(dimensionId).orElseThrow());
        return area;
    }
}
