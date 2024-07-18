package com.vlad.putnikov.service;

import com.vlad.putnikov.dto.ExperienceDto;
import com.vlad.putnikov.entity.Duty;
import com.vlad.putnikov.entity.Experience;
import com.vlad.putnikov.mapper.ExperienceMapper;
import com.vlad.putnikov.repository.DutyRepository;
import com.vlad.putnikov.repository.ExperienceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ExperienceServiceService {

    private final ExperienceRepository experienceRepository;
    private final DutyRepository dutyRepository;
    private final ExperienceMapper experienceMapper;

    public ExperienceDto getExperienceById(Long id) {
        Experience experience = experienceRepository.findById(id).orElseThrow(()-> new RuntimeException("not found"));
        return experienceMapper.fromEntityToDto(experience);
    }

    public Optional<Duty> getDutyByExperienceId(Long id) {
        return dutyRepository.findById(id);
    }

    @Transactional
    public void addExperience(ExperienceDto experienceDto) {
        experienceRepository.save(experienceMapper.fromDtoToEntity(experienceDto)); }
}

