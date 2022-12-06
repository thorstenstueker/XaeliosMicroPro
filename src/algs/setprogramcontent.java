/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algs;

import runtimevars.activetherapy;

/**
 *
 * @author thorsten
 */
public class setprogramcontent {
    
  public void setbymeasurement(String channeltarget){
      
      if(channeltarget.equals("1")){
     activetherapy.theactivetherapy.runningprogrtam=runtimevars.activetherapy.theactivetherapy.programlow;
      }
      
       if(channeltarget.equals("2")){
     activetherapy.theactivetherapy.runningprogrtam=runtimevars.activetherapy.theactivetherapy.progammiddle;
      }
      
       if(channeltarget.equals("3")){
     activetherapy.theactivetherapy.runningprogrtam=runtimevars.activetherapy.theactivetherapy.programhigh;
      }
       
     if(channeltarget.equals("0")){
         activetherapy.theactivetherapy.runningprogrtam=runtimevars.activetherapy.theactivetherapy.progammiddle;
     }  
      
      
      
      
  }
    
}
