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
public class HourlyBill extends Bill {

    private int hours;

    public HourlyBill() {
    }

    public HourlyBill(int hours, String invoiceCode, Date invoiceDate, String cusName, String roomCode, int price) {
        super(invoiceCode, invoiceDate, cusName, roomCode, price);
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + hours;
    }

    @Override
    public double getMoney() {
        double money = 0;
        if(this.hours > 24 && this.hours < 30){
            money = 24 * getPrice();
        }else{
            money = hours*getPrice();
        }
        return money;
    }

}
