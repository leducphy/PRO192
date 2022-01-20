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
public class Bai8 {

    public static void main(String[] args) {
        int n = 12;
        primeFactorization(n);
        System.out.println("\n");
    }

    static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    static void primeFactorization(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrimeNumber(i) && (n % i == 0)) {
                System.out.print(i + " ");
            }
        }
    }
}
