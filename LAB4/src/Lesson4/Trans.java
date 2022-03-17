/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson4;

/**
 *
 * @author PhiLe
 */
public class Trans {
    private int transCode;
    private String transDate;
    protected long unitPrice;
    protected double area;

    public Trans() {
    }

    public Trans(int transCode, String transDate, long unitPrice, double area) {
        this.transCode = transCode;
        this.transDate = transDate;
        this.unitPrice = unitPrice;
        this.area = area;
    }

    public int getTransCode() {
        return transCode;
    }

    public void setTransCode(int transCode) {
        this.transCode = transCode;
    }

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    public long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
    
    @Override
    public String toString() {
        return "Trans Code: " + this.transCode + " Trans Date: " + this.transDate + " Unit Price " + this.unitPrice + "  Area: " + this.area;
    }
}
