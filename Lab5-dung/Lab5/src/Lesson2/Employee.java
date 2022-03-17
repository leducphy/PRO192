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
    double unitPrice;

    public Employee() {
    }

    public Employee(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Employee(double unitPrice, String name, String address) {
        super(name, address);
        this.unitPrice = unitPrice;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public void Input() {
        super.Input(); 
        System.out.print("Nhap he so luong: ");
        unitPrice = Double.parseDouble(sc.nextLine());
    }
    
    public double Calcu(double unitPrice){
        return unitPrice * 30;
    }

    @Override
    public String toString() {
        return super.toString()+" Lương : "+this.Calcu(unitPrice);
    }
    
    
    
    
}
