package com.vlad.putnikov.mapper;


import com.vlad.putnikov.dto.IndustryDto;
import com.vlad.putnikov.entity.Industry;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING,
        builder = @Builder(disableBuilder = true))
public interface IndustryMapper {

    IndustryDto fromEntityToDto(final Industry industry);
}
