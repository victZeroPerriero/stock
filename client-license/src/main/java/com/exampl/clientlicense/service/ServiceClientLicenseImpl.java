package com.exampl.clientlicense.service;

import com.exampl.clientlicense.dto.LicenseDto;
import com.exampl.clientlicense.feign.ServiceClientLicense;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ServiceClientLicenseImpl {
    private final ServiceClientLicense serviceClientLicense;
    public List<LicenseDto> getAll(){
        log.info("get all from license from remote service {}", serviceClientLicense.getAllLicense());
        return serviceClientLicense.getAllLicense();
    }
    public LicenseDto add(LicenseDto dto) {
        log.info("request dto to pass for remote licence swervice {}", dto);
       return serviceClientLicense.addLicense(dto);
    }
}
