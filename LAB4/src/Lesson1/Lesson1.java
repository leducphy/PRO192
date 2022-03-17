/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson1;

import Menu.Common;

/**
 *
 * @author PhiLe
 */
public class Lesson1 {

    static int ctbn, sbn;

    public static void main(String[] args) {
        Citybus[] CTB = new Citybus[100];
        SubBus[] SB = new SubBus[100];
        int option;
        while (true) {
            menu();
            option = Common.InputInt("Your Option: ");
            switch (option) {
                case 1:
                    ctbn = Common.InputInt("Input number of City Bus: ");
                    for (int i = 0; i < ctbn; i++) {
                        System.out.println("-> Citybus " + (i + 1) + ": ");
                        CTB[i]= new Citybus();
                         
                    }
                    break;
                case 2:
                    sbn = Common.InputInt("Input number of Suburban Bus: ");
                    for (int i = 0; i < sbn; i++) {
                        SB[i] = new SubBus();
                        SB[i].inputSubBus();
                    }
                    break;
                case 3:
                    System.out.printf("%-18s%-18s%-18s%-18s%-18s%-18s", "Trip number", "Driver's name", "Vehicle number", "Destination", "Days", "Revenue\n");
                    for (int i = 0; i < ctbn; i++) {
                        CTB[i].show();
                    }
                    break;
                case 4:
                    System.out.printf("%-18s%-18s%-18s%-18s%-18s%-18s", "Trip number", "Driver's name", "Vehicle number", "Route number", "Kilometers", "Revenue");
                    System.out.println("");
                    for (int i = 0; i < sbn; i++) {
                        SB[i].show();
                    }
                    break;
                case 5:
                    int sumCTB = 0,
                     sumSB = 0;
                    for (int i = 0; i < ctbn; i++) {
                        sumCTB += CTB[i].getRevenue();
                    }
                    for (int i = 0; i < sbn; i++) {
                        sumSB += SB[i].getRevenue();
                    }
                    System.out.println("Total revenue of City Bus: " + sumCTB);
                    System.out.println("Total revenue of Sub Bus: " + sumSB);
                    break;
                
                case 0:
                    Menu.LAB4.main(args);
            }
        }
    }

    static void menu() {
        System.out.println("-----Bus Management-----");
        System.out.println("1. Input City Bus");
        System.out.println("2. Input Suburban Bus");
        System.out.println("3. List of City Bus trips");
        System.out.println("4. List of Sub Bus trips");
        System.out.println("5. Caculate the total revenue");
        System.out.println("0. Exit");
    }

}
