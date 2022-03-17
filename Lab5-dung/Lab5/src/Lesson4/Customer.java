/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson4;

/**
 *
 * @author PhiLe
 */
public class Customer extends Human{
    String model;
    String Bill;

    public Customer() {
    }

    public Customer(String model, String Bill) {
        this.model = model;
        this.Bill = Bill;
    }

    public Customer(String model, String Bill, String name, String address) {
        super(name, address);
        this.model = model;
        this.Bill = Bill;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBill() {
        return Bill;
    }

    public void setBill(String Bill) {
        this.Bill = Bill;
    }
    
    public void Input(){
        super.Input();
        System.out.print("Nhap mo hinh ban hang: ");
        this.model = sc.nextLine();
        System.out.print("Nhap phuong thuc tinh tien: ");
        this.Bill = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString()+ " Mo hinh "+this.getModel()+
                " Phuong thuc thanh toan "+this.getBill(); 
    }
    
    
}
