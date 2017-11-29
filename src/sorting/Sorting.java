/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 069986115
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Testing selection sort
        File test = new File ("dictandbadpass.txt");
        Scanner s;
        try {
            s = new Scanner (test);
        
        ArrayList <String> toSort;
        for(toSort = new ArrayList();s.hasNext();toSort.add(s.nextLine()));
        Selection.sort(toSort.toArray(new String[0]),false);
            //System.out.println(sorted[1]);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Sorting.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("It broke!!!");
        }
    }
    
}
