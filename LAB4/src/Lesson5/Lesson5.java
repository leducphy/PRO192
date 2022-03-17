/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson5;

import Menu.Common;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author PhiLe
 */
public class Lesson5 {

    public static void main(String[] args) {
        ArrayList<VNCus> VNC = new ArrayList<>();
        ArrayList<FCus> FC = new ArrayList<>();
        int VNCn = 0, FCn = 0;
//        Date date = new Date(); 
        while (true) {
            menu();
            int option = Common.InputInt("Your Option: ");
            switch (option) {
                case 1:
                    VNCn = Common.InputInt("number of VN customer: ");
                    for (int i = 0; i < VNCn; i++) {
                        System.out.println("Vietnamese Customer#" + (i + 1));
                        VNCus VietNam = new VNCus();
                        VietNam.inputVNCus();
                        VNC.add(VietNam);
                    }
                    break;
                case 2:
                    FCn = Common.InputInt("number of foreign customer: ");
                    for (int i = 0; i < FCn; i++) {
                        System.out.println("Foreign Customer#" + (i + 1));
                        FCus F = new FCus();
                        F.inputFCus();
                        FC.add(F);
                    }
                    break;
                case 3:
                    System.out.println("[Vietnam] number of customers: " + VNC.size());
                    System.out.println("[Foreign] number of customers: " + FC.size());
                    break;
                case 4:
                    int sum1 = 0,
                     sum2 = 0;
                    for (int i = 0; i < VNC.size(); i++) {
                        if (VNC.get(i).getQuantity() <= VNC.get(i).getQuota()) {
                            sum1 += VNC.get(i).getQuantity() * VNC.get(i).getUnitPrive();

                        } else {
                            sum1 += VNC.get(i).getQuantity() * VNC.get(i).getUnitPrive() + (VNC.get(i).getQuantity() - VNC.get(i).getQuota()) * VNC.get(i).getUnitPrive() * 2.5;
                        }
                    }

                    for (int i = 0; i < FC.size(); i++) {
                        sum2 += FC.get(i).getQuantity() * FC.get(i).getUnitPrive();
                    }

                    System.out.println("[Vietnam] Average: " + (sum1 / VNC.size()));
                    System.out.println("[Foreign] Average: " + (sum2 / FC.size()));
                    break;
                case 5:
                    System.out.println(" Export invoices in September 2018: ");
                    System.out.println("[VietNam]");
                    for (int i = 0; i < VNC.size(); i++) {
                        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                        Date date = VNC.get(i).getDateInvoice();
                        String strDate = df.format(date);  
                        String[] dateVN = strDate.split("/");
                        if (dateVN[1].equals("09") && dateVN[2].equals("2018")) {
                            System.out.println(VNC.get(i));
                        }
                    }
                    
                    System.out.println("[Foreign]");
                    for (int i = 0; i < VNC.size(); i++) {
                        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                        Date date = FC.get(i).getDateInvoice();
                        String strDate = df.format(date);  
                        String[] dateF = strDate.split("/");
                        if (dateF[1].equals("09") && dateF[2].equals("2018")) {
                            System.out.println(FC.get(i));
                        }
                    }
                    break;
                case 6:
                    System.out.println("VietNam");
                    for (int i = 0; i < VNC.size(); i++) {
                        System.out.println(VNC.get(i));
                    }
                    System.out.println("Foreign");
                    for (int i = 0; i < FC.size(); i++) {
                        System.out.println(FC.get(i));
                    }
                    break;
                case 0:
                    Menu.LAB4.main(args);
            }
        }

    }

    static void menu() {
        System.out.println("******manage customers' electricity bill*****");
        System.out.println("1. input vietnameses customers");
        System.out.println("2. input foreign customers");
        System.out.println("3. calculate the total quantity for each type of customer.");
        System.out.println("4. calculate the average of money of foreign customers.");
        System.out.println("5. export invoices in September 2018");
        System.out.println("6. display");
        System.out.println("0. exit");
    }
}
