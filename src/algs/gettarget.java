/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algs;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;

/**
 *
 * @author thorstenstueker
 */
public class gettarget {
    
    public String targetmode="0";
    
    public String settarget(ArrayList<String> measures,String method/*Method for nothing*/)
    {
        
          int part1=0;
            int part2=0;
            int part3=0;
        
        int size = measures.size();//attention size has to be always 240 seconds i.e. from scan or out of the middle of therapy
        if(!(size<240)){
            
          
            
           
                int partcounter=0;
                int summarizer=0;
                // first get the middle of the three last quarters of measurements so groups are 61-120,121-180,181-240 seconds
                // means places in Arrays are always -1
                for (int i=60;i<121;i++){
                    partcounter++;
                    String themeasure=measures.get(i);
                    summarizer=summarizer+parseInt(themeasure);
                    themeasure="0";
                }
                
                int result=summarizer/partcounter;
                partcounter=0;
                summarizer=0;
                part1=result;
                result=0;
                // now we have to calculate Part 2 the more heavy part of the calculation
                
                for (int i=121;i<181;i++){
                    partcounter++;
                    String themeasure=measures.get(i);
                    summarizer=summarizer+parseInt(themeasure);
                    themeasure="0";
                }
                
                result=summarizer/partcounter;
                partcounter=0;
                summarizer=0;
                part2=result;
                result=0;
                
                //now we hve to calculate Part 3 of the line the most heavy part while the newest measuring results
                
                for (int i=60;i<121;i++){
                    partcounter++;
                    String themeasure=measures.get(i);
                    summarizer=summarizer+parseInt(themeasure);
                    themeasure="0";
                }
                
              result=summarizer/partcounter;
                partcounter=0;
                summarizer=0;
                part3=result;
                result=0;
            }
            
            //now we have to calculate the targets following to the calcmode where 
            // same is all called with 1x get added and divided /3
            // log is (part1x1 + part2 x 2+ part3x3)/6
            // lastpart is (part1+part2+(5xpart3))/7
            // midandlast is (part1+(5xpart2)+(5xpart3)/11
            int calculatedresult=0;
            if (method.equals("same")){
                calculatedresult=(part1+part2+part3)/3;
            }
            if (method.equals("log")){
                calculatedresult=(part1+(2*part2)+(3*part3))/6;
            }
            if (method.equals("lastpart")){
                calculatedresult=(part1+part2+(part3*5))/7;
            }
            if (method.equals("midandlast")){
                calculatedresult=(part1+(5*part2)+(5*part3))/11;
            }
            
            // now to get the mode
            
            if(calculatedresult<45){
                targetmode="1";
            }
            if (calculatedresult>65){
                targetmode="2";
            }
            if (calculatedresult <=65 && calculatedresult>=45 ){
        targetmode="3";
    }
            
    
        
    return targetmode;
    }
}
    
    

