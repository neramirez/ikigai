package ikigai.controller;

import ikigai.Json.MembershipJson;
import ikigai.entity.Membership;
import ikigai.service.MembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/membership")
public class MembershipController {
    @Autowired
    private MembershipService membershipService;

    @PostMapping("/new")
    public Membership newMembership(@RequestBody MembershipJson membershipJson) {
        return membershipService.newMembership(membershipJson);
    }

    @GetMapping("/all")
    public Iterable<Membership> getAllMemberships() {
        return membershipService.getAllMemberships();
    }

    @GetMapping("/get/{membershipId}")
    public Membership getMembership(@PathVariable Long membershipId) {
        return membershipService.getMembershipById(membershipId);
    }

    @PutMapping("/update/{membershipId}")
    public Membership updateMembership(@PathVariable Long membershipId, @RequestBody MembershipJson membershipJson) {
        return membershipService.updateMembership(membershipId, membershipJson);
    }

    @DeleteMapping("/delete/{membershipId}")
    public Boolean deleteMembership(@PathVariable Long membershipId) {
        return membershipService.deleteMembership(membershipId);
    }

}
