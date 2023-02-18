package com.example.licenseapp.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "license")
public class License {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "license_id")
    private Long licenseId;
    @Column(name = "description")
    private String description;
    @Column(name = "organization_id")
    private Long organizationId;
    @Column(name = "product_name")
    private String productName;
}
