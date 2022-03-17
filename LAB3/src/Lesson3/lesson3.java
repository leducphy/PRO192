/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson3;

import java.util.Scanner;

/**
 *
 * @author PhiLe
 */
public class lesson3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Account a[] = null;
        int option;
        int number = 50;
        long id;
        long d;
        do {
            showMenu();
            System.out.print("Mời bạn nhập : ");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    System.out.print("Nhập số lượng khách hàng bạn muốn nhập ");
                    number = Integer.parseInt(sc.nextLine());
                    a = new Account[number];
                    for (int i = 0; i < number; i++) {
                        System.out.println("Khách hàng số " + (i + 1));
                        a[i] = new Account();
                        Input(a[i]);
                    }
                    break;

                case 2:
                    System.out.printf("%-15s%-25s%-25s\n", "Số tài khoản", "Tên tài khoản", "Số tiền trong tài khoản");
                    for (int i = 0; i < number; i++) {
                        a[i].output();
                    }
                    break;

                case 3:
                    System.out.print("Nhập số tài khoản bạn muốn nạp : ");
                    id = Long.parseLong(sc.nextLine());

                    for (int i = 0; i < number; i++) {
                        d = a[i].getId();
                        if (id == d) {
                            System.out.println("Tài khoản đã chọn " + d);
                            a[i].deposit();

                        }
                        else{
                            System.out.println("");
                        }
                    }

                    break;
                case 4:
                    System.out.print("Nhập số tài khoản cần rút");
                    id = Long.parseLong(sc.nextLine());
                    for (int i = 0; i < number; i++) {
                        if (id == a[i].getId()) {
                            System.out.println("Tài khoản đã chọn " + id);
                            a[i].withdraw();
                        }
                        else{
                            System.out.println("");
                        }

                    }

                    break;

                case 5:
                    System.out.print("Nhập số tài khoản đáo hạn ");
                    id = Long.parseLong(sc.nextLine());
                    for (int i = 0; i < number; i++) {
                        if (id == a[i].getId()) {
                            System.out.println("Tài khoản đã chọn " + id);
                            a[i].maturity();
                        }
                        else{
                            System.out.println("");
                        }

                    }

                    break;

                case 6:
                    long receiveId;
                    int amount;
                    System.out.print("Nhập số tài khoản  chuyển ");
                    id = Long.parseLong(sc.nextLine());
                    System.out.print("Nhập số tài khoản nhận ");
                    receiveId = Long.parseLong(sc.nextLine());
                    for (int i = 0; i < number; i++) {
                        if (id == a[i].getId()) {
                            double transferBalance = a[i].getBalance();
                            for (int j = 0; j < number; j++) {
                                if (receiveId == a[j].getId()) {
                                    double reciveBalance = a[j].getBalance();
                                    System.out.print("Nhap so tien can chuyen ");
                                    amount = Integer.parseInt(sc.nextLine());
                                    if (amount <= transferBalance) {
                                        transferBalance = transferBalance - amount;
                                        reciveBalance = reciveBalance + amount;
                                        a[i].setBalance(transferBalance);
                                        a[j].setBalance(reciveBalance);
                                        System.out.println("Chuyển tiền thành công ");
                                    } else {
                                        System.out.println("Số tiền không hợp lệ ");
                                    }
                                } else {
                                    System.out.println("");
                                }
                            }

                        } else {
                            System.out.println("");
                        }
                    }
                    break;
                case 0:
                    break;
            }
        } while (option != 0);
    }

    public static void showMenu() {
        System.out.println("1.Nhập thông tin khách hàng ");
        System.out.println("2.Xuât thông tin khách hàng ");
        System.out.println("3.Nạp tiền ");
        System.out.println("4.Rút tiền");
        System.out.println("5.Đáo hạn ");
        System.out.println("6.Chuyển khoản");
        System.out.println("0.Thoát");

    }

    public static void Input(Account acc) {
        System.out.print("Nhập số tài khoản: ");
        acc.setId(Long.parseLong(sc.nextLine()));
        System.out.print("Nhập tên tài khoản: ");
        acc.setName(sc.nextLine());
        acc.setBalance(50);
    }

}
