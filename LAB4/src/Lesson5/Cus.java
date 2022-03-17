/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson5;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author PhiLe
 */
public class Cus {
    private String cusCode, cusName;
    private Date dateInvoice;
    private int unitPrive;
    private int quantity;

    public Cus() {
    }

    public Cus(String cusCode, String cusName, Date dateInvoice, int unitPrive, int quantity) {
        this.cusCode = cusCode;
        this.cusName = cusName;
        this.dateInvoice = dateInvoice;
        this.unitPrive = unitPrive;
        this.quantity = quantity;
    }

    public String getCusCode() {
        return cusCode;
    }

    public void setCusCode(String cusCode) {
        this.cusCode = cusCode;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public Date getDateInvoice() {
        return dateInvoice;
    }

    public void setDateInvoice(Date dateInvoice) {
        this.dateInvoice = dateInvoice;
    }

    public int getUnitPrive() {
        return unitPrive;
    }

    public void setUnitPrive(int unitPrive) {
        this.unitPrive = unitPrive;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    @Override
    public String toString() {
        return "Customer Code: " + cusCode + "\tFull name: " + cusName + "\tDate of invoice: " + f.format(dateInvoice) + "\tUni Price: " + unitPrive  + "\tQuantity" + quantity + " kW";
    }
     
}
