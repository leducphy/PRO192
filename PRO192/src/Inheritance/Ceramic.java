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
public class Ceramic extends Product {

    private String type;

    public Ceramic() {
    }

    public Ceramic(String type, String code, String name, String make, double price) {
        super(code, name, make, price);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + type;
    }

}
