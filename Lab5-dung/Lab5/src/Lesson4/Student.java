/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson4;

import java.util.Scanner;

/**
 *
 * @author PhiLe
 */
public class Student extends Human {

    double sub1;
    double sub2;

    public Student() {
    }

    public Student(double sub1, double sub2) {
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    public Student(double sub1, double sub2, String name, String address) {
        super(name, address);
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    public double getSub1() {
        return sub1;
    }

    public void setSub1(double sub1) {
        this.sub1 = sub1;
    }

    public double getSub2() {
        return sub2;
    }

    public void setSub2(double sub2) {
        this.sub2 = sub2;
    }

    @Override
    public void Input() {
        super.Input();
        System.out.print("Nhap diem mon hoc 1: ");
        this.sub1 = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap diem mon hoc 2: ");
        this.sub2 = Double.parseDouble(sc.nextLine());
    }

    public void Total() {
        System.out.println(this.getSub1() + this.getSub2());
    }

    public void Change() {
        System.out.println("1.Thay doi diem mon hoc 1");
        System.out.println("2.Thay doi diem mon hoc 2");
        System.out.print("Nhap lua chon: ");
        int option = Integer.parseInt(sc.nextLine());
        switch (option) {
            case 1:
                System.out.print("Nhap diem mon hoc 1: ");
                this.setSub1(Double.parseDouble(sc.nextLine()));
                break;
            case 2:
                System.out.print("Nhap diem mon hoc 2: ");
                this.setSub2(Double.parseDouble(sc.nextLine()));
                break;
        }
    }

    @Override
    public String toString() {
        return super.toString()+" Diem mon 1: "+this.getSub1()+
                " Diem mon 2: "+this.getSub2();
    }
    

}
