/*
Stueker Software License 2022

Thir Software is sold as is weather it comes with a device or as Software only. No Warranty on Software functionalities and Software Usability. 
Using of Stueker Software inside of nuklear Systems, weapons and Aircraft Systems if prohibited for Software which is not written for this purposes.
The Software is under the Copyright of Thorsten Stueker.
 */
package programrunners;

import datatypes.channelmodel;



/**
 *
 * @author thorstenstueker
 */
public class runchannel {
    
    public channelmodel chana=new datatypes.channelmodel();
    public channelmodel chanb=new datatypes.channelmodel();
    public channelmodel chanc=new datatypes.channelmodel();
    public channelmodel chand=new datatypes.channelmodel();
    public channelmodel chane=new datatypes.channelmodel();
    public channelmodel chanf=new datatypes.channelmodel();
    public channelmodel chang=new datatypes.channelmodel();
    public channelmodel chanh=new datatypes.channelmodel();
    public channelmodel chann=new datatypes.channelmodel();
    
    public String channelstring(boolean runneronornot){//arg is run for running or stop for stopping. All other args except run are stopping the device.
        String runstring = "0,E,E";
        String stopstring = "0,S,S";
       boolean getrunner=false;
        if (runneronornot){
            getrunner=true;
        }else{
            getrunner=false;
        }
        
    String outstring= chana.channelstring()+","+chanb.channelstring()+","+chanc.channelstring()+","+chand.channelstring()+","+runstring+","+chane.channelstring()+","+chanf.channelstring()+","+
            chang.channelstring()+","+chanh.channelstring()+","+chann.channelstring();
    return outstring;
    }

    public channelmodel getChana() {
        return chana;
    }

    public void setChana(channelmodel chana) {
        this.chana = chana;
    }

    public channelmodel getChanb() {
        return chanb;
    }

    public void setChanb(channelmodel chanb) {
        this.chanb = chanb;
    }

    public channelmodel getChanc() {
        return chanc;
    }

    public void setChanc(channelmodel chanc) {
        this.chanc = chanc;
    }

    public channelmodel getChand() {
        return chand;
    }

    public void setChand(channelmodel chand) {
        this.chand = chand;
    }

    public channelmodel getChane() {
        return chane;
    }

    public void setChane(channelmodel chane) {
        this.chane = chane;
    }

    public channelmodel getChanf() {
        return chanf;
    }

    public void setChanf(channelmodel chanf) {
        this.chanf = chanf;
    }

    public channelmodel getChang() {
        return chang;
    }

    public void setChang(channelmodel chang) {
        this.chang = chang;
    }

    public channelmodel getChanh() {
        return chanh;
    }

    public void setChanh(channelmodel chanh) {
        this.chanh = chanh;
    }

    public channelmodel getChann() {
        return chann;
    }

    public void setChann(channelmodel chann) {
        this.chann = chann;
    }

  
    

   
}
