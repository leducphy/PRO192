/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PhiLe
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Student> St = new ArrayList<Student>();
        ArrayList<Employee> Em = new ArrayList<Employee>();
        ArrayList<Customer> Cus = new ArrayList<Customer>();

        Management M = new Management(St, Em, Cus);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Nhap thong tin ");
            System.out.println("2.Xuat thong tin ");
            System.out.println("3.Xoa thong tin ");
            System.out.println("4.Sap xep danh sach");
            System.out.println("0.Exit");
            System.out.print("Moi ban chon: ");
            int option = Integer.parseInt(sc.nextLine());
            if (option == 0) {
                break;
            }
            switch (option) {
                case 1:
                    M.InputInfo();
                    break;
                case 2:
                    M.showInfo();
                    break;
                case 3:
                    M.Remove();
                    break;
                case 4:
                    M.sort();
                    break;
            }
        }
    }
}
