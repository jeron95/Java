/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homework2;


* @author Jeron Davidson

public class HappyThinkingCap extends ThinkingCap {
        
        public HappyThinkingCap(){
         super.slots("You will get A+ in this class", "You will get a B in this class");
            
        };
           
    public static void main(String[] args) {
        HappyThinkingCap happy = new HappyThinkingCap();
        
        happy.push_green();
        happy.push_red();
    }
    
}
