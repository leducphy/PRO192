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
public class billHour extends bill {

    private int numberOfHour;

    public billHour() {
    }

    public billHour(int numberOfHour) {
        this.numberOfHour = numberOfHour;
    }

    public billHour(int numberOfHour, int id, Date invoice, String customerName, String roomCode, float unitPrice) {
        super(id, invoice, customerName, roomCode, unitPrice);
        this.numberOfHour = numberOfHour;
    }
    
    

    public int getNumberOfHour() {
        return numberOfHour;
    }

    public void setNumberOfHour(int numberOfHour) {
        this.numberOfHour = numberOfHour;
    }

    public float getTotal() {
        float total = this.getUnitPrice() * (float) this.getNumberOfHour();
        return total;
    }

    public float getBillHour() {
        if (this.getNumberOfHour() <= 30 && this.getNumberOfHour() > 24) {
            return 24 * this.getTotal();
        } else if (this.getNumberOfHour() <= 24) {
            return (float) this.getNumberOfHour() * this.getUnitPrice();
        } else {
            return -1;
        }
    }

    @Override
    public void Input() {
        super.Input();
        System.out.print("Nhap so gio la: ");
        numberOfHour = sc.nextInt();
    }

    @Override
    public String toString() {
        return super.toString() + "so tien la " + this.getBillHour();

    }
}
