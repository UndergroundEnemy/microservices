package com.vlad.putnikov.client;

import com.vlad.putnikov.dto.IndustryResponseDto;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "INDUSTRY-SERVICE")
public interface IndustryServiceFeignClient {

    @GetMapping("/industry/{id}")
    @Retry(name = "industry-service", fallbackMethod = "getIndustryInfoFallback")
    @CircuitBreaker(name = "industry-service", fallbackMethod = "getIndustryInfoFallback")
    IndustryResponseDto getIndustryInfo (@RequestParam Long id);

    default IndustryResponseDto getIndustryInfoFallback(Long id, Throwable exception) {
        System.out.println("industryId: " + id);
        System.out.println("exception: " + exception);
        return new IndustryResponseDto(1L, "Dr pepper");
    }
}
