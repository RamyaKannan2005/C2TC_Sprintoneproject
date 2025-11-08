package com.tnsif.adminservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tnsif.adminservice.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
    // You can add custom queries here if needed
    // Example:
    // Optional<Admin> findByEmail(String email);
}
