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
}
