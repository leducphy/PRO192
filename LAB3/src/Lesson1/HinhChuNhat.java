/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson1;

/**
 *
 * @author PhiLe
 */
public class HinhChuNhat {

    private double Length, Width;

    public HinhChuNhat(double Length, double Width) {
        this.Length = Length;
        this.Width = Width;
    }

    public double getLength() {
        return Length;
    }

    public void setLength(double Length) {
        this.Length = Length;
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double Width) {
        this.Width = Width;
    }

    public double getArea() {
        return this.Width * this.Length;
    }

    public double getPerimeter() {
        return (this.Width + this.Length) * 2;
    }

    public void show() {
        System.out.println("Length: " + this.Length);
        System.out.println("Width: " + this.Width);
        System.out.println("Area: " + this.getArea());
        System.out.println("Perimeter: " + this.getPerimeter());

    }
}
