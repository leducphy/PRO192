/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB1;

import java.util.Scanner;

/**
 *
 * @author PhiLe
 */
public class Bai10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the number of array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("input number to array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("array before: ");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println("\n");
        //delete k
        int k = 0;
        //legth of array after remove k is c
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != k) {
                arr[c] = arr[i];
                c++;
            }
        }
        
        System.out.println("array after remove: ");
        for (int i = 0; i < c; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
