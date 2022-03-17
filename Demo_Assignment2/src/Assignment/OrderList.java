/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PhiLe
 */
public class OrderList implements IOrderList {

    String CusID;
    List<Order> OD = new ArrayList<>();
    Order o = new Order();
    File file = new File("C:\\Users\\leduc\\Desktop\\JavaPRO192\\Demo_Assignment2\\src\\Assignment\\FileOrder.txt");
    Scanner in = new Scanner(System.in);
    @Override
    public boolean checkCustomerID(String id) {
        for (int i = 0; i < OD.size(); i++) {
            if (OD.get(i).getCusID().equalsIgnoreCase(id)) {
                return false;
            }
        }
        return true;
    }

    //genrate Cus Id by system
    @Override
    public String generateCustomerID() {
        String ID;
        String tmp = "MNBVCXZLKJHGFDSAPOIUYTREWQ0987654321";
        do {
            Random r = new Random();
            ID = "";
            for (int i = 0; i < 3; i++) {
                int k = r.nextInt(tmp.length());
                ID += tmp.charAt(k);
            }
            if (checkCustomerID(ID)) {
                return ID;
            }
        } while (true);
    }

    @Override
    public boolean checkCustomerId(String id) {
        if (o.checkCusID(id)) {
            return true;
        }
        return false;
    }

    @Override
    public boolean checkOrderId(String id) {
        return o.checkOrderID(id);
    }

    @Override
    public String getDate() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.now();
        return f.format(localDate);
    }

    @Override
    public void addOrder(Store p) {
        CusID = generateCustomerID();
        System.out.println("Customer ID: " + CusID);
        String date = getDate();
        System.out.println("Order date: " + date);
        String name = Common.InputString("Customer name: ");
        String address = Common.InputString("Customer address: ");
        p.show();
        o.addPro(p, CusID, name, address,getDate());
        char n;
        do {
            System.out.print("Add more product(y/n): ");
            n = in.nextLine().charAt(0);
            if (n == 'y') {
                o.addPro(p, CusID, name, address, date);
            } else if (n == 'n') {
                break;
            } else {
                System.out.println("Invalid input. Try Again !");
            }
        } while (true);
    }

    @Override
    public void printByCustomerId(Store p, String id) {
//        o.showOrder();
        o.showByCusID(id);
    }

    @Override
    public void printByOrderId(Store p, String id) {
//        o.showOrder();
        o.showByOrderID(id);
    }

    @Override
    public void print(String sID) {
        try (FileOutputStream fop = new FileOutputStream(file)) {
            // if file doesn't exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            byte[] content = o.saveTxt(sID).getBytes();

            fop.write(content);
            fop.flush();
            fop.close();
        } catch (Exception e) {
        }
    }
    public void show(){
        o.showOrder();
    }

}
