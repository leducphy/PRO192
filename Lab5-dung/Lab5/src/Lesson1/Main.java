/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PhiLe
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<billHour> arrBillHour = new ArrayList<>();
        ArrayList<billDaily> arrBilDaily = new ArrayList<>();

        Function F1 = new Function(arrBillHour, arrBilDaily);
        int option = -1;
        showMenu();
        while (true) {
            System.out.print("Moi nhap lua chon: ");
            option = Integer.parseInt(sc.nextLine());
            if(option ==0)  break;
            switch (option) {
                case 1:
                    int numberOfBillHour,
                     numberOfBillDaily;
                    System.out.print("Nhap so luong hoa don theo gio: ");
                    numberOfBillHour = Integer.parseInt(sc.nextLine());
                    System.out.print("Nhap so luong hoa don theo ngay: ");
                    numberOfBillDaily = Integer.parseInt(sc.nextLine());
                    F1.Input1(numberOfBillHour, numberOfBillDaily);

                    break;
                case 2:
                    F1.Total();
                    break;
                case 3:
                    F1.Average();
                    break;
                default:
                    System.out.print("Lua chon khong hop le ");
            }
        }
    }

    public static void showMenu() {
        System.out.println("1.Nhap danh sach ");
        System.out.println("2.Tinh tong so tien cho tung loai phong ");
        System.out.println("3.Tinh trung binh cong hoa don thang 10/2018");
        System.out.println("0.Exit");
    }
}
