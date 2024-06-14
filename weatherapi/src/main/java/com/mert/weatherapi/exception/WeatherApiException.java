package com.mert.weatherapi.exception;

import org.springframework.web.client.RestClientException;

public class WeatherApiException extends RuntimeException {
    public WeatherApiException(String message, RestClientException e){
        super(message);
    }
}
