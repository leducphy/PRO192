/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

/**
 *
 * @author PhiLe
 */
public class FullTimeTeacher extends Teacher {

    private double heSo;

    public FullTimeTeacher() {
    }

    public FullTimeTeacher(String code, String name, double heSo) {
        super(code, name);
        this.heSo = heSo;
    }

    public double getHeSo() {
        return heSo;
    }

    public void setHeSo(double heSo) {
        this.heSo = heSo;
    }

    @Override
    public double getSalary() {
        return heSo * 2000000;
    }

}
