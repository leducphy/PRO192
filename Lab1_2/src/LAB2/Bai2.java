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
public class Bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String abc = "abc";
        int lastIndex = 0;
        System.out.print("input string: ");
        String str = sc.nextLine();

        while (lastIndex != -1) {
            lastIndex = str.indexOf(abc, lastIndex); //string.indexOf(searchvalue, start)
            if (lastIndex != -1) {
                count++;
                lastIndex += abc.length();
            }
        }
        System.out.println("-abc- appears " + count + " times in the strings.");
    }
}
