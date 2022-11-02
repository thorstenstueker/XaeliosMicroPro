/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package runtimevars;

import datatypes.persons;

/**
 *
 * @author thorstenstueker
 */
public class activeperson {
    public static datatypes.persons theactiveperson = new datatypes.persons();

    public static persons getActiveperson() {
        return theactiveperson;
    }

   public void settonew(){
       theactiveperson=new persons();
   }
    
    
}
