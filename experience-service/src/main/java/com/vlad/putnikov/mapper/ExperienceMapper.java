package com.vlad.putnikov.mapper;

import com.vlad.putnikov.dto.ExperienceDto;
import com.vlad.putnikov.entity.Experience;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ExperienceMapper {

    Experience fromDtoToEntity(ExperienceDto experienceDto);

    ExperienceDto fromEntityToDto(Experience experience);
}
