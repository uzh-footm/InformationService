package com.footm.informationservice.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class PlayerSkills {
    private long id;
    private String name;
    private int crossing, finishing, headingAccuracy,
            shortPassing, volleys, dribbling, curve, fkAccuracy,
            longPassing, ballControl, acceleration, sprintSpeed,
            agility, reactions, balance, shotPower, jumping, stamina,
            strength, longshots, Aggression, interceptions, positioning,
            vision, penalties, composure, marking, standingTackle, slidingTackle,
            gkDiving, gkHandling, gkKicking, gkPositioning, gkReflexes;

    public PlayerSkills() {
    }

    public PlayerSkills(long id, String name, int crossing, int heading, int finishing, int headingAccuracy, int shortPassing, int volleys, int dribbling, int curve, int fkAccuracy, int longPassing, int ballControl, int acceleration, int sprintSpeed, int agility, int reactions, int balance, int shotPower, int jumping, int stamina, int strength, int longshots, int Aggression, int interceptions, int positioning, int vision, int penalties, int composure, int marking, int standingTackle, int slidingTackle, int gkDiving, int gkHandling, int gkKicking, int gkPositioning, int gkReflexes) {
        this.id = id;
        this.name = name;
        this.crossing = crossing;
        this.finishing = finishing;
        this.headingAccuracy = headingAccuracy;
        this.shortPassing = shortPassing;
        this.volleys = volleys;
        this.dribbling = dribbling;
        this.curve = curve;
        this.fkAccuracy = fkAccuracy;
        this.longPassing = longPassing;
        this.ballControl = ballControl;
        this.acceleration = acceleration;
        this.sprintSpeed = sprintSpeed;
        this.agility = agility;
        this.reactions = reactions;
        this.balance = balance;
        this.shotPower = shotPower;
        this.jumping = jumping;
        this.stamina = stamina;
        this.strength = strength;
        this.longshots = longshots;
        this.Aggression = Aggression;
        this.interceptions = interceptions;
        this.positioning = positioning;
        this.vision = vision;
        this.penalties = penalties;
        this.composure = composure;
        this.marking = marking;
        this.standingTackle = standingTackle;
        this.slidingTackle = slidingTackle;
        this.gkDiving = gkDiving;
        this.gkHandling = gkHandling;
        this.gkKicking = gkKicking;
        this.gkPositioning = gkPositioning;
        this.gkReflexes = gkReflexes;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public void setId(long id) {
        this.id = id;
    }

    @JsonProperty
    public String getName() {
        return name;
    }

    @JsonProperty
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty
    public int getCrossing() {
        return crossing;
    }

    @JsonProperty
    public void setCrossing(int crossing) {
        this.crossing = crossing;
    }

    @JsonProperty
    public int getFinishing() {
        return finishing;
    }

    @JsonProperty
    public void setFinishing(int finishing) {
        this.finishing = finishing;
    }

    @JsonProperty
    public int getHeadingAccuracy() {
        return headingAccuracy;
    }

    @JsonProperty
    public void setHeadingAccuracy(int headingAccuracy) {
        this.headingAccuracy = headingAccuracy;
    }

    @JsonProperty
    public int getShortPassing() {
        return shortPassing;
    }

    @JsonProperty
    public void setShortPassing(int shortPassing) {
        this.shortPassing = shortPassing;
    }

    @JsonProperty
    public int getVolleys() {
        return volleys;
    }

    @JsonProperty
    public void setVolleys(int volleys) {
        this.volleys = volleys;
    }

    @JsonProperty
    public int getDribbling() {
        return dribbling;
    }

    @JsonProperty
    public void setDribbling(int dribbling) {
        this.dribbling = dribbling;
    }

    @JsonProperty
    public int getCurve() {
        return curve;
    }

    @JsonProperty
    public void setCurve(int curve) {
        this.curve = curve;
    }

    @JsonProperty
    public int getFkAccuracy() {
        return fkAccuracy;
    }

    @JsonProperty
    public void setFkAccuracy(int fkAccuracy) {
        this.fkAccuracy = fkAccuracy;
    }

    @JsonProperty
    public int getLongPassing() {
        return longPassing;
    }

    @JsonProperty
    public void setLongPassing(int longPassing) {
        this.longPassing = longPassing;
    }

    @JsonProperty
    public int getBallControl() {
        return ballControl;
    }

    @JsonProperty
    public void setBallControl(int ballControl) {
        this.ballControl = ballControl;
    }

    @JsonProperty
    public int getAcceleration() {
        return acceleration;
    }

    @JsonProperty
    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    @JsonProperty
    public int getSprintSpeed() {
        return sprintSpeed;
    }

    @JsonProperty
    public void setSprintSpeed(int sprintTpeed) {
        this.sprintSpeed = sprintTpeed;
    }

    @JsonProperty
    public int getAgility() {
        return agility;
    }

    @JsonProperty
    public void setAgility(int agility) {
        this.agility = agility;
    }

    @JsonProperty
    public int getReactions() {
        return reactions;
    }

    @JsonProperty
    public void setReactions(int reactions) {
        this.reactions = reactions;
    }

    @JsonProperty
    public int getBalance() {
        return balance;
    }

    @JsonProperty
    public void setBalance(int balance) {
        this.balance = balance;
    }

    @JsonProperty
    public int getShotPower() {
        return shotPower;
    }

    @JsonProperty
    public void setShotPower(int shotPower) {
        this.shotPower = shotPower;
    }

    @JsonProperty
    public int getJumping() {
        return jumping;
    }

    @JsonProperty
    public void setJumping(int jumping) {
        this.jumping = jumping;
    }

    @JsonProperty
    public int getStamina() {
        return stamina;
    }

    @JsonProperty
    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    @JsonProperty
    public int getStrength() {
        return strength;
    }

    @JsonProperty
    public void setStrength(int strength) {
        this.strength = strength;
    }

    @JsonProperty
    public int getLongshots() {
        return longshots;
    }

    @JsonProperty
    public void setLongshots(int longshots) {
        this.longshots = longshots;
    }

    @JsonProperty
    public int getAggression() {
        return Aggression;
    }

    @JsonProperty
    public void setAggression(int Aggression) {
        this.Aggression = Aggression;
    }

    @JsonProperty
    public int getInterceptions() {
        return interceptions;
    }

    @JsonProperty
    public void setInterceptions(int interceptions) {
        this.interceptions = interceptions;
    }

    @JsonProperty
    public int getPositioning() {
        return positioning;
    }

    @JsonProperty
    public void setPositioning(int positioning) {
        this.positioning = positioning;
    }

    @JsonProperty
    public int getVision() {
        return vision;
    }

    @JsonProperty
    public void setVision(int vision) {
        this.vision = vision;
    }

    @JsonProperty
    public int getPenalties() {
        return penalties;
    }

    @JsonProperty
    public void setPenalties(int penalties) {
        this.penalties = penalties;
    }

    @JsonProperty
    public int getComposure() {
        return composure;
    }

    @JsonProperty
    public void setComposure(int composure) {
        this.composure = composure;
    }

    @JsonProperty
    public int getMarking() {
        return marking;
    }

    @JsonProperty
    public void setMarking(int marking) {
        this.marking = marking;
    }

    @JsonProperty
    public int getStandingTackle() {
        return standingTackle;
    }

    @JsonProperty
    public void setStandingTackle(int standingTackle) {
        this.standingTackle = standingTackle;
    }

    @JsonProperty
    public int getSlidingTackle() {
        return slidingTackle;
    }

    @JsonProperty
    public void setSlidingTackle(int slidingTackle) {
        this.slidingTackle = slidingTackle;
    }

    @JsonProperty
    public int getGkDiving() {
        return gkDiving;
    }

    @JsonProperty
    public void setGkDiving(int gkDiving) {
        this.gkDiving = gkDiving;
    }

    @JsonProperty
    public int getGkHandling() {
        return gkHandling;
    }

    @JsonProperty
    public void setGkHandling(int gkHandling) {
        this.gkHandling = gkHandling;
    }

    @JsonProperty
    public int getGkKicking() {
        return gkKicking;
    }

    @JsonProperty
    public void setGkKicking(int gkKicking) {
        this.gkKicking = gkKicking;
    }

    @JsonProperty
    public int getGkPositioning() {
        return gkPositioning;
    }

    @JsonProperty
    public void setGkPositioning(int gkPositioning) {
        this.gkPositioning = gkPositioning;
    }

    @JsonProperty
    public int getGkReflexes() {
        return gkReflexes;
    }

    @JsonProperty
    public void setGkReflexes(int gkReflexes) {
        this.gkReflexes = gkReflexes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayerSkills that = (PlayerSkills) o;
        return id == that.id &&
                crossing == that.crossing &&
                finishing == that.finishing &&
                headingAccuracy == that.headingAccuracy &&
                shortPassing == that.shortPassing &&
                volleys == that.volleys &&
                dribbling == that.dribbling &&
                curve == that.curve &&
                fkAccuracy == that.fkAccuracy &&
                longPassing == that.longPassing &&
                ballControl == that.ballControl &&
                acceleration == that.acceleration &&
                sprintSpeed == that.sprintSpeed &&
                agility == that.agility &&
                reactions == that.reactions &&
                balance == that.balance &&
                shotPower == that.shotPower &&
                jumping == that.jumping &&
                stamina == that.stamina &&
                strength == that.strength &&
                longshots == that.longshots &&
                Aggression == that.Aggression &&
                interceptions == that.interceptions &&
                positioning == that.positioning &&
                vision == that.vision &&
                penalties == that.penalties &&
                composure == that.composure &&
                marking == that.marking &&
                standingTackle == that.standingTackle &&
                slidingTackle == that.slidingTackle &&
                gkDiving == that.gkDiving &&
                gkHandling == that.gkHandling &&
                gkKicking == that.gkKicking &&
                gkPositioning == that.gkPositioning &&
                gkReflexes == that.gkReflexes &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, crossing, finishing, headingAccuracy, shortPassing, volleys, dribbling, curve, fkAccuracy, longPassing, ballControl, acceleration, sprintSpeed, agility, reactions, balance, shotPower, jumping, stamina, strength, longshots, Aggression, interceptions, positioning, vision, penalties, composure, marking, standingTackle, slidingTackle, gkDiving, gkHandling, gkKicking, gkPositioning, gkReflexes);
    }

    @Override
    public String toString() {
        return "PlayerSkills{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", crossing=" + crossing +
                ", finishing=" + finishing +
                ", headingAccuracy=" + headingAccuracy +
                ", shortPassing=" + shortPassing +
                ", volleys=" + volleys +
                ", dribbling=" + dribbling +
                ", curve=" + curve +
                ", fkAccuracy=" + fkAccuracy +
                ", longPassing=" + longPassing +
                ", ballControl=" + ballControl +
                ", acceleration=" + acceleration +
                ", sprintSpeed=" + sprintSpeed +
                ", agility=" + agility +
                ", reactions=" + reactions +
                ", balance=" + balance +
                ", shotPower=" + shotPower +
                ", jumping=" + jumping +
                ", stamina=" + stamina +
                ", strength=" + strength +
                ", longshots=" + longshots +
                ", Aggression=" + Aggression +
                ", interceptions=" + interceptions +
                ", positioning=" + positioning +
                ", vision=" + vision +
                ", penalties=" + penalties +
                ", composure=" + composure +
                ", marking=" + marking +
                ", standingTackle=" + standingTackle +
                ", slidingTackle=" + slidingTackle +
                ", gkDiving=" + gkDiving +
                ", gkHandling=" + gkHandling +
                ", gkKicking=" + gkKicking +
                ", gkPositioning=" + gkPositioning +
                ", gkReflexes=" + gkReflexes +
                '}';
    }
}
