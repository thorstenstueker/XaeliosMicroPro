/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datatypes;

import java.util.ArrayList;

/**
 *
 * @author thorstenstueker
 */
public class therapymodel {
    public String number,progname,reason,date,personnumber,follows,battpoints,type;
    public ArrayList<String> program,programhigh,programlow,progammiddle,padspos,measurea,measureb,measurec,measured,measuree,measuref,measureg,measureh,measuren,scana,scanb,scanc,scand,scane,scanf,scang,scanh=new ArrayList<>();
    public boolean hasscan,isfollowupmode,isthreetargetprg=false;
    public int targeta,targetb,targetc,targetd,targete,targetf,targetg,targeth;
    public int xposactual,xposmax,durationseconds;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getProgname() {
        return progname;
    }

    public void setProgname(String progname) {
        this.progname = progname;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPersonnumber() {
        return personnumber;
    }

    public void setPersonnumber(String personnumber) {
        this.personnumber = personnumber;
    }

    public String getFollows() {
        return follows;
    }

    public void setFollows(String follows) {
        this.follows = follows;
    }

    public String getBattpoints() {
        return battpoints;
    }

    public void setBattpoints(String battpoints) {
        this.battpoints = battpoints;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<String> getProgram() {
        return program;
    }

    public void setProgram(ArrayList<String> program) {
        this.program = program;
    }

    public ArrayList<String> getProgramhigh() {
        return programhigh;
    }

    public void setProgramhigh(ArrayList<String> programhigh) {
        this.programhigh = programhigh;
    }

    public ArrayList<String> getProgramlow() {
        return programlow;
    }

    public void setProgramlow(ArrayList<String> programlow) {
        this.programlow = programlow;
    }

    public ArrayList<String> getProgammiddle() {
        return progammiddle;
    }

    public void setProgammiddle(ArrayList<String> progammiddle) {
        this.progammiddle = progammiddle;
    }

    public ArrayList<String> getPadspos() {
        return padspos;
    }

    public void setPadspos(ArrayList<String> padspos) {
        this.padspos = padspos;
    }

    public ArrayList<String> getMeasurea() {
        return measurea;
    }

    public void setMeasurea(ArrayList<String> measurea) {
        this.measurea = measurea;
    }

    public ArrayList<String> getMeasureb() {
        return measureb;
    }

    public void setMeasureb(ArrayList<String> measureb) {
        this.measureb = measureb;
    }

    public ArrayList<String> getMeasurec() {
        return measurec;
    }

    public void setMeasurec(ArrayList<String> measurec) {
        this.measurec = measurec;
    }

    public ArrayList<String> getMeasured() {
        return measured;
    }

    public void setMeasured(ArrayList<String> measured) {
        this.measured = measured;
    }

    public ArrayList<String> getMeasuree() {
        return measuree;
    }

    public void setMeasuree(ArrayList<String> measuree) {
        this.measuree = measuree;
    }

    public ArrayList<String> getMeasuref() {
        return measuref;
    }

    public void setMeasuref(ArrayList<String> measuref) {
        this.measuref = measuref;
    }

    public ArrayList<String> getMeasureg() {
        return measureg;
    }

    public void setMeasureg(ArrayList<String> measureg) {
        this.measureg = measureg;
    }

    public ArrayList<String> getMeasureh() {
        return measureh;
    }

    public void setMeasureh(ArrayList<String> measureh) {
        this.measureh = measureh;
    }

    public ArrayList<String> getMeasuren() {
        return measuren;
    }

    public void setMeasuren(ArrayList<String> measuren) {
        this.measuren = measuren;
    }

    public ArrayList<String> getScana() {
        return scana;
    }

    public void setScana(ArrayList<String> scana) {
        this.scana = scana;
    }

    public ArrayList<String> getScanb() {
        return scanb;
    }

    public void setScanb(ArrayList<String> scanb) {
        this.scanb = scanb;
    }

    public ArrayList<String> getScanc() {
        return scanc;
    }

    public void setScanc(ArrayList<String> scanc) {
        this.scanc = scanc;
    }

    public ArrayList<String> getScand() {
        return scand;
    }

    public void setScand(ArrayList<String> scand) {
        this.scand = scand;
    }

    public ArrayList<String> getScane() {
        return scane;
    }

    public void setScane(ArrayList<String> scane) {
        this.scane = scane;
    }

    public ArrayList<String> getScanf() {
        return scanf;
    }

    public void setScanf(ArrayList<String> scanf) {
        this.scanf = scanf;
    }

    public ArrayList<String> getScang() {
        return scang;
    }

    public void setScang(ArrayList<String> scang) {
        this.scang = scang;
    }

    public ArrayList<String> getScanh() {
        return scanh;
    }

    public void setScanh(ArrayList<String> scanh) {
        this.scanh = scanh;
    }

    public boolean isHasscan() {
        return hasscan;
    }

    public void setHasscan(boolean hasscan) {
        this.hasscan = hasscan;
    }

    public boolean isIsfollowupmode() {
        return isfollowupmode;
    }

    public void setIsfollowupmode(boolean isfollowupmode) {
        this.isfollowupmode = isfollowupmode;
    }

    public boolean isIsthreetargetprg() {
        return isthreetargetprg;
    }

    public void setIsthreetargetprg(boolean isthreetargetprg) {
        this.isthreetargetprg = isthreetargetprg;
    }

    public int getTargeta() {
        return targeta;
    }

    public void setTargeta(int targeta) {
        this.targeta = targeta;
    }

    public int getTargetb() {
        return targetb;
    }

    public void setTargetb(int targetb) {
        this.targetb = targetb;
    }

    public int getTargetc() {
        return targetc;
    }

    public void setTargetc(int targetc) {
        this.targetc = targetc;
    }

    public int getTargetd() {
        return targetd;
    }

    public void setTargetd(int targetd) {
        this.targetd = targetd;
    }

    public int getTargete() {
        return targete;
    }

    public void setTargete(int targete) {
        this.targete = targete;
    }

    public int getTargetf() {
        return targetf;
    }

    public void setTargetf(int targetf) {
        this.targetf = targetf;
    }

    public int getTargetg() {
        return targetg;
    }

    public void setTargetg(int targetg) {
        this.targetg = targetg;
    }

    public int getTargeth() {
        return targeth;
    }

    public void setTargeth(int targeth) {
        this.targeth = targeth;
    }

    public int getXposactual() {
        return xposactual;
    }

    public void setXposactual(int xposactual) {
        this.xposactual = xposactual;
    }

    public int getXposmax() {
        return xposmax;
    }

    public void setXposmax(int xposmax) {
        this.xposmax = xposmax;
    }

    public int getDurationseconds() {
        return durationseconds;
    }

    public void setDurationseconds(int durationseconds) {
        this.durationseconds = durationseconds;
    }
    
    
}
