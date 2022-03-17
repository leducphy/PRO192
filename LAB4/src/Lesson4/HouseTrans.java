/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson4;

import Menu.Common;

/**
 *
 * @author PhiLe
 */
public class HouseTrans extends Trans {

    private String typeHouse, address;
    private int choose;

    public HouseTrans() {
    }

    public HouseTrans(String typeHouse, String address, int choose, int transCode, String transDate, long unitPrice, double area) {
        super(transCode, transDate, unitPrice, area);
        this.typeHouse = typeHouse;
        this.address = address;
        this.choose = choose;
    }

    public String getTypeHouse() {
        return typeHouse;
    }

    public void setTypeHouse(String typeHouse) {
        this.typeHouse = typeHouse;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getChoose() {
        return choose;
    }

    public void setChoose(int choose) {
        this.choose = choose;
    }

    public void inputHouse() {
        setTransCode(Common.InputInt("Trans code: "));
        setTransDate(Common.InputString("Trans date: "));
        setUnitPrice(Common.InputInt("Unit price: "));
        setTypeHouse(Common.InputString("Type of house(pre/nor): "));
        setAddress(Common.InputString("Address: "));
        setArea(Common.InputDouble("Area: "));
    }

   
    

    @Override
    public String toString() {
        return super.toString() + "Type of house: " + this.typeHouse + " Address: " + this.address;
    }

}
