package com.example.licenseapp.mapper;

import com.example.licenseapp.dto.LicenseDto;
import com.example.licenseapp.model.License;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.FIELD)
public interface LicenseMapper {
    License fromDtoToEntity(LicenseDto dto);
    LicenseDto fromEntityToDto(License license);
    @Mapping(source = "updateDto.id", target = "id", ignore = true)
    void updateEntityFromDto(LicenseDto updateDto, @MappingTarget License license);
    List<LicenseDto> fromListEntityToDto(List<License> entity);
}
