package com.example.licenseapp.repo;

import com.example.licenseapp.model.License;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LicenseRepo extends JpaRepository<License, Long> {
}
