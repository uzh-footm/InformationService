package com.footm.informationservice.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


/**
 * The class Nationality is a JavaBean objects used to serialize and deserialize JSON request and response object by Jackson.
 *
 * @author Rinor Sefa
 * @author Lundrim Azemi
 */
public class Nationality {
    private String id;
    private String logo;

    public Nationality() {

    }

    public Nationality(String id, String logo) {
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
        Nationality that = (Nationality) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(logo, that.logo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, logo);
    }

    @Override
    public String toString() {
        return "Nationality{" +
                "id='" + id + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }
}

