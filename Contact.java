/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contact;

/**
 *
 * @author Jas
 */
public class Contact {
    
    int _id;
    String _name;
    String _phone_number;
    
public Contact(){}
    public Contact (int id, String name, String _phone_number){
        this._id = id;
        this._name = name;
        this._phone_number = _phone_number;
    }
    
    public void display()
    {
        System.out.println(this._name);
        System.out.println(this._phone_number);
    
}

   
    public static void main(String[] args) {
        Contact [] C;
        C = new Contact[5];
        
        C[0]= new Contact (1, "Oscar", "9176459321");
        C[1]= new Contact (1, "Jane", "9176239341");
        C[2]= new Contact (1, "Amy", "3478380353");
        C[3]= new Contact (1, "Alicia", "2167843891");
        C[4]= new Contact (1, "Shanice", "6452269437");
        
        System.out.println("The contacts are: ");
        for(int i = 0; i < 5; i++){
            C[i].display();
        }
        
    }
    
}
