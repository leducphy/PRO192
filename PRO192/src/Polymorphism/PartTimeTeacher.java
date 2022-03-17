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
public class PartTimeTeacher extends Teacher {

    private int slot;

    public PartTimeTeacher() {
    }

    public PartTimeTeacher(String code, String name, int slot) {
        super(code, name);
        this.slot = slot;
    }

    public int getSlot() {
        return slot;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    @Override
    public double getSalary() {
        return slot * 50000;
    }

}
