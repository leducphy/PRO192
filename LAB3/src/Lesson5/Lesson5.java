/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson5;

import Menu.Common;
import java.util.Scanner;

/**
 *
 * @author PhiLe
 */
public class Lesson5 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        CD cd[]= null;
        int a, amount = 0;
        while (true){
            menu();
            int option = Common.InputInt("Your choice: ");
            switch (option){
                case 1:
                    amount = Common.InputInt("Input CD amount: ");
                    cd = new CD[amount];
                    for (int i = 0;i < amount; i++){
                        System.out.println("CD number " + (i + 1)+ ": ");
                        cd[i] = new CD();
                        inputCD(cd[i]);
                    }
                    break;
                case 2:
                    System.out.printf("%-10s %-20s %-20s %-10s %-20s \n", "Code", "Title", "Singer", "Song Number", "Cost");
                    for (int i = 0; i < amount; i++) {
                        cd[i].showCD();
                    }
                    break;
                case 3:
                    int sum = 0 ;
                    for (int i = 0; i < amount; i++) {
                        sum += cd[i].getCost();
                    }
                    System.out.println("Sum all prime: " + sum);
                    break;
                case 4:
                    System.out.println("CD number: " + amount);
                    break;
                case 5:
                    CD tmp = cd[0];
                    for (int i = 0; i < amount - 1; i++) {
                        for (int j = i + 1; j < amount; j++) {
                            if (cd[i].getCost() < cd[j].getCost()) {
                                tmp = cd[j];
                                cd[j] = cd[i];
                                cd[i] = tmp;
                            }
                        }
                    }
                    System.out.println("Done!");
                    System.out.printf("%-10s %-20s %-20s %-10s %-20s \n", "Code", "Title", "Singer", "Song Number", "Cost");
                    for (int i = 0; i < amount; i++) {
                        cd[i].showCD();
                    }
                    break;
                    
                case 6:
                    tmp = cd[0];
                    for (int i = 0; i < amount - 1; i++) {
                        for (int j = i + 1; j < amount; j++) {
                            if (cd[i].getCdTitle().compareTo(cd[j].getCdTitle())>0) {
                                tmp = cd[j];
                                cd[j] = cd[i];
                                cd[i] = tmp;
                            }
                        }
                    }
                    System.out.println("Done!");
                    System.out.printf("%-10s %-20s %-20s %-10s %-20s \n", "Code", "Title", "Singer", "Song Number", "Cost");
                    for (int i = 0; i < amount; i++) {
                        cd[i].showCD();
                    }
                    break;
                case 0:
                    break;
            }

        }
    }
    
    static void inputCD(CD cd){
        cd.setCdCode(Common.InputInt("Input CD code: "));
        cd.setCdTitle(Common.InputString("Input CD title: "));
        cd.setSinger(Common.InputString("Input singer name: "));
        cd.setSongNumber(Common.InputInt("Input song number: "));
        cd.setCost(Common.InputInt("Input CD cost: "));
    }

    static void menu(){
        System.out.println("*********CD MANAGEMENT*********");
        System.out.println("1. Input CD");
        System.out.println("2. Export CD");
        System.out.println("3. Total cost");
        System.out.println("4. CD number");
        System.out.println("5. Sort descending by cost");
        System.out.println("6. Sort ascending by CD title");
        System.out.println("0. Exit!");
    }
}
