package ikigai.service;

import ikigai.Json.HomeJson;
import ikigai.entity.Home;
import ikigai.repository.HomeRepository;
import ikigai.repository.MembershipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class HomeService {
    @Autowired
    private HomeRepository homeRepository;

    @Autowired
    private MembershipRepository membershipRepository;

    @Transactional
    public Home newHome(HomeJson json) {
        return homeRepository.save(json.homeFromJson(membershipRepository.findById(json.getMembershipId()).orElseThrow()));
    }
}
