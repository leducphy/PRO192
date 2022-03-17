/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaOOP;

import JacaLanguage.Common;
import JacaLanguage.Teacher;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author PhiLe
 */
//import JacaLanguage.Teacher;
public class Main {

    public static void main112(String[] args) throws IOException {
        Student SV1 = new Student();

        SV1.input();
        Student SV2 = new Student();
        SV2.input();
        SV1.show(1);
        SV2.show(1);

    }

    /**
     * For Teacher
     *
     * @param args
     */
    public static void main1(String[] args) {
        Teacher TC1 = new Teacher();
        //Set thông tin cho sinh viên SV1
        TC1.setCode(1);
        TC1.setName("Nguyen Van A");
        TC1.setGender("Female");
        TC1.setSlot(6);
        //Hiển thị thông tin của Tci
        System.out.println("Code:" + TC1.getCode());
        System.out.println("Name: " + TC1.getName());
        System.out.println("Gender:" + TC1.getGender());
        System.out.println("Math:" + TC1.getSlot());
    }

    public static void main1111(String[] args) throws IOException {
        ArrayList<Student> list = new ArrayList<Student>();

        list.add(new Student(1, "Le Duc Phi", "Male", 7, 8));
        list.add(new Student(2, "Nguyen Duc Anh", "Fe", 4, 5));
        while (true) {
            System.out.println("1. input list student");
            System.out.println("2. show list student");
            System.out.println("3. search by code/name");
            System.out.println("4. sort by code/litter, asc/desc");
            System.out.println("5. delete by code");
            System.out.println("6. exit");

            int op = Common.InputInt("Your Choice: ");

            switch (op) {
                case 1:
                    int size = Common.InputInt("Enter sze: ");
                    inputList(list, size);

                    break;
                case 2:
                    System.out.println("List Student: ");
                    showList(list);
                    break;
                case 3:

                    searchStudetCode(list);
                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    System.exit(0);

            }
        }

    }

    private static void showList(ArrayList<Student> list) {
        for (Student item : list) {
            item.show(0);
        }
    }

    private static void inputList(ArrayList<Student> list, int size) throws IOException {
        for (int i = 0; i < size; i++) {
            System.out.println("input SV " + i + ": ");
            Student SV = new Student();
            SV.input();
            list.add(SV);
        }
    }

    private static void searchStudetCode(ArrayList<Student> list) {

        int opt = Common.InputInt("1. code \n 2.name");
        switch (opt) {
            case 1:
                int code = Common.InputInt("Search by code: ");
                for (Student item : list) {
                    if (item.getCode() == code) {
                        item.show(1);
                    }
                }
                break;
            case 2:
                String namee = Common.InputString("Search by name: ");
                for (Student item : list) {
                    if (item.getName() == namee) {
                        item.show(1);
                    }
                }
                break;
        }
    }

    public static void main(String[] args) {
        Fraction F1 = new Fraction(10, 12);
        Fraction F2 = new Fraction(6, 4);

        System.out.println(F1.toigian());
        System.out.println(F2.toigian() );
        System.out.println("F1+F2=" + F1.cong( F2));
        System.out.println("F1-F2=" + F1.tru( F2));

        System.out.println("F1*F2=" + F1.nhan( F2));

        System.out.println("F1/F2=" + F1.chia( F2));

    }
}
