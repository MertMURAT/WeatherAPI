package com.mert.weatherapi.service;

import com.mert.weatherapi.dto.request.WeatherRequest;
import com.mert.weatherapi.exception.WeatherApiException;
import com.mert.weatherapi.dto.response.WeatherResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class WeatherService {

    @Value("${api.key}")
    private String apiKey;

    private final RestTemplate restTemplate;

    public WeatherResponse getWeather(WeatherRequest request) {
        String apiUrl = buildApiUrl(request);
        try {
            return restTemplate.getForObject(apiUrl, WeatherResponse.class);
        } catch (RestClientException e) {
            throw new WeatherApiException("Failed to get weather data from external API: " + e.getMessage(), e);
        }
    }

    private String buildApiUrl(WeatherRequest request) {
        String endpoint;
        switch (request.getPeriod().toLowerCase()) {
            case "weekly":
                endpoint = "forecast.json";
                return String.format("https://api.weatherapi.com/v1/%s?key=%s&q=%s,%s&days=7", endpoint, apiKey, request.getCity(), request.getCountry());
            case "monthly":
                endpoint = "forecast.json";
                return String.format("https://api.weatherapi.com/v1/%s?key=%s&q=%s,%s&days=30", endpoint, apiKey, request.getCity(), request.getCountry());
            default:
                endpoint = "forecast.json";
                return String.format("https://api.weatherapi.com/v1/%s?key=%s&q=%s,%s", endpoint, apiKey, request.getCity(), request.getCountry());
        }
    }
}
