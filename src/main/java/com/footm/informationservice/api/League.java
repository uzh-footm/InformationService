package com.footm.informationservice.api;

import com.fasterxml.jackson.annotation.JsonProperty;


public class League {
    private String id;

    public League() {
    }

    public League(String id) {
        this.id = id;
    }

    @JsonProperty
    public String getId() {
        return id;
    }

    @JsonProperty
    public void setId(String id) {
        this.id = id;
    }
}
