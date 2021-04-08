package ikigai.service;

import ikigai.Json.RelativeJson;
import ikigai.entity.Relative;
import ikigai.repository.HomeRepository;
import ikigai.repository.RelativeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class RelativeService {
    @Autowired
    private HomeRepository homeRepository;

    @Autowired
    private RelativeRepository relativeRepository;

    @Transactional
    public Relative newRelative(RelativeJson json) {
        return relativeRepository.save(json.relativeFromJson(homeRepository.findById(json.getHomeId()).orElseThrow()));
    }
}
