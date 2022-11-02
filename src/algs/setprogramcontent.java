/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algs;

/**
 *
 * @author thorsten
 */
public class setprogramcontent {
    
  public void setbymeasurement(String channeltarget){
      
      if(channeltarget.equals("1")){
     runtimevars.activetherapy.theactivetherapy.program=runtimevars.activetherapy.theactivetherapy.programlow;
      }
      
       if(channeltarget.equals("2")){
     runtimevars.activetherapy.theactivetherapy.program=runtimevars.activetherapy.theactivetherapy.progammiddle;
      }
      
       if(channeltarget.equals("3")){
     runtimevars.activetherapy.theactivetherapy.program=runtimevars.activetherapy.theactivetherapy.programhigh;
      }
       
     if(channeltarget.equals("0")){
         runtimevars.activetherapy.theactivetherapy.program=runtimevars.activetherapy.theactivetherapy.progammiddle;
     }  
      
      
      
      
  }
    
}
