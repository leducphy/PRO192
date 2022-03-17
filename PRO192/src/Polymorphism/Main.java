/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

import JacaLanguage.Common;
import java.util.ArrayList;

/**
 *
 * @author PhiLe
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Teacher> list = new ArrayList<Teacher>();
        list.add(new FullTimeTeacher("T01", "Le Duc Phi", 3.0));
        list.add(new PartTimeTeacher("T02", "Ng Ngoc Huong", 11));

        //truyen list cho lop Manager xu ly
        IManager m = new Manager(list);
        while (true) {
            System.out.println("1. Input list Teacher");
            System.out.println("2. Show list Teacher");
            System.out.println("3. Show parttime have slot > 10");
            int option = Common.InputInt("Option: ");
            switch (option) {
                case 1:
                    int size = Common.InputInt("Nhập số giáo viên: ");
                    m.inputList(size);
                    break;
                case 2:
                    System.out.println("Danh sách giáo viên : ");
                    m.showList();
                    break;
                case 3:
                    System.out.println("Những giáo viên parttiem có slot > 10");
                    m.showParttime10();
                    break;
            }
        }
    }
}
