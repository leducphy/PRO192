/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

import JacaLanguage.Common;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author PhiLe
 */
public class Main {

    public static void main(String[] args) throws ParseException {
//        Ceramic C = new Ceramic("C01", "bat duabat trang1", "bat trang", "hehe", 10);
//        System.out.println(C);
//
//        Date date = Common.InputDate("Date", "dd/MM/yyyy");
//        Date exDate = Common.InputDate("Ex date ", "dd/MM/yyyu");
//        Food F = new Food("F01", "KFC", "VietNam", 10, date, exDate);
//        System.out.println(F);
        //Practise:
        //Tạo 1 danh sách Food
        //Tạo menu và thực hiện các chức năng sau:
        //1.Add 1 Food vào dánh sách
        //2. Show danh sách
        //3.Search by name
        //4. Delete by make
        ArrayList<Food> F1 = new ArrayList<>();
        while (true) {
            int op = Common.InputInt("chon: ");
            switch (op) {
                case 1:
                    int n = Common.InputInt("number of food: ");

                    for (int i = 0; i < n; i++) {
                        Food f = new Food();
                        f.inputFood();
                        F1.add(f);
                    }
                    break;
                case 2:
                    System.out.println("List: ");
                    for (int i = 0; i < F1.size(); i++) {
                        System.out.println(F1.get(i));
                    }
                    break;
                case 3:
                    String sName = Common.InputString("Search name: ");
                    for (Food item : F1) {
                        if(item.getName().equalsIgnoreCase(sName)){
                            System.out.println(item);
                        }
                    }
                    break;
                case 4: 
                    

            }
        }
    }

}
