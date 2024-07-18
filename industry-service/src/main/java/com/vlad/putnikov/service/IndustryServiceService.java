package com.vlad.putnikov.service;

import com.vlad.putnikov.dto.IndustryDto;
import com.vlad.putnikov.entity.Industry;
import com.vlad.putnikov.mapper.IndustryMapper;
import com.vlad.putnikov.repository.IndustryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IndustryServiceService {

    private final IndustryRepository industryRepository;

    private final IndustryMapper industryMapper;

    public IndustryDto getIndustryById(Long id) {
        Industry industry = industryRepository.findById(id).orElseThrow(()-> new RuntimeException("not found"));
        return industryMapper.fromEntityToDto(industry);
    }
}
