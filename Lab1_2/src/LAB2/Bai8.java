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
public class Bai8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int count = 0;
        System.out.print("input the number: ");
        n = Integer.parseInt(sc.nextLine());
        System.out.println("input student name : ");
        String[] str = new String[100];
        for (int i = 0; i < n; i++) str[i] = sc.nextLine().trim();
        for (int i = 0; i < n; i++) if (str[i].startsWith("T")) count++;
        System.out.println("Number of students have last name start with \"T\" is : " + count);
    }
}
