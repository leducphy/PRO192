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
public class Bai7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input the number ò student : ");
        int n = Integer.parseInt(sc.nextLine());
        int count = 0;
        String[] student = new String[n];
        System.out.print("input student name : ");
        for (int i = 0; i < n; i++) {
            student[i] = sc.nextLine().trim();
        }
        //count
        for (int i = 0; i < n; i++) {
            if (checkName(student[i])) {
                count++;
            }
        }
        System.out.println("The number student have the \"Hoa\" padding :" + count);
    }
    
    //check Hoa in surname

    public static boolean checkName(String s) {
        String[] words = s.split("\\s+");
        for (int i = 1; i < words.length - 1; i++) {
            if (words[i].equals("Hoa")) {
                return true;
            }
        }
        return false;
    }
}
