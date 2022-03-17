/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson4;

/**
 *
 * @author PhiLe
 */
public class Staff extends Human {

    double salary;
    String position;

    public Staff() {
    }

    public Staff(double salary, String position) {
        this.salary = salary;
        this.position = position;
    }

    public Staff(double salary, String position, String name, String address) {
        super(name, address);
        this.salary = salary;
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void Input() {
        super.Input();
        System.out.print("Nhap chuc vu: ");
        this.position = sc.nextLine();
        System.out.print("Nhap luong: ");
        this.salary = sc.nextDouble();
    }

    public void Change() {
        System.out.println("1.Thay doi muc luong");
        System.out.println("2.Thay doi vi tri");
        System.out.print("Moi ban chon: ");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.print("Nhap muc luong: ");
                sc.nextLine();
                this.setSalary(sc.nextDouble());
                break;
            case 2:
                System.out.print("Nhap chuc vu: ");
                sc.nextLine();
                this.setPosition(sc.nextLine());
                break;

        }
    }

    @Override
    public String toString() {
        return super.toString() + " Chuc vu " + this.getPosition()
                + " Muc luong " + this.getSalary();
    }

}
