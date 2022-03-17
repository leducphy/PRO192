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
public class LandTrans extends Trans {

    private String typeLand;

    public LandTrans() {
        super();
    }

    public LandTrans(String typeLand, int transCode, String transDate, long unitPrice, float area) {
        super(transCode, transDate, unitPrice, area);
        this.typeLand = typeLand;
    }

    public String getTypeLand() {
        return typeLand;
    }

    public void setTypeLand(String typeLand) {
        this.typeLand = typeLand;
    }

    public void inputLand() {
        setTransCode(Common.InputInt("Trans code: "));
        setTransDate(Common.InputString("Trans date: "));
        setUnitPrice(Common.InputInt("Unit price: "));
        setTypeLand(Common.InputString("Type of land(A/B/C): "));
        setArea(Common.InputDouble("Area: "));

    }

    

    @Override
    public String toString() {
        return super.toString() + "Type Land " + this.typeLand;
    }

}
