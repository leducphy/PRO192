/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOP;

import JacaLanguage.Common;
import java.io.IOException;

/**
 * @author PhiLe
 */
public class Student {

    private int code;
    protected String name;
    String gender;

    public Student() {

    }

    //Constructor full tham số
    public Student(int code, String name, String gender, double math, double liter) {
        this.code = code;
        this.name = name;
        this.gender = gender;
        this.math = math;
        this.liter = liter;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double math, liter;

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    // tinh tb diem 
    public double getAverage() {
        return (this.math + this.liter) / 2;
    }

    //show tt cua sv
    public void show() {
        System.out.println("Code: " + this.getCode());
        System.out.println("Name: " + this.name);
        System.out.println("Gender: " + this.gender);
        System.out.println("Math: " + this.math);
        System.out.println("Liter: " + this.liter);
        System.out.println("Average: " + this.getAverage());
    }

    public void show(int option) {
        System.out.print(this.getCode());
        System.out.print("\t" + this.name);
        System.out.print("\t" + this.gender);
        System.out.print("\t" + this.math);
        System.out.print("\t" + this.liter);
        System.out.println("\t" + this.getAverage());
    }

    public void input() throws IOException {
        this.setCode(Common.InputInt("Enter Code: "));
        this.name = Common.in.readLine();
        this.gender = Common.in.readLine();
        this.math = Common.InputDouble("Enter Math: ");
        this.liter = Common.InputDouble("Enter Math: ");
    }
}
