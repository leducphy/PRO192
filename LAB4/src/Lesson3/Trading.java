/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson3;

/**
 *
 * @author PhiLe
 */
public class Trading {
    protected int transCode, unitPrice, quantity;
    protected String transDate;

    public Trading() {
    }

    public Trading(int transCode, int unitPrice, int quantity, String transDate) {
        this.transCode = transCode;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.transDate = transDate;
    }

    public int getTransCode() {
        return transCode;
    }

    public void setTransCode(int transCode) {
        this.transCode = transCode;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

}
