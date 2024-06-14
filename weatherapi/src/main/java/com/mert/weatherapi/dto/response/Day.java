package com.mert.weatherapi.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Day {

    @JsonProperty("maxtemp_c")
    private double maxTempC;

    @JsonProperty("mintemp_c")
    private double minTempC;

    @JsonProperty("totalprecip_mm")
    private double precipitation;

    @JsonProperty("avghumidity")
    private int avgHumidity;

    @JsonProperty("maxwind_mph")
    private double maxWindSpeed;

    @JsonProperty("condition")
    private Condition condition;
}
