package com.mert.weatherapi.controller;

import com.mert.weatherapi.dto.request.WeatherRequest;
import com.mert.weatherapi.dto.response.WeatherResponse;
import com.mert.weatherapi.service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/weathers")
@RequiredArgsConstructor
public class WeatherController {

    private final WeatherService weatherService;

    @GetMapping
    public WeatherResponse getWeather(@RequestBody WeatherRequest request){
        return weatherService.getWeather(request);
    }
}
