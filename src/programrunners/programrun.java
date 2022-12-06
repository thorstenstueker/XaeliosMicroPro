/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programrunners;

/**
 *
 * @author thorstenstueker
 */
public class programrun {
    public int runtimeseconds,sessionseconds,scanseconds,programseconds,programset;
    public boolean hasscan,istriplet,hasneuro,scanrunactive,therarunactive,eoft,runnerstarted;
    public int scantime=0;
    public int scanlength=240;
    
    public String onmodeString="0,E,E,";
    public String offmodestring="0,S,S,";
   public programrunners.runchannel channelrun = new runchannel();
    public String sender=null;
    public String scanplitude="50";
    public String scannelmode="3";
    public String scanfreq="32";
    public String scanchanrise="5";


    
    public void timerun(){
        runtimeseconds++;
        sessionseconds++;
        
        
        if (hasscan){
        scanseconds++;    
            channelrun.chana.amplitude = scanplitude;
            channelrun.chana.channelmode = scannelmode;
            channelrun.chana.frequency = scanfreq;
            channelrun.chana.risetime = scanchanrise;

            channelrun.chanb.amplitude = scanplitude;
            channelrun.chanb.channelmode = scannelmode;
            channelrun.chanb.frequency = scanfreq;
            channelrun.chanb.risetime = scanchanrise;

            channelrun.chanc.amplitude = scanplitude;
            channelrun.chanc.channelmode = scannelmode;
            channelrun.chanc.frequency = scanfreq;
            channelrun.chanc.risetime = scanchanrise;

            channelrun.chand.amplitude = scanplitude;
            channelrun.chand.channelmode = scannelmode;
            channelrun.chand.frequency = scanfreq;
            channelrun.chand.risetime = scanchanrise;

            channelrun.chane.amplitude = scanplitude;
            channelrun.chane.channelmode = scannelmode;
            channelrun.chane.frequency = scanfreq;
            channelrun.chane.risetime = scanchanrise;

            channelrun.chanf.amplitude = scanplitude;
            channelrun.chanf.channelmode = scannelmode;
            channelrun.chanf.frequency = scanfreq;
            channelrun.chanf.risetime = scanchanrise;

            channelrun.chang.amplitude = scanplitude;
            channelrun.chang.channelmode = scannelmode;
            channelrun.chang.frequency = scanfreq;
            channelrun.chang.risetime = scanchanrise;

            channelrun.chanh.amplitude = scanplitude;
            channelrun.chanh.channelmode = scannelmode;
            channelrun.chanh.frequency = scanfreq;
            channelrun.chanh.risetime = scanchanrise;
            
            channelrun.chann.amplitude="0";
            channelrun.chann.channelmode="0";
            channelrun.chann.frequency="0";
            channelrun.chann.risetime="0";
            
            if(scanseconds>239){
                hasscan=false;
               
            }
            
        }
        
       
        if(therarunactive){
          hasscan=false;
          
            
        }
        
        if (eoft){
            therarunactive=false;
            
            
            
            
        }
        
    
       String sender = channelrun.channelstring(runnerstarted);
        
        
    }
    
    
    
      
}

