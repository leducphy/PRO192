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
public class Employee extends Person{
    private int heSo;

    public Employee() { 
        super();
    }

    public Employee(int heSo, String Name, String Address) {
        super(Name, Address);
        this.heSo = heSo;
    }

    public int getHeSo() {
        return heSo;
    }

    public void setHeSo(int heSo) {
        this.heSo = heSo;
    }

    
    
    
}
