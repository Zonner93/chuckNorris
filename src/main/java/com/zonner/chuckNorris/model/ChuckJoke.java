package com.zonner.chuckNorris.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class ChuckJoke {
    private String value;

    @Override
    public String toString() {
        return value;
    }
}
