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
public class ReferenceBook extends Book {

    protected double tax;

    public ReferenceBook() {
    }

    public ReferenceBook(double tax, int bookCode, Date date, double price, int quantity, String publisher) {
        super(bookCode, date, price, quantity, publisher);
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getAmount() {
        return getQuantity() * getPrice() + getTax();
    }

    public void inputRefBook() {
        setBookCode(Common.InputInt("Book Code: "));
        System.out.println("Entry date: ");
        this.dateEntry(Common.InputInt("Year: "), Common.InputInt("Month: "), Common.InputInt("Day: "));
        this.price = Common.InputInt("Unit price: ");
        setQuantity(Common.InputInt("Quantity: "));
        setPublisher(Common.InputString("Publisher: "));
        setTax(Common.InputDouble("Tax: "));
    }

    public void show() {
        SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
        String s2 = SDF.format(date);
        System.out.printf("%-18d%-18s%-18.1f%-18d%-18s%-18.0f", this.bookCode, s2, this.price, this.quantity, this.publisher, this.tax);
        System.out.println("");

    }

    public double Average() {
        double money = 0;
        money = (money + quantity * price + tax) / quantity;
        System.out.println("[Reference book] Averange: " + money);
        return money;
    }
}
