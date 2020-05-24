package com.footm.informationservice.api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;


/**
 * The class PlayerFullSpecification is a JavaBean objects used to serialize and deserialize JSON request and response object by Jackson.
 * This object contains all the attributes(Basic+Skills+Positions) of a player
 *
 * @author Rinor Sefa
 * @author Lundrim Azemi
 */
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

    private int ls, st, rs, lw, lf, cf, rf, rw, lam, cam, ram, lm, lcm, cm, rcm, rm, lwb, ldm, cdm, rdm, rwb, lb, lcb,
            cb, rcb, rb;

    private int crossing, finishing, headingAccuracy,
            shortPassing, volleys, dribbling, curve, fkAccuracy,
            longPassing, ballControl, acceleration, sprintSpeed,
            agility, reactions, balance, shotPower, jumping, stamina,
            strength, longshots, aggression, interceptions, positioning,
            vision, penalties, composure, marking, standingTackle, slidingTackle,
            gkDiving, gkHandling, gkKicking, gkPositioning, gkReflexes;

    public PlayerFullSpecification(long id, String name, int age, String photo, String nationality, int overall, String club, int value, int wage, int releaseClause, String preferredFoot, int skillMoves, String workRate, String position, int jerseyNumber, String height, int weight, int ls, int st, int rs, int lw, int lf, int cf, int rf, int rw, int lam, int cam, int ram, int lm, int lcm, int cm, int rcm, int rm, int lwb, int ldm, int cdm, int rdm, int rwb, int lb, int lcb, int cb, int rcb, int rb, int crossing, int finishing, int headingAccuracy, int shortPassing, int volleys, int dribbling, int curve, int fkAccuracy, int longPassing, int ballControl, int acceleration, int sprintSpeed, int agility, int reactions, int balance, int shotPower, int jumping, int stamina, int strength, int longshots, int aggression, int interceptions, int positioning, int vision, int penalties, int composure, int marking, int standingTackle, int slidingTackle, int gkDiving, int gkHandling, int gkKicking, int gkPositioning, int gkReflexes) {
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
        this.ls = ls;
        this.st = st;
        this.rs = rs;
        this.lw = lw;
        this.lf = lf;
        this.cf = cf;
        this.rf = rf;
        this.rw = rw;
        this.lam = lam;
        this.cam = cam;
        this.ram = ram;
        this.lm = lm;
        this.lcm = lcm;
        this.cm = cm;
        this.rcm = rcm;
        this.rm = rm;
        this.lwb = lwb;
        this.ldm = ldm;
        this.cdm = cdm;
        this.rdm = rdm;
        this.rwb = rwb;
        this.lb = lb;
        this.lcb = lcb;
        this.cb = cb;
        this.rcb = rcb;
        this.rb = rb;
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
        this.aggression = aggression;
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
    public int getLs() {
        return ls;
    }

    @JsonProperty
    public void setLs(int ls) {
        this.ls = ls;
    }

    @JsonProperty
    public int getSt() {
        return st;
    }

    @JsonProperty
    public void setSt(int st) {
        this.st = st;
    }

    @JsonProperty
    public int getRs() {
        return rs;
    }

    @JsonProperty
    public void setRs(int rs) {
        this.rs = rs;
    }

    @JsonProperty
    public int getLw() {
        return lw;
    }

    @JsonProperty
    public void setLw(int lw) {
        this.lw = lw;
    }

    @JsonProperty
    public int getLf() {
        return lf;
    }

    @JsonProperty
    public void setLf(int lf) {
        this.lf = lf;
    }

    @JsonProperty
    public int getCf() {
        return cf;
    }

    @JsonProperty
    public void setCf(int cf) {
        this.cf = cf;
    }

    @JsonProperty
    public int getRf() {
        return rf;
    }

    @JsonProperty
    public void setRf(int rf) {
        this.rf = rf;
    }

    @JsonProperty
    public int getRw() {
        return rw;
    }

    @JsonProperty
    public void setRw(int rw) {
        this.rw = rw;
    }

    @JsonProperty
    public int getLam() {
        return lam;
    }

    @JsonProperty
    public void setLam(int lam) {
        this.lam = lam;
    }

    @JsonProperty
    public int getCam() {
        return cam;
    }

    @JsonProperty
    public void setCam(int cam) {
        this.cam = cam;
    }

    @JsonProperty
    public int getRam() {
        return ram;
    }

    @JsonProperty
    public void setRam(int ram) {
        this.ram = ram;
    }

    @JsonProperty
    public int getLm() {
        return lm;
    }

    @JsonProperty
    public void setLm(int lm) {
        this.lm = lm;
    }

    @JsonProperty
    public int getLcm() {
        return lcm;
    }

    @JsonProperty
    public void setLcm(int lcm) {
        this.lcm = lcm;
    }

    @JsonProperty
    public int getCm() {
        return cm;
    }

    @JsonProperty
    public void setCm(int cm) {
        this.cm = cm;
    }

    @JsonProperty
    public int getRcm() {
        return rcm;
    }

    @JsonProperty
    public void setRcm(int rcm) {
        this.rcm = rcm;
    }

    @JsonProperty
    public int getRm() {
        return rm;
    }

    @JsonProperty
    public void setRm(int rm) {
        this.rm = rm;
    }

    @JsonProperty
    public int getLwb() {
        return lwb;
    }

    @JsonProperty
    public void setLwb(int lwb) {
        this.lwb = lwb;
    }

    @JsonProperty
    public int getLdm() {
        return ldm;
    }

    @JsonProperty
    public void setLdm(int ldm) {
        this.ldm = ldm;
    }

    @JsonProperty
    public int getCdm() {
        return cdm;
    }

    @JsonProperty
    public void setCdm(int cdm) {
        this.cdm = cdm;
    }

    @JsonProperty
    public int getRdm() {
        return rdm;
    }

    @JsonProperty
    public void setRdm(int rdm) {
        this.rdm = rdm;
    }

    @JsonProperty
    public int getRwb() {
        return rwb;
    }

    @JsonProperty
    public void setRwb(int rwb) {
        this.rwb = rwb;
    }

    @JsonProperty
    public int getLb() {
        return lb;
    }

    @JsonProperty
    public void setLb(int lb) {
        this.lb = lb;
    }

    @JsonProperty
    public int getLcb() {
        return lcb;
    }

    @JsonProperty
    public void setLcb(int lcb) {
        this.lcb = lcb;
    }

    @JsonProperty
    public int getCb() {
        return cb;
    }

    @JsonProperty
    public void setCb(int cb) {
        this.cb = cb;
    }

    @JsonProperty
    public int getRcb() {
        return rcb;
    }

    @JsonProperty
    public void setRcb(int rcb) {
        this.rcb = rcb;
    }

    @JsonProperty
    public int getRb() {
        return rb;
    }

    @JsonProperty
    public void setRb(int rb) {
        this.rb = rb;
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
        return aggression;
    }

    @JsonProperty
    public void setAggression(int aggression) {
        this.aggression = aggression;
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
        PlayerFullSpecification that = (PlayerFullSpecification) o;
        return id == that.id &&
                age == that.age &&
                overall == that.overall &&
                value == that.value &&
                wage == that.wage &&
                releaseClause == that.releaseClause &&
                skillMoves == that.skillMoves &&
                jerseyNumber == that.jerseyNumber &&
                weight == that.weight &&
                ls == that.ls &&
                st == that.st &&
                rs == that.rs &&
                lw == that.lw &&
                lf == that.lf &&
                cf == that.cf &&
                rf == that.rf &&
                rw == that.rw &&
                lam == that.lam &&
                cam == that.cam &&
                ram == that.ram &&
                lm == that.lm &&
                lcm == that.lcm &&
                cm == that.cm &&
                rcm == that.rcm &&
                rm == that.rm &&
                lwb == that.lwb &&
                ldm == that.ldm &&
                cdm == that.cdm &&
                rdm == that.rdm &&
                rwb == that.rwb &&
                lb == that.lb &&
                lcb == that.lcb &&
                cb == that.cb &&
                rcb == that.rcb &&
                rb == that.rb &&
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
                aggression == that.aggression &&
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
                Objects.equals(name, that.name) &&
                Objects.equals(photo, that.photo) &&
                Objects.equals(nationality, that.nationality) &&
                Objects.equals(club, that.club) &&
                Objects.equals(preferredFoot, that.preferredFoot) &&
                Objects.equals(workRate, that.workRate) &&
                Objects.equals(position, that.position) &&
                Objects.equals(height, that.height);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, age, photo, nationality, overall, club, value, wage, releaseClause, preferredFoot, skillMoves, workRate, position, jerseyNumber, height, weight, ls, st, rs, lw, lf, cf, rf, rw, lam, cam, ram, lm, lcm, cm, rcm, rm, lwb, ldm, cdm, rdm, rwb, lb, lcb, cb, rcb, rb, crossing, finishing, headingAccuracy, shortPassing, volleys, dribbling, curve, fkAccuracy, longPassing, ballControl, acceleration, sprintSpeed, agility, reactions, balance, shotPower, jumping, stamina, strength, longshots, aggression, interceptions, positioning, vision, penalties, composure, marking, standingTackle, slidingTackle, gkDiving, gkHandling, gkKicking, gkPositioning, gkReflexes);
    }

    @Override
    public String toString() {
        return "PlayerFullSpecification{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", photo='" + photo + '\'' +
                ", nationality='" + nationality + '\'' +
                ", overall=" + overall +
                ", club='" + club + '\'' +
                ", value=" + value +
                ", wage=" + wage +
                ", releaseClause=" + releaseClause +
                ", preferredFoot='" + preferredFoot + '\'' +
                ", skillMoves=" + skillMoves +
                ", workRate='" + workRate + '\'' +
                ", position='" + position + '\'' +
                ", jerseyNumber=" + jerseyNumber +
                ", height='" + height + '\'' +
                ", weight=" + weight +
                ", ls=" + ls +
                ", st=" + st +
                ", rs=" + rs +
                ", lw=" + lw +
                ", lf=" + lf +
                ", cf=" + cf +
                ", rf=" + rf +
                ", rw=" + rw +
                ", lam=" + lam +
                ", cam=" + cam +
                ", ram=" + ram +
                ", lm=" + lm +
                ", lcm=" + lcm +
                ", cm=" + cm +
                ", rcm=" + rcm +
                ", rm=" + rm +
                ", lwb=" + lwb +
                ", ldm=" + ldm +
                ", cdm=" + cdm +
                ", rdm=" + rdm +
                ", rwb=" + rwb +
                ", lb=" + lb +
                ", lcb=" + lcb +
                ", cb=" + cb +
                ", rcb=" + rcb +
                ", rb=" + rb +
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
                ", Aggression=" + aggression +
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
