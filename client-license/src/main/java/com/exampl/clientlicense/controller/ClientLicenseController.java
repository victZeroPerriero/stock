package com.exampl.clientlicense.controller;

import com.exampl.clientlicense.dto.LicenseDto;
import com.exampl.clientlicense.service.ServiceClientLicenseImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client/")
@RequiredArgsConstructor
public class ClientLicenseController {
    private final ServiceClientLicenseImpl serviceClientLicense;

    @GetMapping("licenses")
    public List<LicenseDto> getAll(){
      return serviceClientLicense.getAll();
    }
    @PostMapping("add")
    public LicenseDto addLicense(@RequestBody LicenseDto dto){
       return serviceClientLicense.add(dto);
    }
}
