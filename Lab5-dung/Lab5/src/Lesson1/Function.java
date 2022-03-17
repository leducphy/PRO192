/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PhiLe
 */
public class Function {

    public ArrayList<billHour> arrBillHour = new ArrayList<>();
    public ArrayList<billDaily> arrBilDaily = new ArrayList<>();

    public Function() {
    }

    public Function(ArrayList<billHour> arrBillHour, ArrayList<billDaily> arrBilDaily) {
        this.arrBilDaily = arrBilDaily;
        this.arrBillHour = arrBillHour;
    }
    Scanner sc = new Scanner(System.in);

    public void Input1(int numberOfBillHour, int numberOfBillDaily) {
        for (int i = 0; i < numberOfBillHour; i++) {
            System.out.println("Nhap hoa don theo gio thu " + (i + 1) + ": ");
            billHour bh = new billHour();
            bh.Input();
            arrBillHour.add(bh);
        }
        for (int i = 0; i < numberOfBillDaily; i++) {
            System.out.println("Nhap hoa don theo ngay thu " + (i + 1) + " : ");
            billDaily bd = new billDaily();
            bd.Input();
            arrBilDaily.add(bd);
        }
    }

    public void Total() {
        float sumOfHour = 0, sumOfDaily = 0;
        for (billHour item : arrBillHour) {
            sumOfHour += item.getBillHour();
        }
        for (billDaily item : arrBilDaily) {
            sumOfDaily += item.getBillDaily();
        }

        System.out.println("Tong so tien phong thue theo gio la : " + sumOfHour);
        System.out.println("Tong so tien phong thue theo ngay la : " + sumOfDaily);

    }

    public void Average() {
        float sumHour2018 = 0, sumDaily2018 = 0, averageBill = 0;
        int count1 = 0;
        for (billDaily item : arrBilDaily) {
            count1++;
            if (item.getInvoice().getYear() == 118 && item.getInvoice().getMonth() == 8) {
                sumDaily2018 += item.getBillDaily();
            }

        }
        int count2 = 0;
        for (billHour item : arrBillHour) {
            count2++;
            if (item.getInvoice().getYear() == 118 && item.getInvoice().getMonth() == 8) {
                sumHour2018 += item.getBillHour();

            }
        }
        averageBill = (sumDaily2018 + sumHour2018) / (count1 + count2);
        System.out.println("Tong tien trung binh la: " + averageBill);

    }

}
