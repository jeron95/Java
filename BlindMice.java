/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.assignment.pkg3;

import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author DAVIDSONJ
 */
public class BlindMice {
    String number;
    String adj;
    String verb;
    String occupation;
    String relation;
    String bodypart;
    String verbendingining;
    String noun;
    
    public void readInput() 
    {
        Scanner inFile = new Scanner(System.in);
        System.out.println("Please enter a number");
        number = inFile.next();
        
        System.out.println("Please enter an adjective");
        adj = inFile.next();
        
        System.out.println("Please enter a verb");
        verb = inFile.next();
        
        System.out.println("Please enter an occupation");
        occupation = inFile.next();
        
        System.out.println("Please enter a relation");
        relation = inFile.next();
        
        System.out.println("Please enter a bodypart");
        bodypart = inFile.next();
        
        System.out.println("Please enter a verb ending in ing");
        verbendingining = inFile.next();
        
        System.out.println("Please enter a noun");
        noun = inFile.next();
    }
    
    public void display()
    {
        System.out.println(number + " " + adj + " mice! See how they " + verb  +"!");
        System.out.println("They all ran after the " + occupation + "'s " +  relation + " ");
        System.out.println("Who cut off their " + bodypart + " with a " + verbendingining + " "+ "knife ");
        System.out.println("Did you ever see such a thing in your " + noun);
        System.out.println("As " + number + " " + adj + " "+  "mice?");  
                
    }

    public static void main(String[] args) throws FileNotFoundException {
        BlindMice m = new BlindMice();
        m.readInput();
        m.display();
    }
    
}