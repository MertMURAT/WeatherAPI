package com.mert.weatherapi.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Condition {

    @JsonProperty("text")
    private String text;


//    @JsonProperty("icon")
//    private String icon;

}

