package com.footm.informationservice.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerPositions {
    private long id;
    private String name;
    private int LS ,ST , RS , LW,LF ,CF ,RF ,RW ,LAM ,CAM ,RAM ,LM ,LCM ,CM ,RCM ,RM ,LWB ,LDM ,CDM ,RDM ,RWB ,LB ,LCB ,
            CB , RCB ,RB;

    public PlayerPositions() {
    }

    public PlayerPositions(long id, String name, int LS, int ST, int RS, int LW, int LF, int CF, int RF, int RW, int LAM, int CAM, int RAM, int LM, int LCM, int CM, int RCM, int RM, int LWB, int LDM, int CDM, int RDM, int RWB, int LB, int LCB, int CB, int RCB, int RB) {
        this.id = id;
        this.name = name;
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
    }

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
}
