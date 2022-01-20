/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB2;

import java.util.Scanner;

/**
 *
 * @author PhiLe
 */
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cout = 0;
        String[] str = new String[100];
        System.out.println("Input the number of student: ");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Input studemt name: ");
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }
        for (int i = 0; i < n; i++) {
            if (str[i].endsWith("An")) {
                cout++;
            }
        }
        System.out.println("Number of student have the first name is An: "+cout);
    }
}
