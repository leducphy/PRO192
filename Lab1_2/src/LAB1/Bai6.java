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
public class Bai6 {

    public static void main(String[] args) {
        int count1 = 0, count2 = 0, count3 = 0;

        for (int i = 0; i <= 100; i++) {
            //Divide by 7.
            if (i % 7 == 0) {
                count1++;
            }
            //Divide 7 with the remainder 2.
            if (i % 7 == 2) {
                count2++;
            }
            //The end digit is “7”.
            if (i % 10 == 7) {
                count3++;
            }
        }
        System.out.println("Divide by 7 has: " + count1 + " numbers");
        System.out.println("Divide 7 with the remainder 2 has: " + count2 + " numbers");
        System.out.println("The end digit is “7” has: " + count3 + " numbers");

    }
}
