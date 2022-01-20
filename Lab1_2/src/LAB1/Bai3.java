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
public class Bai3 {

    public static void main(String[] args) {
        for (int i = 1000; i <= 2000; i++) {
            int count = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    count = count + 1;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
        
    }
}
