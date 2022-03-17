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
public class Human {
    private String name;
    private String address;

    public Human() {
    }

    public Human(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    Scanner sc = new Scanner(System.in);
    public void Input(){
        System.out.print("Nhap ten: ");
        name = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        address = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Ten: "+this.name+
                " Dia chi: "+this.address;
    }
    
    
}
