package com.tnsif.adminservice.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tnsif.adminservice.entity.Admin;
import com.tnsif.adminservice.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminRepository adminRepository;

    // ✅ Get all admins
    @Override
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    // ✅ Get admin by ID
    @Override
    public Admin getAdminById(int id) {
        return adminRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Admin not found with id: " + id));
    }

    // ✅ Create a new admin
    @Override
    public Admin createAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    // ✅ Update existing admin
    @Override
    public Admin updateAdmin(int id, Admin admin) {
        Admin existing = adminRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Admin not found with id: " + id));

        existing.setName(admin.getName());
        existing.setEmail(admin.getEmail());
        existing.setPassword(admin.getPassword());
        existing.setPhone(admin.getPhone());
        existing.setRole(admin.getRole());
        existing.setAddress(admin.getAddress());

        return adminRepository.save(existing);
    }

    // ✅ Delete admin
    @Override
    public void deleteAdmin(int id) {
        Admin existing = adminRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Admin not found with id: " + id));
        adminRepository.delete(existing);
    }
}
