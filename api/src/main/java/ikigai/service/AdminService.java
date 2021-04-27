package ikigai.service;

import ikigai.Json.ActivityJson;
import ikigai.Json.AdminJson;
import ikigai.entity.Activity;
import ikigai.entity.Admin;
import ikigai.entity.Membership;
import ikigai.repository.ActivityRepository;
import ikigai.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    @Qualifier("getPasswordEncoder")
    private PasswordEncoder passwordEncoder;

    @Transactional
    public Admin newAdmin(AdminJson json) {
        return adminRepository.save(json.adminFromJson(passwordEncoder.encode(json.getPassword())));
    }

    public Iterable<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    public Admin getAdminById(Long adminId) {
        return adminRepository.findById(adminId).orElseThrow();
    }

    public Admin updateAdmin(Long adminId, AdminJson adminJson) {
        Admin admin = adminRepository.findById(adminId).orElseThrow();
        adminRepository.save(adminJson.adminUpdateFromJson(admin));
        return admin;
    }

    public Boolean deleteAdmin(Long adminId) {
        adminRepository.deleteById(adminId);
        return true;
    }
}
