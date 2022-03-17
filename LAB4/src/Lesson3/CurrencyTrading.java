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
public class CurrencyTrading extends Trading{
   protected double exchangeRate;
   protected String currency;

    public CurrencyTrading() {
    }

    public CurrencyTrading(double exchangeRate, String currency, int transCode, int unitPrice, int quantity, String transDate) {
        super(transCode, unitPrice, quantity, transDate);
        this.exchangeRate = exchangeRate;
        this.currency = currency;
    }

    public double getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
   
   public void show() {
        System.out.printf("%-18d%-18s%-18d%-18d%-18s\n", getTransCode(), getTransDate(), getUnitPrice(), getQuantity(), getCurrency());
    }
   
   public void inputCT(){
        setTransCode(Common.InputInt("Transaction code: "));
        setTransDate(Common.InputString("Transaction day (day/month/year): "));
        setUnitPrice(Common.InputInt("Unit price: "));
        setQuantity(Common.InputInt("Quantity: "));
        setCurrency(Common.InputString("Currency (VND|USD|ERO)"));
   }

   public double getTotalMoney(){
        double money=0;
        if (this.currency.equalsIgnoreCase("VND")){
            money= money + this.quantity * this.unitPrice;
        }else if (this.currency.equalsIgnoreCase("USD") || this.currency.equalsIgnoreCase("ERO")){
            money = money + this.quantity * this.unitPrice * this.exchangeRate;
        }
        return money;
   }
}
