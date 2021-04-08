package ikigai.service;

import ikigai.Json.MembershipJson;
import ikigai.entity.Membership;
import ikigai.repository.MembershipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MembershipService {
    @Autowired
    private MembershipRepository membershipRepository;

    @Transactional
    public Membership newMembership(MembershipJson json) {
        return membershipRepository.save(json.membershipFromJson());
    }
}
