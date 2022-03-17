/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson2;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author PhiLe
 */
public class Book {
    protected int bookCode;
    protected Date date;
    protected double price;
    protected int quantity;
    protected String publisher;

    public Book() {
    }

    public Book(int bookCode, Date date, double price, int quantity, String publisher) {
        this.bookCode = bookCode;
        this.date = date;
        this.price = price;
        this.quantity = quantity;
        this.publisher = publisher;
    }

    public int getBookCode() {
        return bookCode;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void dateEntry(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        this.date = cal.getTime();
    }
}
