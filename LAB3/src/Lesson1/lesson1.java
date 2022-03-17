/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson1;

import java.util.Scanner;

/**
 *
 * @author PhiLe
 */
public class lesson1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input length: ");
        double x = sc.nextDouble();
        System.out.println("Input Width: ");
        double y = sc.nextDouble();
        HinhChuNhat hcn = new HinhChuNhat(x,y);
        hcn.show();
        
    }

}
