package com.vlad.putnikov.client;

import com.vlad.putnikov.dto.IndustryResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class IndustryServiceClient {

    @Autowired
    private RestTemplate restTemplate;

    public IndustryResponseDto getIndustryInfo(Long industryId) {
        return restTemplate.getForObject("http://INDUSTRY-SERVICE/industry/" + industryId, IndustryResponseDto.class);
    }
}
