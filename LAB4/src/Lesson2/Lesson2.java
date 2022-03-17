/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson2;

import Menu.Common;

/**
 *
 * @author PhiLe
 */
public class Lesson2 {
    static int tbn, rbn;
    public static void main(String[] args) {
        Textbook[] TB = new Textbook[100];
        ReferenceBook[] RB = new ReferenceBook[100];

        while (true){
            showMenu();
            int option = Common.InputInt("Your Option: ");
            switch (option){
                case 1:
                    tbn = Common.InputInt("Number of Textbook: ");
                    for (int i = 0; i < tbn; i++){
                        TB[i] = new Textbook();
                        TB[i].inputTextbook();
                    }
                    break;
                case 2:
                    rbn = Common.InputInt("Number of Ref book: ");
                    for (int i = 0; i < rbn; i++){
                        RB[i] = new ReferenceBook();
                        RB[i].inputRefBook();
                    }
                    break;
                case 3:
                    System.out.printf("%-18s%-18s%-18s%-18s%-18s%-18s", "Book code", "DateEntry", "Price", "Quantity", "Publisher", "Status");
                    System.out.println("");
                    for (int i = 0; i < tbn; i++) {
                        TB[i].show();
                    }
                    break;
                case 4:
                    System.out.printf("%-18s%-18s%-18s%-18s%-18s%-18s", "Book code", "DateEntry", "Price", "Quantity", "Publisher", "Tax");
                    System.out.println("");
                    for (int i = 0; i < rbn; i++) {
                        RB[i].show();
                    }
                    break;
                case 5:
                    double sum = 0;
                    for (int i = 0; i < tbn; i++){
                        sum += TB[i].getTotalMoney();
                    }
                    System.out.println("[TextBook] Total money: " + sum);
                    break;
                case 6:
                    double sum2 = 0;
                    for (int i = 0; i < rbn; i++){
                        sum2 += RB[i].getAmount();
                    }
                    System.out.println("[Reference book] Total money: "+ sum2);
                    break;
                case 7:
                    double ave = 0;
                    for (int i = 0; i < rbn; i++){
                        ave = (ave + RB[i].Average())/2;
                    }
                    System.out.println("[Reference book] Averange: "+ ave);
                    break;
                case 8:
                    String x = Common.InputString("Publisher: ");
                    for (int i = 0; i < tbn; i++) {
                        if (TB[i].getPublisher().equalsIgnoreCase(x)){
                            TB[i].show();
                        }
                    }
                    break;
                case 0:
                    Menu.LAB4.main(args);
            }
        }
    }

    static void showMenu(){
        System.out.println("-----Library Management-----");
        System.out.println("1. Add Textbook");
        System.out.println("2. Add Reference Book");
        System.out.println("3. Display all Textbook");
        System.out.println("4. Display all Reference Book");
        System.out.println("5. Sum of Textbook's money");
        System.out.println("6. Sum of ReferenceBook's Money");
        System.out.println("7. Average of the unit price of the reference book");
        System.out.println("8. Export textbooks of publisher X");
        System.out.println("0. Exit");
    }
}
