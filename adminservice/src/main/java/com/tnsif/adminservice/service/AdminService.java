package com.tnsif.adminservice.service;

import java.util.List;
import com.tnsif.adminservice.entity.Admin;

public interface AdminService {
    List<Admin> getAllAdmins();
    Admin getAdminById(int id);
    Admin createAdmin(Admin admin);
    Admin updateAdmin(int id, Admin admin);
    void deleteAdmin(int id);
}
