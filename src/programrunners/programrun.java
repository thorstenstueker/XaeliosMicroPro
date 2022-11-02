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


    
    public void timerun(){
        runtimeseconds++;
        sessionseconds++;
        
        
        if (hasscan){
        scanseconds++;    
            channelrun.chana.amplitude = "50";
            channelrun.chana.channelmode = "3";
            channelrun.chana.frequency = "32";
            channelrun.chana.risetime = "5";

            channelrun.chanb.amplitude = "50";
            channelrun.chanb.channelmode = "3";
            channelrun.chanb.frequency = "32";
            channelrun.chanb.risetime = "5";

            channelrun.chanc.amplitude = "50";
            channelrun.chanc.channelmode = "3";
            channelrun.chanc.frequency = "32";
            channelrun.chanc.risetime = "5";

            channelrun.chand.amplitude = "50";
            channelrun.chand.channelmode = "3";
            channelrun.chand.frequency = "32";
            channelrun.chand.risetime = "5";

            channelrun.chane.amplitude = "50";
            channelrun.chane.channelmode = "3";
            channelrun.chane.frequency = "32";
            channelrun.chane.risetime = "5";

            channelrun.chanf.amplitude = "50";
            channelrun.chanf.channelmode = "3";
            channelrun.chanf.frequency = "32";
            channelrun.chanf.risetime = "5";

            channelrun.chang.amplitude = "50";
            channelrun.chang.channelmode = "3";
            channelrun.chang.frequency = "32";
            channelrun.chang.risetime = "5";

            channelrun.chanh.amplitude = "50";
            channelrun.chanh.channelmode = "3";
            channelrun.chanh.frequency = "32";
            channelrun.chanh.risetime = "5";
            
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

