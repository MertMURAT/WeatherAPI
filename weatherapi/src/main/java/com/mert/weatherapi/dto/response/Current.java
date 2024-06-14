package com.mert.weatherapi.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Current {

    @JsonProperty("temp_c")
    private Double tempC;

    @JsonProperty("condition")
    private Condition condition;

}
