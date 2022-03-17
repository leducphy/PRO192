/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson2;

import Menu.Common;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author PhiLe
 */
public class Textbook extends Book {

    protected String status;

    public Textbook() {
    }

    public Textbook(String status, int bookCode, Date date, double price, int quantity, String publisher) {
        super(bookCode, date, price, quantity, publisher);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getTotalMoney() {
        double money = 0;
        if (this.status.equalsIgnoreCase("new")) {
            money = money + quantity * price;
            System.out.println("Total money: " + money);
        } else if (this.status.equalsIgnoreCase("old")) {
            money = money + quantity * price * 0.5;
            System.out.println("Total Money: " + money);
        } else {
            System.out.println("Wrong status");
        }
        return money;

    }
    
    public void inputTextbook(){
        this.bookCode = Common.InputInt("Code: ");
        System.out.println("Entry date: ");
        this.dateEntry(Common.InputInt("Year: "), Common.InputInt("Month: ") , Common.InputInt("Day: "));
        this.price = Common.InputInt("Unit price: ");
        setQuantity(Common.InputInt("Quantity: "));
        setPublisher(Common.InputString("Publisher: "));
        setStatus(Common.InputString("Status (new/old): "));
    }

    public void show() {
        SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
        String s1 = SDF.format(date);
        System.out.printf("%-18d%-18s%-18.1f%-18d%-18s%-18s", getBookCode(), s1, getPrice(), getQuantity(), getPublisher(), getStatus());
        System.out.println("");
    }
    
}
