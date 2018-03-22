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
    public class Bicycle extends Vehicle 
    {
    private String bicycleType;
    private String breakType;
    
    Bicycle(String mk, String md, int y, String mum, String o, String bt, String brkt){
        
        super(mk, md, y, mum, o);
        bicycleType = bt;
        breakType = brkt;
    }
    
    public String getBicycleType(){
        
        return bicycleType;
    }
    
    public String getBreakType(){
        
        return breakType;
    }
    
    @Override
    public void display(){
        
        super.display();
        System.out.println("Bicycle Type " + bicycleType + "Break type: " + breakType);
    }
    
    public static void main(String[] args){
       
        Bicycle b1 = new Bicycle("ARD", "1.3", 2017, "30-7584", "Jeron", "Road", "disc brakes");
        Bicycle b2 = new Bicycle("Marin Nail Trail", "6 27.5" , 2017, "31-6405", "Jeron", "mountain", "rim brakes");
        Bicycle b3 = new Bicycle("Fuji Crosstown", "2.1" , 2015, "105884875", "Jeron", "hybrid", "drum brakes");
        b1.display();
        b2.display();
        b3.display();  
    }
    
}


