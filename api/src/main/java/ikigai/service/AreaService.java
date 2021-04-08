package ikigai.service;

import ikigai.Json.AreaJson;
import ikigai.entity.Area;
import ikigai.repository.AreaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AreaService {
    @Autowired
    private AreaRepository areaRepository;

    @Transactional
    public Area newArea(AreaJson json) {
        return areaRepository.save(json.areaFromJson());
    }
}
