/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework.pkg4;

/**
 *
 * @author Jas
 */
public class Boat extends Vehicle 
{
   private String boatType;
   private int fuelTankSize;
     
   Boat(String mk, String md, int y, String mum, String o, String b, int f){
         
         super(mk, md, y, mum, o);
         boatType = b;
         fuelTankSize = f; 
}
     
 public String getBoatType(){
         
    return boatType;
     }
     
 public int getFuelTankSize(){
         
     return fuelTankSize;   
     }
     
     @Override
 public void display(){
        
    super.display();
    System.out.println("Capacity (in tons): " + boatType + ", Number of gallons: " + fuelTankSize);   
     }
     
     public static void main(String[] args){
         
        Boat b1 = new Boat("Yamaha", "SX240", 2017, "#26985", "Jeron", "Speedboat", 800) ;
        Boat b2 = new Boat("Horizon", "E88", 2017, "#23940", "Jeron", "Yacht", 500);
        Boat b3 = new Boat("Cobalt", "R7", 2017, "#74653", "Jeron", "Bowrider", 700);
        b1.display();
        b2.display();
        b3.display();
     }
              
}

    

