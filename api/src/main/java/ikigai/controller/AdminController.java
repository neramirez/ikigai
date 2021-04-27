package ikigai.controller;

import ikigai.Json.ActivityJson;
import ikigai.Json.AdminJson;
import ikigai.Json.MembershipJson;
import ikigai.entity.Activity;
import ikigai.entity.Admin;
import ikigai.entity.Membership;
import ikigai.service.ActivityService;
import ikigai.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping("/new")
    public Admin newAdmin(@RequestBody AdminJson adminJson) {
        return adminService.newAdmin(adminJson);
    }
    @GetMapping("/all")
    public Iterable<Admin> getAllMemberships() {
        return adminService.getAllAdmins();
    }

    @GetMapping("/get/{adminId}")
    public Admin getMembership(@PathVariable Long adminId) {
        return adminService.getAdminById(adminId);
    }

    @PutMapping("/update/{adminId}")
    public Admin updateMembership(@PathVariable Long adminId, @RequestBody AdminJson adminJson) {
        return adminService.updateAdmin(adminId, adminJson);
    }

    @DeleteMapping("/delete/{adminId}")
    public Boolean deleteMembership(@PathVariable Long adminId) {
        return adminService.deleteAdmin(adminId);
    }
}
