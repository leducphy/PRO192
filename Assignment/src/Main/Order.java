/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author PhiLe
 */
public class Order {
    private String id, cusName, cusAddress;
    private Date date;

    public Order() {
    }

    public Order(String id, String cusName, String cusAddress, Date date) {
        this.id = id;
        this.cusName = cusName;
        this.cusAddress = cusAddress;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusAddress() {
        return cusAddress;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return  id + "\t" + cusName + "\t" + cusAddress + "\t" + f.format(date) ;
    }
    SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    public void inputOrder(){
        setId(Common.InputString("ID: "));
        setDate(Common.InputDate("Date created: ", "dd/MM/yyyy"));
        setCusName(Common.InputString("Customer name: "));
        setCusAddress(Common.InputString("Customer address: "));
    }

    public void showOrder(){
        System.out.println(this.id + "\t" + f.format(date) + "\t" + this.cusName + "\t" + this.cusAddress);
    }
    
}
