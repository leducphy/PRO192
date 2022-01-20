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
public class Bai9 {

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
        softArray(arr);
        System.out.println("\n");
        primeInArray(arr);
        System.out.println("\n");
        System.out.println("has " + countPrime(arr) + " prime numbers in array");
        System.out.println("has " + countComposite(arr) + " composite numbers in array");

    }

    /**
     *
     */
    static void softArray(int[] arr) {
        int tmp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.print("array after softing: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }

    static boolean isPrime(int n) {

        // Check if number is less than
        // equal to 1
        if (n <= 1) {
            return false;
        } // Check if number is 2
        else if (n == 2) {
            return true;
        } // Check if n is a multiple of 2
        else if (n % 2 == 0) {
            return false;
        }

        // If not, then just check the odds
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void primeInArray(int[] arr) {
        System.out.print("prime number in array: ");
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
            }

        }
    }

    static int countPrime(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                count++;
            }
        }
        return count;
    }

    static boolean isComposite(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if(count > 2) {
            return true;
        } else {
            return false;
        }
    }

    static int countComposite(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isComposite(arr[i])) {
                count++;
            }
        }
        return count;
    }
}
