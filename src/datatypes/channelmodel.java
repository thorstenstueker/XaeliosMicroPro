/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datatypes;

/**
 *
 * @author thorstenstueker
 */
public class channelmodel {
    public String amplitude,frequency,risetime,channelmode;
    
    public String channelstring(){
        String outstring = null;
        outstring=amplitude+","+channelmode+","+frequency+","+risetime;
        
        return outstring;
    }

    public String getAmplitude() {
        return amplitude;
    }

    public void setAmplitude(String amplitude) {
        this.amplitude = amplitude;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getRisetime() {
        return risetime;
    }

    public void setRisetime(String risetime) {
        this.risetime = risetime;
    }

    public String getChannelmode() {
        return channelmode;
    }

    public void setChannelmode(String channelmode) {
        this.channelmode = channelmode;
    }
    
   
}