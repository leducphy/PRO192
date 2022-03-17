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
public class Vehicle {

    private String name;
    private String type;
    private int capacity;
    private double cost;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getTax() {
        double tax;
        if (this.capacity < 100) {
            tax = this.cost * 0.01;
        } else if (this.capacity < 200) {
            tax = this.cost * 0.03;
        } else {
            tax = this.cost * 0.05;
        }                                                   
        return tax;
    }
    
    
    public void show(){
        
    }
    

}
