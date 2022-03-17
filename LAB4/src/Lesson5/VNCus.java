/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson5;

import Menu.Common;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author PhiLe
 */
public class VNCus extends Cus {
    private int quota;
    private String cusLiv;
    

    public VNCus() {
        super();
    }

    public VNCus(String cusLiv, String cusCode, String cusName, Date dateInvoice, int unitPrive, int quantity) {
        super(cusCode, cusName, dateInvoice, unitPrive, quantity);
        this.cusLiv = cusLiv;
        this.quota = quota;
    }

    

    public String getCusLiv() {
        return cusLiv;
    }

    public void setCusLiv(String cusLiv) {
        this.cusLiv = cusLiv;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    
   
SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    @Override
    public String toString() {
        return super.toString() + "\tCustomer live: " + cusLiv + "\tQuota " + quota;
    }
    
    public void inputVNCus(){
        setCusCode(Common.InputString("Customer code: "));
        setCusName(Common.InputString("Full name: "));
        setDateInvoice(Common.InputDate("Date of invoice: ", "dd/MM/yyyy"));
        setCusLiv(Common.InputString("Customer living: "));
        setQuantity(Common.InputInt("Quantity: "));
        setUnitPrive(Common.InputInt("Unit price: "));
        setQuota(Common.InputInt("Quota: "));
    }

}
