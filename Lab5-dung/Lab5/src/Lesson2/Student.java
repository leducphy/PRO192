/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson2;

/**
 *
 * @author PhiLe
 */
public class Student extends Person {

    double point1, point2;

    public Student() {
    }

    public Student(double point1, double point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Student(double point1, double point2, String name, String address) {
        super(name, address);
        this.point1 = point1;
        this.point2 = point2;
    }

    public double getPoint1() {
        return point1;
    }

    public void setPoint1(double point1) {
        this.point1 = point1;
    }

    public double getPoint2() {
        return point2;
    }

    public void setPoint2(double point2) {
        this.point2 = point2;
    }

    @Override
    public void Input() {
        super.Input();
        System.out.print("Nhap diem mon 1 : ");
        point1 = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap diem mon 2: ");
        point2 = Double.parseDouble(sc.nextLine());

    }

    @Override
    public String toString() {
        return super.toString() + " Điểm môn 1: " + this.getPoint1()
                + " Điểm môn 2: " + this.getPoint2();
    }

}
