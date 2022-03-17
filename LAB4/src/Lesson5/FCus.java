/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson5;

import Menu.Common;
import java.util.Date;

/**
 *
 * @author PhiLe
 */
public class FCus extends Cus {

    private String nation;

    public FCus() {
        super();
    }

    public FCus(String nation, String cusCode, String cusName, Date dateInvoice, int unitPrive, int quantity) {
        super(cusCode, cusName, dateInvoice, unitPrive, quantity);
        this.nation = nation;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    @Override
    public String toString() {
        return super.toString() + "\tNationality: " + nation ;
    }
    
    public void inputFCus(){
        setCusCode(Common.InputString("Customer code: "));
        setCusName(Common.InputString("Full name: "));
        setDateInvoice(Common.InputDate("Date of invoice: ", "dd/MM/yyyy"));
        setNation(Common.InputString("Nationality: "));
        setQuantity(Common.InputInt("Quantity: "));
        setUnitPrive(Common.InputInt("Unit price: "));
    }

}
