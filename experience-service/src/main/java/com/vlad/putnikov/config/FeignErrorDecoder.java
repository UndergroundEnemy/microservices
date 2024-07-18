package com.vlad.putnikov.config;

import feign.Response;
import feign.codec.ErrorDecoder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

public class FeignErrorDecoder implements ErrorDecoder {

    private final static Logger LOGGER = LoggerFactory.getLogger(FeignErrorDecoder.class);

    @Override
    public Exception decode(String methodKey, Response response) {
        switch (response.status()) {
            case 400:
                break;
            case 401:
                if (methodKey.contains("getIndustryInfo")) {
                    return new ResponseStatusException(HttpStatusCode.valueOf(404), "Industry Servce is not available");
                }
                LOGGER.error("Industry is not available");
                break;
            default:
                return new Exception(response.reason());
        }
        return null;
    }
}
