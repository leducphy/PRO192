/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson3;

import Menu.Common;

/**
 *
 * @author PhiLe
 */
public class Lesson3 {

    public static void main(String[] args) {
        GoldTrading[] GT = new GoldTrading[100];
        CurrencyTrading[] CT = new CurrencyTrading[100];
        int gtn = 0, ctn = 0;
        while (true) {
            menu();
            int option = Common.InputInt("Your Option: ");
            switch (option) {
                case 1:
//                    GT[1] = new GoldTrading("9999", 12, 37000000, 10, "19/05/2020");
//                    GT[2] = new GoldTrading("999", 9, 57000000, 2, "9/05/2022");
                    gtn = Common.InputInt("number of gold trading: ");
                    for (int i = 0; i < gtn; i++) {
                        System.out.println("**Gold Trading: " + i + 1);
                        GT[i] = new GoldTrading();
                        GT[i].inputGT();
                    }
                    break;
                case 2:
//                    CT[1] = new CurrencyTrading(23000, "USD", 3, 120000000, 6, "13/2/2022");
//                    CT[3] = new CurrencyTrading(32000, "ERO", 2, 220000000, 6, "14/2/2022");
//                    CT[2] = new CurrencyTrading(10000, "VND", 1, 320000000, 6, "15/2/2022");
                    ctn = Common.InputInt("number of currency trading: ");
                    for (int i = 0; i < ctn; i++) {
                        System.out.println("**Currency Trading: " + i);
                        CT[i] = new CurrencyTrading();
                        CT[i].inputCT();
                    }
                    break;
                case 3:
                    System.out.println("[Gold Trading]");
                    System.out.printf("%-18s%-18s%-18s%-18s%-18s", "Code", "Date", "Price", "Quantity", "GoldType");
                    System.out.println("");
//                    GT[1].show();
//                    GT[2].show();
                    for (int i = 0; i < gtn; i++) {
                        GT[i].show();
                    }
                    System.out.println("******");
                    System.out.println("[Referency Trading]");
                    System.out.printf("%-18s%-18s%-18s%-18s%-18s", "Code", "Date", "Price", "Quantity", "Currency");
                    System.out.println("");
                    for (int i = 0; i < ctn; i++) {
                        CT[i].show();
                    }
                    break;
                case 4:
                    int sumGT = 0,sumCT = 0;
                    for (int i = 0; i < gtn; i++) {
                        sumGT += GT[i].getQuantity();
                    }
                    for (int i = 0; i < ctn; i++) {
                        sumCT = CT[i].getQuantity();
                    }
                    System.out.println("[Gold] Total number: " + sumGT);
                    System.out.println("[Referency] Total number: " + sumCT);
                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 0:
                    Menu.LAB4.main(args);

            }
        }
    }

    static void menu() {
        System.out.println("*****TRADING MANAGEMENT*****");
        System.out.println("1. Input gold trading");
        System.out.println("2. Input currency trading");
        System.out.println("3. Export list ");
        System.out.println("4. Total category of all");
        System.out.println("5. Average of money");
        System.out.println("6. Export transactions with unit price > 1 billion.");
        System.out.println("0. Exit");
    }
}
