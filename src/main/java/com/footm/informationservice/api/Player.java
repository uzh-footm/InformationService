package com.footm.informationservice.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Player {
    private long id;
    private String name;
    private int age;
    private String photo;
    private String nationality;
    private int overall;
    private String club;
    private int value;
    private int wage;
    private int releaseClause;
    private String preferredFoot;
    private int skillMoves;
    private String workRate;
    private String position;
    private int jerseyNumber;
    private String height;
    private int weight;

    public Player() {
    }

    public Player(long id, String name, int age, String photo, String nationality, int overall, String club, int value, int wage, int releaseClause, String preferredFoot, int skillMoves, String workRate, String position, int jerseyNumber, String height, int weight) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.photo = photo;
        this.nationality = nationality;
        this.overall = overall;
        this.club = club;
        this.value = value;
        this.wage = wage;
        this.releaseClause = releaseClause;
        this.preferredFoot = preferredFoot;
        this.skillMoves = skillMoves;
        this.workRate = workRate;
        this.position = position;
        this.jerseyNumber = jerseyNumber;
        this.height = height;
        this.weight = weight;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getName() {
        return name;
    }

    @JsonProperty
    public int getAge() {
        return age;
    }

    @JsonProperty
    public String getPhoto() {
        return photo;
    }

    @JsonProperty
    public String getNationality() {
        return nationality;
    }

    @JsonProperty
    public int getOverall() {
        return overall;
    }

    @JsonProperty
    public String getClub() {
        return club;
    }

    @JsonProperty
    public int getValue() {
        return value;
    }

    @JsonProperty
    public int getWage() {
        return wage;
    }

    @JsonProperty
    public int getReleaseClause() {
        return releaseClause;
    }

    @JsonProperty
    public String getPreferredFoot() {
        return preferredFoot;
    }

    @JsonProperty
    public int getSkillMoves() {
        return skillMoves;
    }

    @JsonProperty
    public String getWorkRate() {
        return workRate;
    }

    @JsonProperty
    public String getPosition() {
        return position;
    }

    @JsonProperty
    public int getJerseyNumber() {
        return jerseyNumber;
    }

    @JsonProperty
    public String getHeight() {
        return height;
    }

    @JsonProperty
    public int getWeight() {
        return weight;
    }
}
