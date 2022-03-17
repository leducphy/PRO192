/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PhiLe
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Student> stu = new ArrayList<>();
        ArrayList<Staff> sta = new ArrayList<>();
        ArrayList<Customer> cus = new ArrayList<>();

        Function F = new Function(stu, sta, cus);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Nhap thong tin ");
            System.out.println("2.Hien thi thong tin");
            System.out.println("3.Thay doi thong tin");
            System.out.println("0.Exit");
            System.out.print("Moi ban chon: ");
            int subOp = Integer.parseInt(sc.nextLine());
            if (subOp == 0) {
                break;
            }
            switch (subOp) {
                case 1:
                    F.InputInfo();
                    break;
                case 2:
                    F.showInfo();
                    break;
                case 3:
                    F.Change();
                    break;
            }
        }
    }
}
