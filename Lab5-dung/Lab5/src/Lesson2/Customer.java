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
public class Customer extends Person{
    String companyName;

    public Customer() {
    }

    public Customer(String companyName) {
        this.companyName = companyName;
    }

    public Customer(String companyName, String name, String address) {
        super(name, address);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public void Input() {
        super.Input(); 
        System.out.print("Nhập tên công ty: ");
        companyName = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString()+" Công ty: "+this.getCompanyName(); 
    }
    
    
    
    
    
}
