/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson1;

import java.util.Date;

/**
 *
 * @author PhiLe
 */
public class billDaily extends bill {

    private int numberOfDay;

    public billDaily() {
    }

    public billDaily(int numberOfDay) {
        this.numberOfDay = numberOfDay;
    }

    public billDaily(int numberOfDay, int id, Date invoice, String customerName, String roomCode, float unitPrice) {
        super(id, invoice, customerName, roomCode, unitPrice);
        this.numberOfDay = numberOfDay;
    }

    
    public int getNumberOfDay() {
        return numberOfDay;
    }

    public void setNumberOfDay(int numberOfDay) {
        this.numberOfDay = numberOfDay;
    }

    public float getBillDaily() {
        if (this.getNumberOfDay() < 7) {
            return (float) this.getNumberOfDay() * this.getUnitPrice();
        } else {
            return (float) this.getNumberOfDay() * 7 * this.getUnitPrice() + (this.getNumberOfDay() - 7) * this.getUnitPrice() * 4/5;
        }
    }
    @Override
    public void Input(){
        super.Input();
        System.out.print("Nhap so ngay la: ");
        numberOfDay = sc.nextInt();
    }

    @Override
    public String toString() {
        return super.toString()+" so tien la "+this.getBillDaily(); 
    }
    

}

