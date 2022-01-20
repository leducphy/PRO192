/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Homework1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import javafx.print.Collation;

/**
 *
 * @author PhiLe
 */
public class btvn {

    /**
     * @param args the command line arguments
     */
    static int element;
    static ArrayList<Integer> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        displayMenu();
        while (true) {
            System.out.println("--Your option: ");
            int option = Integer.parseInt(sc.nextLine());
            if (option == 1) {
                addNumber(list);
            } else if (option == 2) {
                System.out.println(checkExistNumber(list));
            } else if (option == 3) {
                removeAllNumber(list);
            } else if (option == 4) {
                printGreaterNumber(list);
            } else if (option == 5) {
                printSmallerNumber(list);
            } else if (option == 6) {
                display(list);
            } else if (option == 7) {
                sortASC(list);
            } else if (option == 8) {
                System.exit(0);
            }
        }

    }

    static void displayMenu() {
        System.out.println("======Array List ==== ");
        System.out.println("1. add number");
        System.out.println("2. check number");
        System.out.println("3. delete number");
        System.out.println("4. display number greater");
        System.out.println("5. display number smaller");
        System.out.println("6. display list number");
        System.out.println("7. sort list");
        System.out.println("8. quit");
    }

    static void addNumber(ArrayList<Integer> list) {
        //modify here  
        System.out.print("Input number to array list: ");
        list.add(Integer.parseInt(sc.nextLine()));
    }

    static boolean checkExistNumber(ArrayList<Integer> list) {
        // modify here
        System.out.print("Input number to check in list: ");
        int checkNum = Integer.parseInt(sc.nextLine());
        return list.contains(checkNum);

    }

    static void removeAllNumber(ArrayList<Integer> list) {
        int d = Integer.parseInt(sc.nextLine());

        // C1: remove number
        boolean isRemoved = list.removeIf(t -> t.equals(d));

        // C2:remove number 
//        ArrayList<Integer> tmp = new ArrayList<>();
//        tmp.add(d);
//        boolean isRemoved = list.removeAll(tmp);
        // remove index 
//        list.remove(d)
        System.out.print("After remove: ");
        for (Integer item : list) {
            System.out.print(item + " ");
        }
        System.out.println("");
    }

    static void printGreaterNumber(ArrayList<Integer> list) {
        // modify here
        int count = 0;
        System.out.print("input number: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("greater list: ");
        for (int i = 0; i < list.size(); i++) {
            if (n < list.get(i)) {
                System.out.print(list.get(i) + " ");
                count++;
            }
        }
            if (count == 0) {
                System.out.println("Nothing");
            }

    }

    static void printSmallerNumber(ArrayList<Integer> list) {
        // modify here
        int count = 0;
        System.out.print("input number: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.print("smaller list: ");
        for (int i = 0; i < list.size(); i++) {
            if (n > list.get(i)) {
                System.out.println(list.get(i) + " ");
                count++;
            }
        }
            if (count == 0) {
                System.out.println("Noting");
            }
    }

    static void display(ArrayList<Integer> list) {
        // modify here
        if (list.isEmpty()) {
            System.out.println("Nothing");
        } else {
            System.out.println(list);
        }
    }

    static void sortASC(ArrayList<Integer> list) {
        // modify here
        Collections.sort(list);
        System.out.println("da sap xep dmm");
    }

    

}