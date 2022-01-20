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
public class Bai5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        String temp = "";

        System.out.print("input number of string : ");
        n = Integer.parseInt(sc.nextLine());
        String[] str = new String[100];
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }
        int max = str[0].length();
        for (int i = 0; i < n; i++) {
            if (str[i].length() >= max) {
                max = str[i].length();
                temp = str[i];

            }
        }
        System.out.println("longest string: " + temp);
    }
}
