/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson3;

import Menu.Common;

import java.text.SimpleDateFormat;

/**
 *
 * @author PhiLe
 */
public class GoldTrading extends Trading{
    protected String goldType;

    public GoldTrading() {
    }

    public GoldTrading(String goldType, int transCode, int unitPrice, int quantity, String transDate) {
        super(transCode, unitPrice, quantity, transDate);
        this.goldType = goldType;
    }

    public String getGoldType() {
        return goldType;
    }

    public void setGoldType(String goldType) {
        this.goldType = goldType;
    }

    public void inputGT(){
        setTransCode(Common.InputInt("Transaction code: "));
        setTransDate(Common.InputString("Transaction day (day/month/year): "));
        setUnitPrice(Common.InputInt("Unit price: "));
        setQuantity(Common.InputInt("Quantity: "));
        setGoldType(Common.InputString("Gold type: "));
    }

    public void show() {
        System.out.printf("%-18d%-18s%-18d%-18d%-18s\n", getTransCode(), getTransDate(), getUnitPrice(), getQuantity(), getGoldType()); 
    }

    public double getTotalMoney(){
        double money = 0;
        money = money + this.quantity + this.unitPrice;
        System.out.println("[Gold Trading] Total money: " + money);
        return money;
    }
}
