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
public class Function {

    public ArrayList<Student> stu = new ArrayList<>();
    public ArrayList<Staff> sta = new ArrayList<>();
    public ArrayList<Customer> cus = new ArrayList<>();

    public Function() {
    }
    
    public Function(ArrayList<Student> stu, ArrayList<Staff> sta , ArrayList<Customer> cus ){
        this.stu = stu;
        this.sta = sta;
        this.cus = cus;
    }
    Scanner sc = new Scanner(System.in);

    public void InputInfo() {
        int option = -1;
        while (true) {
            System.out.println("1.Student");
            System.out.println("2.Staff");
            System.out.println("3.Customer");
            System.out.println("0.Exit");
            System.out.print("Moi ban chon: ");
            option = sc.nextInt();

            if (option == 0) {
                break;
            }
            switch (option) {
                case 1:
                    Student s = new Student();
                    s.Input();
                    stu.add(s);
                    break;

                case 2:
                    Staff f = new Staff();
                    f.Input();
                    sta.add(f);
                    break;

                case 3:
                    Customer c = new Customer();
                    c.Input();
                    cus.add(c);
                    break;

            }

        }
    }

    public void showInfo() {
        while (true) {
            System.out.println("1.Student");
            System.out.println("2.Staff");
            System.out.println("3.Customer");
            System.out.println("0.Exit");
            System.out.print("Moi ban chon: ");
            int option1 = sc.nextInt();
            if (option1 == 0) {
                break;
            }
            switch (option1) {
                case 1:
                    for (Student item : stu) {
                        System.out.println(item.toString());
                    }
                    break;
                case 2:
                    for (Staff item : sta) {
                        System.out.println(item.toString());
                    }
                    break;
                case 3:
                    for (Customer item : cus) {
                        System.out.println(item.toString());
                    }
                    break;
            }
        }
    }

    public void Change() {
        while (true) {
            System.out.println("1.Student");
            System.out.println("2.Staff");
            System.out.println("0.Exit");
            System.out.print("Moi ban chon: ");
            int option2 = sc.nextInt();
            if (option2 == 0) {
                break;
            }
            switch (option2) {
                case 1:
                    for (Student item : stu) {
                        item.Change();
                    }
                    break;

                case 2:
                    for (Staff item : sta) {
                        item.Change();
                    }
                    break;
            }
        }
    }
}
