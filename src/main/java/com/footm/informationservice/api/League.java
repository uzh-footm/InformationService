package com.footm.informationservice.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * The class League is a JavaBean objects used to serialize and deserialize JSON request and response object by Jackson.
 *
 * @author Rinor Sefa
 * @author Lundrim Azemi
 */
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        League league = (League) o;
        return Objects.equals(id, league.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "League{" +
                "id='" + id + '\'' +
                '}';
    }
}
