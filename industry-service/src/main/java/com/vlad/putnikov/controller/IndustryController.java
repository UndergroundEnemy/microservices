package com.vlad.putnikov.controller;

import com.vlad.putnikov.dto.IndustryDto;
import com.vlad.putnikov.service.IndustryServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/industry")
public class IndustryController {

    @Autowired
    private IndustryServiceService service;

    @GetMapping("/{id}")
    public IndustryDto get(@PathVariable Long id) {
        return service.getIndustryById(id);
    }

}
