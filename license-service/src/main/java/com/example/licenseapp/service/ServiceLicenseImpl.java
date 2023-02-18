package com.example.licenseapp.service;

import com.example.licenseapp.dto.LicenseDto;
import com.example.licenseapp.mapper.LicenseMapper;
import com.example.licenseapp.model.License;
import com.example.licenseapp.repo.LicenseRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Locale;
import java.util.Objects;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class ServiceLicenseImpl implements ServiceLicense {
    private final LicenseRepo licenseRepo;
    private final LicenseMapper mapper;
    private final MessageSource message;
    @Override
    public List<LicenseDto> getAllLicense() {
        return mapper.fromListEntityToDto(licenseRepo.findAll());
    }

    @Override
    public LicenseDto findLicenseById(Long id) {
        return mapper.fromEntityToDto(licenseRepo.findById(id).orElse(null));
    }

    @Override
    public LicenseDto addLicense(LicenseDto dto) {
        License license = licenseRepo.save(mapper.fromDtoToEntity(dto));
        return mapper.fromEntityToDto(license);
    }

    @Override
    public LicenseDto updateLicense(LicenseDto dto) {
        License saveLicense = licenseRepo.findById(dto.getLicenseId()).orElse(null);
        log.info("found license from db for update {}", saveLicense);
        mapper.updateEntityFromDto(dto, saveLicense);
        if (saveLicense != null){
            log.info("updated license after mapper update {}", saveLicense);
            return mapper.fromEntityToDto( licenseRepo.save(saveLicense));
        }
           return null;
    }
    @Override
    public void deleteLicense(Long id) {
      licenseRepo.delete(Objects.requireNonNull(licenseRepo.findById(id).orElse(null)));
    }
}
