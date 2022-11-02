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
public class getsinglefrequencies {

    public ArrayList<String> programdata = new ArrayList<>();
    public ArrayList<String> frequenciesinprogram = new ArrayList<>();
    // important: sort the program without chr$10 and chr$13 line endings and change them to ; like the other separators. Then we'll get out the single frequencies from the programs
// the list is used to generate automatically a program for the use in the Application Composer
    public int frequenciesinlist = programdata.size();

    public void sortthelistout() {

        for (int i = 0; i < programdata.size(); i++) {
            String freqinside = programdata.get(i);

            if (frequenciesinprogram.size() > 0) {

                boolean equalstring = false;
                for (int j = 0; j < frequenciesinprogram.size(); j++) {

                    String liststring = frequenciesinprogram.get(j);
                    if (liststring.equals(freqinside)) {
                        equalstring = true;
                    }

                }

                if (!equalstring) {
                    frequenciesinprogram.add(freqinside);
                }

            } else {

                frequenciesinprogram.add(freqinside);

            }

        }
    }

}
