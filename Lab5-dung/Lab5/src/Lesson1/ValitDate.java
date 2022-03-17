/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author PhiLe
 */
public class ValitDate {
      Scanner sc = new Scanner(System.in);

    Date CheckDate(String Mess, String format) {
        // parse 1 String -> Date
        SimpleDateFormat SDF = new SimpleDateFormat(format);
        // If you enter the wrong date like 30/02, it will be reported wrong and must be re-entered
        SDF.setLenient(false);
        Date ret;
        do {
            System.out.print("\n" + Mess);
            try {
                ret = SDF.parse(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid date input, please try again!");
            }
        } while (true);
        return ret;
    }
}
