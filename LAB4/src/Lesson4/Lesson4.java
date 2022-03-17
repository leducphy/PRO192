/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson4;

import Menu.Common;

import java.util.ArrayList;

/**
 *
 * @author PhiLe
 */
public class Lesson4 {

    public static void main(String[] args) {
        ArrayList<HouseTrans> HT = new ArrayList<>();
        ArrayList<LandTrans> LT = new ArrayList<>();
        int LTn = 0, HTn = 0;
        while (true) {
            menu();
            int op = Common.InputInt("Your Option: ");
            switch (op) {
                case 1:
                    LTn = Common.InputInt("-->Number of Land Trans: ");
                    for (int i = 0; i < LTn; i++) {
                        System.out.println("Land Trans #" + (i + 1));
                        LandTrans LandTrans = new LandTrans();
                        LandTrans.inputLand();
                        LT.add(LandTrans);
                    }
                    break;
                case 2:
                    HTn = Common.InputInt("-->Number of House Trans: ");
                    for (int i = 0; i < HTn; i++) {
                        System.out.println("House Trans #" + (i + 1));
                        HouseTrans HouseTrans = new HouseTrans();
                        HouseTrans.inputHouse();
                        HT.add(HouseTrans);

                    }
                    break;
                case 3:
                    System.out.println(" House Transactions of September 2018. ");
                    for (int i = 0; i < HT.size(); i++) {
                        String[] dateHT = HT.get(i).getTransDate().split("/");
                        if (dateHT[1].equals("09") && dateHT[2].equals("2018")) {
                            System.out.println(HT.get(i));
                        }
                    }
                    System.out.println(" Land Transactions of September 2018. ");
                    for (int i = 0; i < LT.size(); i++) {
                        
                        String[] dateLT = LT.get(i).getTransDate().split("/");
                        if (dateLT[1].equals("09") && dateLT[2].equals("2018")) {
                            System.out.println(LT.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println("[Land] Total number: " + LTn);
                    System.out.println("[House] Total number: " + HTn);
                    break;
                case 5:
                    System.out.println("---Land Trand---");
                    for (int i = 0; i < LT.size(); i++) {
                        System.out.println(LT.get(i));
                    }

                    System.out.println("---House Land---");
                    for (int i = 0; i < HT.size(); i++) {
                        System.out.println(HT.get(i));
                    }
                    break;
                case 6:
                    System.out.println("************");
                    int sumMonLT = 0,
                     sumMonHT = 0;
                    for (int i = 0; i < LT.size(); i++) {
                        if (LT.get(i).getTypeLand().equalsIgnoreCase("A")) {
                            sumMonLT += LT.get(i).getArea() * LT.get(i).getUnitPrice() * 0.15;
                        } else if (LT.get(i).getTypeLand().equalsIgnoreCase("B") || LT.get(i).getTypeLand().equalsIgnoreCase("C")) {
                            sumMonLT += LT.get(i).getArea() * LT.get(i).getUnitPrice();
                        }
                    }

                    for (int i = 0; i < HT.size(); i++) {
                        if (HT.get(i).getTypeHouse().equalsIgnoreCase("pre")) {
                            sumMonHT += HT.get(i).getArea() * HT.get(i).getUnitPrice();
                        } else if (HT.get(i).getTypeHouse().equalsIgnoreCase("nor")) {
                            sumMonHT += HT.get(i).getArea() * HT.get(i).getUnitPrice() * 0.9;
                        }

                    }
                    
                    System.out.println("[Land] Average transaction amount: "+(sumMonLT/LT.size()));
                    System.out.println("[House] Average transaction amount: "+(sumMonHT/HT.size()));
                    break;
                case 0:
                    break;
                    
            }
        }
    }

    static void menu() {
        System.out.println("****Lands Management****");
        System.out.println("1. Input Land Trans");
        System.out.println("2. Input House Trans");
        System.out.println("3. Export transactions of September 2018.");
        System.out.println("4. Calculate the total quantity for each type.");
        System.out.println("5. Export all Trans");
        System.out.println("6. Calculate the average of money of land transactions.");
        System.out.println("0. Exit");
    }

}
