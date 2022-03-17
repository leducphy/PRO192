/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson2;

import java.util.Scanner;
import Menu.Common;

/**
 *
 * @author PhiLe
 */

public class lesson2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Vehicle car1 = new Vehicle();
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Vehicle();
        
        while (true) {
            menu();
            System.out.println("Your option: ");
            int option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    Input1(car1);
                    Input1(vehicle1);
                    Input1(vehicle2);
                    break;
                case 2:
                    show(car1, vehicle1, vehicle2);
                    break;
                case 3:
                    System.exit(0);
                default:
                    break;
            }
        }

    }

    public static void menu() {
        System.out.println("1. Nhập thông tin");
        System.out.println("2. Hiện thông tin");
        System.out.println("3. Thoát!");
    }

    public static void Input1(Vehicle xe) {
        xe.setName(Common.InputString("Nhập tên chủ xe: "));
        xe.setType(Common.InputString("Nhập tên loại xe: "));
        xe.setCapacity(Common.InputInt("Nhập dung tích xe: "));
        xe.setCost(Common.InputDouble("Nhập giá trị của xe: "));
        System.out.println("***********");
    }

    public static void show(Vehicle car1, Vehicle vehicle1, Vehicle vehicle2) {
        System.out.printf("Tên chủ xe             Loại xe              Dung tích                       Trị giá            Thuế phải nộp     \n");
        System.out.printf("=======================================================================================================================\n");
        System.out.printf("%-10s             %-26s%-20d%-35.2f%-20.2f\n", car1.getName(), car1.getType(), car1.getCapacity(), car1.getCost(), car1.getTax());
        System.out.printf("%-10s             %-26s%-20d%-35.2f%-20.2f\n", vehicle1.getName(), vehicle1.getType(), vehicle1.getCapacity(), vehicle1.getCost(), vehicle1.getTax());
        System.out.printf("%-10s             %-26s%-20d%-35.2f%-20.2f\n", vehicle2.getName(), vehicle2.getType(), vehicle2.getCapacity(), vehicle2.getCost(), vehicle2.getTax());
        System.out.print("\n");
    }
}
