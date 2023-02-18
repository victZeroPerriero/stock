package com.example.licenseapp.service;

import com.example.licenseapp.dto.LicenseDto;
import com.example.licenseapp.model.License;

import java.util.List;

public interface ServiceLicense {
    List<LicenseDto> getAllLicense();
    LicenseDto findLicenseById(Long id);
    LicenseDto addLicense(LicenseDto dto);
    LicenseDto updateLicense(LicenseDto dto);
    void deleteLicense(Long id);
}
