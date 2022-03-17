/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

import JacaLanguage.Common;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author PhiLe
 */
public class Food extends Product {

    private Date date, expiredDate;

    public Food() {
    }

    public Food( String code, String name, String make, double price, Date date, Date expiredDate) {
        super(code, name, make, price);
        this.date = date;
        this.expiredDate = expiredDate;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(Date expiredDate) {
        this.expiredDate = expiredDate;
    }
    
     SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    @Override
    public String toString() {
        return super.toString() + "\t" + "\t" + f.format(date) + "\t" + f.format(expiredDate) ;
    }

     public void inputFood(){
         setCode(Common.InputString("Code: "));
         setDate(Common.InputDate("Date : ", "dd/MM/yyyy"));
         setExpiredDate(Common.InputDate("experied date: ", "dd/MM/yyyy"));
         setName(Common.InputString("name: "));
         setMake(Common.InputString("make: "));
         setPrice(Common.InputDouble("price: "));
     }
}
