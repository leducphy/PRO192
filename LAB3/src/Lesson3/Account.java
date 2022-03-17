package Lesson3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author PhiLe
 */
public class Account {

    private long id;
    private String name;
    private double balance;

    public Account() {
    }

    public Account(long id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "id" + id + "name" + name + "balance" + balance;
    }
    static Scanner sc = new Scanner(System.in);
    // Phương thức nạp tiền

    public void deposit() {
        int amount;
        System.out.print("Nhập số tiền cần nạp: ");
        // Số tiển nạp phải lớn hơn 0 
        do {
            amount = sc.nextInt();
            if (amount >= 0) {
                balance = balance + amount;
                System.out.println("Bạn đã nạp " + amount + " vào tài khoản");
            } else {
                System.out.println("Số tiền nạp không hợp lệ.Vui lòng nhập lại : ");
            }

        } while (amount < 0);
    }

    public void withdraw() {
        double fee = 5;
        int amount;
        System.out.print("Nhập số tiền cần rút : ");
        do {
            amount = sc.nextInt();
            if (amount <= (balance - fee)) {
                balance = balance - (amount + fee);
                System.out.println("Số tiền bạn vừa rút là " + amount + " với phí là " + fee);
            } else {
                System.out.println("Số dư của bạn không đủ để rút, vui lòng nhập lại");
            }
        } while (amount > (balance - fee));

    }

    public void maturity() {

        double rate = 0.035;
        balance = balance + balance * rate;
        System.out.println("Số tiền bạn nhận có sau khi đáo hạn là " + balance);
    }

    

    public void output() {
        System.out.printf("%-15d%-25s%-25.2f\n", getId(), getName(), getBalance());
    }

}