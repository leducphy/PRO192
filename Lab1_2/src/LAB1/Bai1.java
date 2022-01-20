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
public class Bai1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /**
         * Print to the screen composite numbers <100. (Composite number is natural numbers greater than 1 and must be divisible by a number
         * > 1 and itself.)
         */
        int count = 0;

        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count > 2) {
                System.out.print(i + " ");
            }
            count = 0;
        }

    }
}
