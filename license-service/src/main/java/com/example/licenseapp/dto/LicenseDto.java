package com.example.licenseapp.dto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class LicenseDto {
    @JsonIgnore
    private Long id;
    private Long licenseId;
    private String description;
    private Integer organizationId;
    private String licenseType;
    private String productName;
}
