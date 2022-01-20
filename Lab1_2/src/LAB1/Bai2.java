/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB1;

/**
 *
 * @author PhiLe
 */
public class Bai2 {

    public static void main(String[] args) {
        int n = 120;
        System.out.print("15 second prime numbers : ");
        for (int g = 50; g <= n; g++) {
            if (isPrime(g)) {
                System.out.print(g + " ");
            }
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
}
