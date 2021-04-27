package ikigai.service;

import ikigai.Json.MembershipJson;
import ikigai.entity.Membership;
import ikigai.repository.MembershipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MembershipService {
    @Autowired
    private MembershipRepository membershipRepository;

    @Transactional
    public Membership newMembership(MembershipJson json) {
        return membershipRepository.save(json.membershipFromJson());
    }

    public Membership getMembershipById(Long membershipId) {
        return membershipRepository.findById(membershipId).orElseThrow();
    }

    public Membership updateMembership(Long membershipId, MembershipJson json) {
        Membership membership = getMembershipById(membershipId);
        membershipRepository.save(json.membershipUpdateFromJson(membership));
        return membership;
    }

    public Boolean deleteMembership(Long membershipId) {
        membershipRepository.deleteById(membershipId);
        return true;
    }

    public Iterable<Membership> getAllMemberships() {
        return membershipRepository.findAll();
    }
}
