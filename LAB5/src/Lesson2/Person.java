/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson2;

/**
 *
 * @author PhiLe
 */
public class Person {
    private String Name;
    private String Address;

    public Person() {
    }

    public Person(String Name, String Address) {
        this.Name = Name;
        this.Address = Address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    

    @Override
    public String toString() {
        return "Name: " + Name + "\tAddress: " + Address ;
    }
    
    
    
    

}
