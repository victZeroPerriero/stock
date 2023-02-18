package com.example.licenseapp.controller;

import com.example.licenseapp.common.JsonItem;
import com.example.licenseapp.common.JsonItemFactory;
import com.example.licenseapp.dto.LicenseDto;
import com.example.licenseapp.service.ServiceLicense;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/license/")
@RequiredArgsConstructor
public class LicenseController {

    private final ServiceLicense serviceLicense;

    @RequestMapping(value = "all/license", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<LicenseDto> getAll(){
        return serviceLicense.getAllLicense();
    }

    @RequestMapping(value = "find/{id}", method = RequestMethod.GET)
    public LicenseDto findById(@PathVariable("id") Long id) {
        return serviceLicense.findLicenseById(id);
    }
    @PostMapping("add")
    public JsonItem<LicenseDto> addLicense(@RequestBody LicenseDto licenseDto) {
        return JsonItemFactory.successResult(serviceLicense.addLicense(licenseDto));
    }
    @PutMapping("update")
    public JsonItem <LicenseDto> update(@RequestBody LicenseDto dto) {
        return JsonItemFactory.successResult(serviceLicense.updateLicense(dto));
    }
}
