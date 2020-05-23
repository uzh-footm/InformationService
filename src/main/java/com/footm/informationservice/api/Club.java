package com.footm.informationservice.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Club club = (Club) o;
        return Objects.equals(id, club.id) &&
                Objects.equals(logo, club.logo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, logo);
    }

    @Override
    public String toString() {
        return "Club{" +
                "id='" + id + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }
}
