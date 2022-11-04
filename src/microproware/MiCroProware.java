/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package microproware;

import java.io.IOException;

/**
 *
 * @author thorstenstueker
 */
public class MiCroProware {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
GUI.loginpanel.main(null);
    }
    
}



/*
format is:
channels,platform,batsetter,isneuro,neuroduty,hasfixedtherapy,lcfreq1,lcfreq2,lcfreq3,lcfreq4,lcfreq5,lcfreq6,
 -lcfreq7,lcfreq8,lcfreq9,chip1,chip2,chip3,chip4,chip5,chip6,chip7,chip8,chip9,highlcdrive,lowlcdrive, therapyduty, lcfreqstandard
Platform 4 Rev IV 8chan doubletranboard: 8,4,35,0,0.1,1,1500,1500,1500,1500,1500,1500,1500,1500,1500,18,26,19,13,6,5,4,3,2,2200,1000,40,2000,4000
Platform 4 Rev I 8 chan notranboard: 8,4,35,0,0.1,1,1500,1500,1500,1500,1500,1500,1500,1500,1500,18,26,19,13,6,25,4,3,2,2200,1000,40,2000,4000

Platform 4 Rev IV 4chan doubletranboard: 4,4,35,0,0.1,1,1500,1500,1500,1500,1500,1500,1500,1500,1500,18,26,19,13,0,0,0,0,0,2200,1000,40,2000,4000
Platform 4 Rev I 4 chan notranboard: 4,4,35,0,0.1,1,1500,1500,1500,1500,1500,1500,1500,1500,1500,18,26,19,13,0,0,0,0,0,2200,1000,40,2000,4000

Platform LX2000 4 chan Rev HSWAP: 4,2,35,0,0.1,1,1500,1500,1500,1500,1500,1500,1500,1500,1500,0,0,0,0,0,0,0,0,0,2200,1000,40,2000,4000


channels can be 2,4,5,8,9

platform can be
1 -> Stueker old
2 -> walitschek old
3 -> stueker 2019 platform
4 -> platform walistue

Batsetter
This is the Number the battery counter is enlarging the load of the battery per hitpoint.

isneuro is 0 if there is no Neurogate and 1 if there is neurogate

neurolcduty is the standard duty of lcneurogate generator

hasfixedtherapy old luxxamed compatibility when 0 there is non when 1 there is support for

channels,0
platform,1
batsetter,2
isneuro,3
neuroduty,4
hasfixedtherapy,5
lcfreq1,6
lcfreq2,7
lcfreq3,8
lcfreq4,9
lcfreq5,10
lcfreq6,11
lcfreq7,12
lcfreq8,13
lcfreq9,14   CAUTION NEURO
chip1,15
chip2,16
chip3,17
chip4,18
chip5,19
chip6,20
chip7,21
chip8,22
chip9,23	CAUTION NEURO
highlcdrive,24
lowlcdrive,25
Therapyduty,26
lcfreqstandard,27
Neurolcfreq,28  IT IS FREE FOR USE CAUSE THAT IS DUTY 9
*/