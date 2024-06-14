package com.mert.weatherapi.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class ForecastDay {

    @JsonProperty("date")
    private LocalDate date;

    @JsonProperty("day")
    private Day day;

}
