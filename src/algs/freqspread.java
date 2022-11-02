/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algs;

import java.util.ArrayList;

/**
 *
 * @author thorstenstueker
 */
public class freqspread {
    public ArrayList<String> channelfrequencieset = new ArrayList<>();
    
  
    
    public ArrayList<String> setfrequencies(ArrayList<String> frequencieset, int setsneeded){
        channelfrequencieset=new ArrayList<>();
        
        /// taking the given freq   uencies from Stack to volve the freq    uenciy set 
            if(frequencieset.size() % 2==0){
                frequencieset.add("32");
                frequencieset.add("10000");
                frequencieset.add("64");
             
            }else{
                frequencieset.add("32");
                frequencieset.add("10000");
                
                
            }
                // making the number of entries odd while even would not passover the channels correctly
                // now passing the complete code over the channels architecture
            
        
        
        int hassets=0;
       
        
        
        for(int i=0; i<frequencieset.size();i++){
           hassets++;
            channelfrequencieset.add(frequencieset.get(i));
            
           if(!(hassets>setsneeded)){
               
              
               if (i>2){
                   i=0;
               }
               
           }else{
               i=3;
           }
        }
       
       
           
        return channelfrequencieset;
        
        }
        
    }
    

