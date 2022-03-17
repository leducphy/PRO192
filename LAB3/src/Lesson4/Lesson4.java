/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson4;

import Menu.Common;

/**
 *
 * @author PhiLe
 */
public class Lesson4 {

    static HangThucPham HTP = new HangThucPham();

    public static void main(String[] args) {

        do {
            HTP.code = Common.InputString("Enter code: ");
        } while (HTP.CheckC(true));

        do {
            HTP.name = Common.InputString("ProductName: ");
        } while (HTP.CheckN(true));

        HTP.price = Common.InputDouble("Enter price: ");

        do {
            System.out.println("--Ngay san xuat: ");
            HTP.NSX(Common.InputInt("Year: "), Common.InputInt("Month: "), Common.InputInt("Day: "));

            System.out.println("--Ngay het han: ");
            HTP.HSD(Common.InputInt("Year: "), Common.InputInt("Month: "), Common.InputInt("Day: "));
        } while (HTP.CheckPE(true));

        System.out.println(HTP);
        HTP.checkHSD();

        

    }
}
