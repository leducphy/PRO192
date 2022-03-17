/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson1;

import java.util.Date;
import lab5.Common;

/**
 *
 * @author PhiLe
 */
public class DailyInvoice extends Bill {

    private int days;

    public DailyInvoice() {
    }

    public DailyInvoice(int days, String invoiceCode, Date invoiceDate, String cusName, String roomCode, int price) {
        super(invoiceCode, invoiceDate, cusName, roomCode, price);
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return super.toString() + "\t" + days + "\t" + getMoney();
    }

    @Override
    public double getMoney() {
        double money = 0;
        if (this.days < 7) {
            money = days * getPrice();
        } else if (days > 7) {
            money = days * getPrice() + (days - 7) * getPrice() * 0.2;
        }
        return money;
    }

}
