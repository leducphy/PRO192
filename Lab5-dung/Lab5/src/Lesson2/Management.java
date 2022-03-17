/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author PhiLe
 */
public class Management {
    
    public ArrayList<Student> St;
    public ArrayList<Employee> Em;
    public ArrayList<Customer> Cus;
    
    public Management() {
    }
    
    public Management(ArrayList<Student> St, ArrayList<Employee> Em, ArrayList<Customer> Cus) {
        this.St = St;
        this.Em = Em;
        this.Cus = Cus;
    }
    Scanner sc = new Scanner(System.in);
    
    public void InputInfo() {
        while (true) {
            System.out.println("1.Students ");
            System.out.println("2.Employee");
            System.out.println("3.Customers");
            System.out.println("0.Eixt");
            System.out.print("Moi ban chon ");
            int op1 = Integer.parseInt(sc.nextLine());
            if (op1 == 0) {
                break;
            }
            switch (op1) {
                case 1:
                    Student s = new Student();
                    s.Input();
                    St.add(s);
                    break;
                case 2:
                    Employee e = new Employee();
                    e.Input();
                    Em.add(e);
                    break;
                case 3:
                    Customer c = new Customer();
                    c.Input();
                    Cus.add(c);
                    break;
            }
        }
        
    }
    
    public void showInfo() {
        while (true) {
            System.out.println("1.Students ");
            System.out.println("2.Employee");
            System.out.println("3.Customers");
            System.out.println("0.Eixt");
            System.out.print("Moi ban chon ");
            int op2 = Integer.parseInt(sc.nextLine());
            if (op2 == 0) {
                break;
            }
            switch (op2) {
                case 1:
                    for (Student item : St) {
                        System.out.println(item.toString());
                    }
                    break;
                
                case 2:
                    for (Employee item : Em) {
                        System.out.println(item.toString());
                    }
                    break;
                
                case 3:
                    for (Customer item : Cus) {
                        System.out.println(item.toString());
                    }
                    break;
            }
        }
    }
    
    public void Remove() {
        while (true) {
            System.out.println("1.Students ");
            System.out.println("2.Employee");
            System.out.println("3.Customers");
            System.out.println("0.Eixt");
            System.out.print("Moi ban chon ");
            int op3 = Integer.parseInt(sc.nextLine());
            if (op3 == 0) {
                break;
            }
            switch (op3) {
                case 1:
                    
                    System.out.print("Nhap ten muon xoa: ");
                    String nameRemove1 = sc.nextLine();
                    this.re(nameRemove1);
                    for (Student item : St) {
                        System.out.println(item.toString());
                    }
                    break;
                case 2:
                    System.out.print("Nhap ten muon xoa: ");
                    String nameRemove2 = sc.nextLine();
                    this.ree(nameRemove2);
                    
                    for (Employee item : Em) {
                        System.out.println(item.toString());
                    }
                    
                    break;
                
                case 3:
                    System.out.print("Nhap ten muon xoa: ");
                    String nameRemove3 = sc.nextLine();
                    this.reee(nameRemove3);
                    
                    for (Customer item : Cus) {
                        System.out.println(item.toString());
                    }
                    break;
            }
        }
    }
    
    public void sort() {
        while (true) {
            System.out.println("1. Students");
            System.out.println("2. Employee");
            System.out.println("3. Customers");
            System.out.println("4. Exit");
            System.out.print("Moi ban chon: ");
            int op3 = Integer.parseInt(sc.nextLine());
            if (op3 == 0) {
                break;
            }
            switch (op3) {
                case 1: {
                    Collections.sort(St, new Comparator<Student>() {
                        @Override
                        public int compare(Student o1, Student o2) {
                            return o1.getName().compareTo(o2.getName());
                        }
                    });
                    for (Student item : St) {
                        System.out.println(item.toString());;
                    }
                    break;
                }
                case 2: {
                    Collections.sort(Em, new Comparator<Employee>() {
                        @Override
                        public int compare(Employee e2, Employee e3) {
                            return e2.getName().compareTo(e3.getName());
                        }
                    });
                    for (Employee item : Em) {
                        System.out.println(item.toString());
                    }
                    break;
                }
                case 3: {
                    Collections.sort(Cus, new Comparator<Customer>() {
                        @Override
                        public int compare(Customer c1, Customer c2) {
                            return c1.getName().compareTo(c2.getName());
                        }
                    });
                    for (Customer item : Cus) {
                        System.out.println(item.toString());
                    }
                    break;
                }
            }
            
        }
    }
    
    public void re(String a) {
        for (Student x : St) {
            if (a.equalsIgnoreCase(x.getName())) {
                St.remove(x);
                break;
            }
        }
    }
    
    public void ree(String a) {
        for (Employee e : Em) {
            if (a.equalsIgnoreCase(e.getName())) {
                Em.remove(e);
                break;
            }
        }
    }
    
    public void reee(String a) {
        for (Customer c : Cus) {
            if (a.equalsIgnoreCase(c.getName())) {
                Cus.remove(c);
                break;
            }
        }
    }
}
