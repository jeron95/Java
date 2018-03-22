/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruits;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Jas
 */
public class Fruits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Map <String,List<String>> map = new HashMap <String,List<String>>();
        Scanner inFile = new Scanner (new FileReader("/Users/Jas/Desktop/Fruits.txt"));
        String fruit = "";
        while(inFile.hasNext()){
            fruit = inFile.next();
            String firstLetter = fruit.substring(0,1);
            List<String> fruits = map.get(firstLetter);
            
            if (fruits == null){
                fruits = new ArrayList<>();
                fruits.add(fruit);
                map.put(firstLetter, fruits);
            }
            else{
                fruits.add(fruit);
            }
        }
        
        for(Map.Entry<String,List<String>>entry:map.entrySet()){
            String Key = entry.getKey();
            List <String> values = entry.getValue();
            System.out.println(Key+ " "+ values);
        }
        
        String letter = "A";
        while(!letter.equals("1")){
            System.out.println("\nPlease enter a letter: ");
            Scanner in = new Scanner(System.in);
            letter = in.next();
            
            List<String> fruits = map.get(letter);
            
            if(fruits == null){
                System.out.println("No fruit with that particular key or value exist");
                
            }
            else{
                System.out.print(fruits);
            }
        }
        
    }
    
}
