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
public class Bai5 {

    public static void main(String[] args) {

        int count = 0;
        long n = Long.MAX_VALUE;
        for (long i = 1; i < n; i++) {
            long sum = 0;
            long j = 1;
            while (j <= i / 2) {
                if (i % j == 0) {
                    sum += j;
                }
                j++;

            }
            if (sum == i) {
                System.out.println(i);
                count++;
            }
            if (count==4) {
                break;
            }
        }
        
    }
    
}
