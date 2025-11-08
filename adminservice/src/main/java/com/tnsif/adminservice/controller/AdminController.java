package com.tnsif.adminservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import com.tnsif.adminservice.entity.Admin;
import com.tnsif.adminservice.service.AdminService;

@RestController
@RequestMapping("/admins")
@CrossOrigin(origins = "http://localhost:3000")  // React frontend can connect easily
public class AdminController {

    @Autowired
    private AdminService adminService;

    // ✅ 1. Get all admins
    @GetMapping
    public List<Admin> getAllAdmins() {
        return adminService.getAllAdmins();
    }

    // ✅ 2. Get admin by ID
    @GetMapping("/{id}")
    public Admin getAdminById(@PathVariable int id) {
        return adminService.getAdminById(id);
    }

    // ✅ 3. Create new admin
    @PostMapping
    public Admin createAdmin(@RequestBody Admin admin) {
        return adminService.createAdmin(admin);
    }

    // ✅ 4. Update admin
    @PutMapping("/{id}")
    public Admin updateAdmin(@PathVariable int id, @RequestBody Admin admin) {
        return adminService.updateAdmin(id, admin);
    }

    // ✅ 5. Delete admin
    @DeleteMapping("/{id}")
    public void deleteAdmin(@PathVariable int id) {
        adminService.deleteAdmin(id);
    }
}
