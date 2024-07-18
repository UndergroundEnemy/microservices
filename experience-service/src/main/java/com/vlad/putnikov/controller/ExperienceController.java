package com.vlad.putnikov.controller;

import com.vlad.putnikov.client.IndustryServiceClient;
import com.vlad.putnikov.client.IndustryServiceFeignClient;
import com.vlad.putnikov.dto.ExperienceDto;
import com.vlad.putnikov.dto.IndustryResponseDto;
import com.vlad.putnikov.service.ExperienceServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/experience")
public class ExperienceController {

    @Autowired
    private ExperienceServiceService service;

//    @Autowired
//    private IndustryServiceClient industryClient;

    @Autowired
    private IndustryServiceFeignClient industryServiceFeignClient;

    @GetMapping("/{id}")
    public ExperienceDto getExperienceInfo(@PathVariable Long id) {
        return service.getExperienceById(id);
    }

    @GetMapping("/industry/{id}")
    public IndustryResponseDto getIndustryInfo(@PathVariable Long id) {
        return industryServiceFeignClient.getIndustryInfo(id);
    }

//    @GetMapping("/duty/{id}")
//    public ExperienceDto getExperienceByDutyId(@PathVariable Long id) {
//        return service.getExperienceById(id);
//    }

    @PostMapping("/")
    public void addExperience(@RequestBody ExperienceDto experienceDto) {
        service.addExperience(experienceDto);
    }
}
