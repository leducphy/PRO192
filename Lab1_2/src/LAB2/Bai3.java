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
public class Bai3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input string: ");
        String s = sc.nextLine();
        char[] c = s.toCharArray(); //
        char[] c1 = new char[s.length()];
        for (int i = 0; i < c.length; i++) {
            if (c[i] == '0') {
                c1[i] = '1';
            } else if (c[i] == '1') {
                c1[i] = '0';
            } else {
                c1[i] = c[i];//
            }
        }
        s = "";
        for (int i = 0; i < c1.length; i++) {
            s += c1[i];
        }
        System.out.println(s);
    }
}
