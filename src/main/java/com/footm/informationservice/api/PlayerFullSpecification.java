package com.footm.informationservice.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerFullSpecification {
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

    private int LS, ST, RS, LW, LF, CF, RF, RW, LAM, CAM, RAM, LM, LCM, CM, RCM, RM, LWB, LDM, CDM, RDM, RWB, LB, LCB,
            CB, RCB, RB;

    private int crossing, finishing, headingAccuracy,
            shortPassing, volleys, dribbling, curve, fkAccuracy,
            longPassing, ballControl, acceleration, sprintSpeed,
            agility, reactions, balance, shotPower, jumping, stamina,
            strength, longshots, Aggression, interceptions, positioning,
            vision, penalties, composure, marking, standingTackle, slidingTackle,
            gkDiving, gkHandling, gkKicking, gkPositioning, gkReflexes;

    public PlayerFullSpecification(long id, String name, int age, String photo, String nationality, int overall, String club, int value, int wage, int releaseClause, String preferredFoot, int skillMoves, String workRate, String position, int jerseyNumber, String height, int weight, int LS, int ST, int RS, int LW, int LF, int CF, int RF, int RW, int LAM, int CAM, int RAM, int LM, int LCM, int CM, int RCM, int RM, int LWB, int LDM, int CDM, int RDM, int RWB, int LB, int LCB, int CB, int RCB, int RB, int crossing, int finishing, int headingAccuracy, int shortPassing, int volleys, int dribbling, int curve, int fkAccuracy, int longPassing, int ballControl, int acceleration, int sprintSpeed, int agility, int reactions, int balance, int shotPower, int jumping, int stamina, int strength, int longshots, int aggression, int interceptions, int positioning, int vision, int penalties, int composure, int marking, int standingTackle, int slidingTackle, int gkDiving, int gkHandling, int gkKicking, int gkPositioning, int gkReflexes) {
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
        this.LS = LS;
        this.ST = ST;
        this.RS = RS;
        this.LW = LW;
        this.LF = LF;
        this.CF = CF;
        this.RF = RF;
        this.RW = RW;
        this.LAM = LAM;
        this.CAM = CAM;
        this.RAM = RAM;
        this.LM = LM;
        this.LCM = LCM;
        this.CM = CM;
        this.RCM = RCM;
        this.RM = RM;
        this.LWB = LWB;
        this.LDM = LDM;
        this.CDM = CDM;
        this.RDM = RDM;
        this.RWB = RWB;
        this.LB = LB;
        this.LCB = LCB;
        this.CB = CB;
        this.RCB = RCB;
        this.RB = RB;
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
        Aggression = aggression;
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

    public PlayerFullSpecification() {
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

    @JsonProperty
    public void setId(long id) {
        this.id = id;
    }

    @JsonProperty
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty
    public void setAge(int age) {
        this.age = age;
    }

    @JsonProperty
    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @JsonProperty
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @JsonProperty
    public void setOverall(int overall) {
        this.overall = overall;
    }

    @JsonProperty
    public void setClub(String club) {
        this.club = club;
    }

    @JsonProperty
    public void setValue(int value) {
        this.value = value;
    }

    @JsonProperty
    public void setWage(int wage) {
        this.wage = wage;
    }

    @JsonProperty
    public void setReleaseClause(int releaseClause) {
        this.releaseClause = releaseClause;
    }

    @JsonProperty
    public void setPreferredFoot(String preferredFoot) {
        this.preferredFoot = preferredFoot;
    }

    @JsonProperty
    public void setSkillMoves(int skillMoves) {
        this.skillMoves = skillMoves;
    }

    @JsonProperty
    public void setWorkRate(String workRate) {
        this.workRate = workRate;
    }

    @JsonProperty
    public void setPosition(String position) {
        this.position = position;
    }

    @JsonProperty
    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    @JsonProperty
    public void setHeight(String height) {
        this.height = height;
    }

    @JsonProperty
    public void setWeight(int weight) {
        this.weight = weight;
    }

    @JsonProperty
    public int getLS() {
        return LS;
    }

    @JsonProperty
    public void setLS(int LS) {
        this.LS = LS;
    }

    @JsonProperty
    public int getST() {
        return ST;
    }

    @JsonProperty
    public void setST(int ST) {
        this.ST = ST;
    }

    @JsonProperty
    public int getRS() {
        return RS;
    }

    @JsonProperty
    public void setRS(int RS) {
        this.RS = RS;
    }

    @JsonProperty
    public int getLW() {
        return LW;
    }

    @JsonProperty
    public void setLW(int LW) {
        this.LW = LW;
    }

    @JsonProperty
    public int getLF() {
        return LF;
    }

    @JsonProperty
    public void setLF(int LF) {
        this.LF = LF;
    }

    @JsonProperty
    public int getCF() {
        return CF;
    }

    @JsonProperty
    public void setCF(int CF) {
        this.CF = CF;
    }

    @JsonProperty
    public int getRF() {
        return RF;
    }

    @JsonProperty
    public void setRF(int RF) {
        this.RF = RF;
    }

    @JsonProperty
    public int getRW() {
        return RW;
    }

    @JsonProperty
    public void setRW(int RW) {
        this.RW = RW;
    }

    @JsonProperty
    public int getLAM() {
        return LAM;
    }

    @JsonProperty
    public void setLAM(int LAM) {
        this.LAM = LAM;
    }

    @JsonProperty
    public int getCAM() {
        return CAM;
    }

    @JsonProperty
    public void setCAM(int CAM) {
        this.CAM = CAM;
    }

    @JsonProperty
    public int getRAM() {
        return RAM;
    }

    @JsonProperty
    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    @JsonProperty
    public int getLM() {
        return LM;
    }

    @JsonProperty
    public void setLM(int LM) {
        this.LM = LM;
    }

    @JsonProperty
    public int getLCM() {
        return LCM;
    }

    @JsonProperty
    public void setLCM(int LCM) {
        this.LCM = LCM;
    }

    @JsonProperty
    public int getCM() {
        return CM;
    }

    @JsonProperty
    public void setCM(int CM) {
        this.CM = CM;
    }

    @JsonProperty
    public int getRCM() {
        return RCM;
    }

    @JsonProperty
    public void setRCM(int RCM) {
        this.RCM = RCM;
    }

    @JsonProperty
    public int getRM() {
        return RM;
    }

    @JsonProperty
    public void setRM(int RM) {
        this.RM = RM;
    }

    @JsonProperty
    public int getLWB() {
        return LWB;
    }

    @JsonProperty
    public void setLWB(int LWB) {
        this.LWB = LWB;
    }

    @JsonProperty
    public int getLDM() {
        return LDM;
    }

    @JsonProperty
    public void setLDM(int LDM) {
        this.LDM = LDM;
    }

    @JsonProperty
    public int getCDM() {
        return CDM;
    }

    @JsonProperty
    public void setCDM(int CDM) {
        this.CDM = CDM;
    }

    @JsonProperty
    public int getRDM() {
        return RDM;
    }

    @JsonProperty
    public void setRDM(int RDM) {
        this.RDM = RDM;
    }

    @JsonProperty
    public int getRWB() {
        return RWB;
    }

    @JsonProperty
    public void setRWB(int RWB) {
        this.RWB = RWB;
    }

    @JsonProperty
    public int getLB() {
        return LB;
    }

    @JsonProperty
    public void setLB(int LB) {
        this.LB = LB;
    }

    @JsonProperty
    public int getLCB() {
        return LCB;
    }

    @JsonProperty
    public void setLCB(int LCB) {
        this.LCB = LCB;
    }

    @JsonProperty
    public int getCB() {
        return CB;
    }

    @JsonProperty
    public void setCB(int CB) {
        this.CB = CB;
    }

    @JsonProperty
    public int getRCB() {
        return RCB;
    }

    @JsonProperty
    public void setRCB(int RCB) {
        this.RCB = RCB;
    }

    @JsonProperty
    public int getRB() {
        return RB;
    }

    @JsonProperty
    public void setRB(int RB) {
        this.RB = RB;
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
}
