/*
Stueker Software License 2022

Thir Software is sold as is weather it comes with a device or as Software only. No Warranty on Software functionalities and Software Usability. 
Using of Stueker Software inside of nuklear Systems, weapons and Aircraft Systems if prohibited for Software which is not written for this purposes.
The Software is under the Copyright of Thorsten Stueker.
 */
package programrunners;

/**
 *
 * @author thorstenstueker
 */
public class therapyrundata {
    public static datatypes.therapymodel runningtherapy = new datatypes.therapymodel();
    public static datatypes.lcdrivemodel runninglcdrives = new datatypes.lcdrivemodel();
    public static programrunners.runchannel runchannel = new runchannel();
    
    public static void initializeit(){
        runningtherapy=new datatypes.therapymodel();
        runninglcdrives=new datatypes.lcdrivemodel();


    }
    
    
}
