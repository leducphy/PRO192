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
public class Manager implements IManager {

    ArrayList<Teacher> list;

    Manager(ArrayList<Teacher> list) {
        this.list = list;
    }

    @Override
    public void inputList(int size) {
        try {
            for (int i = 0; i < size; i++) {
                System.out.println("Input teacher" + i + ": ");
                System.out.println("Enter Code: ");
                String code = Common.in.readLine();
                System.out.println("Enter Name: ");
                String name = Common.in.readLine();
                int hoi = Common.InputInt("Type: 1-Full, 2-Part");
                if (hoi == 1) {
                    double heso = Common.InputDouble("Nhap he so : ");
                    Teacher T = new FullTimeTeacher(code, name, heso);
                    list.add(T);
                } else {
                    int slot = Common.InputInt("Nhap so slot: ");
                    Teacher T = new PartTimeTeacher(code, name, slot);
                    list.add(T);
                }
            }
        } catch (Exception e) {
            System.out.println("lỗi nhập liệu:" + e.getMessage());
        }
    }

    @Override
    public void showList() {
        for (Teacher item : list) {
            System.out.println(item);
        }
    }

    @Override
    public void showParttime10() {
        for (Teacher item : list) {
            if (item instanceof PartTimeTeacher && ((PartTimeTeacher) item).getSlot() > 10) {
                System.out.println(item);
            }
        }
    }

}
