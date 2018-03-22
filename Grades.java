/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grades;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Jas
 */
public class Grades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inFile = new Scanner(new FileReader("/Users/Jas/Desktop/medgarstudents.txt"));
        String name;
        float gpa;
        while (inFile.hasNext()){
            name = inFile.next();
            gpa = inFile.nextFloat();
            if (gpa >= 3.0){
                System.out.println(name + " " + gpa);
            }
        }
    }
}
    
