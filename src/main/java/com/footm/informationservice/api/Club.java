package com.footm.informationservice.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Club {
    private String id;
    private String logo;

    public Club() {
    }

    public Club(String id, String logo) {
        this.id = id;
        this.logo = logo;
    }

    @JsonProperty
    public String getId() {
        return id;
    }

    @JsonProperty
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty
    public String getLogo() {
        return logo;
    }

    @JsonProperty
    public void setLogo(String logo) {
        this.logo = logo;
    }
}
