/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author PhiLe
 */
public abstract class Bill {
    private String invoiceCode, cusName, roomCode;
    private Date invoiceDate;
    private int price;

    public Bill() {
    }

    public Bill(String invoiceCode, Date invoiceDate, String cusName, String roomCode, int price) {
        this.invoiceCode = invoiceCode;
        this.cusName = cusName;
        this.roomCode = roomCode;
        this.invoiceDate = invoiceDate;
        this.price = price;
    }

    public String getInvoiceCode() {
        return invoiceCode;
    }

    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }
    SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return invoiceCode + "\t" + cusName + "\t" + roomCode + "\t" + invoiceDate + "\t" + price + "\t" + getMoney();
    }

    public abstract double getMoney();
    
    
}
