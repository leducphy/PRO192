/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author PhiLe
 */
public class Electric extends Product{
    private int guaranly;
    private int voltage;
    private int power;

    public Electric(String code, String name, String make, double price) {
        super(code, name, make, price);
    }

    
    
    public Electric(int guaranly, int voltage, int power, String code, String name, String make, double price) {
        super(code, name, make, price);
        this.guaranly = guaranly;
        this.voltage = voltage;
        this.power = power;
    }

    public int getGuaranly() {
        return guaranly;
    }

    public void setGuaranly(int guaranly) {
        this.guaranly = guaranly;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    
    
    
    
    
}
