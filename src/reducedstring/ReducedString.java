/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reducedstring;

import java.util.Scanner;

/**
 *
 * @author camper
 */
public class ReducedString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String sample = "aaabccddd";               
        
        String sampleformat = "";
        
        int sampleflag = 1;
        
        char[] array = sample.toCharArray();
        
        sample.toLowerCase();
                    
        if (!sample.isEmpty()){        
            for (int c = 0; c < sample.length(); c++){
                if (sampleflag < sample.length()){
                    sampleflag = sampleflag + 1;
                }
                
                for (int i = 1; i < sample.length(); i++){
                    System.out.println(array);                    
                }
            }        
        }         
    }              
}
