/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PhiLe
 */
public class Order {

    private String OrderID, CusID;
    List<OrderInfo> l = new ArrayList<>();
    Scanner in = new Scanner(System.in);

    public Order() {
    }

    public Order(String OrderID, String CusID) {
        this.OrderID = OrderID;
        this.CusID = CusID;
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String OrderID) {
        this.OrderID = OrderID;
    }

    public String getCusID() {
        return CusID;
    }

    public void setCusID(String CusID) {
        this.CusID = CusID;
    }

    //check OrderID
    public boolean checkOrderID(String id) {
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).getOrderID().equalsIgnoreCase(id)) {
                return false;
            }
        }
        return true;
    }

    //check Customer ID
    public boolean checkCusID(String id) {
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).getCusID().equalsIgnoreCase(id)) {
                return false;
            }
        }
        return true;
    }

    //Generate Order ID by System
    public String AutoGenID() {
        String ID;
        String tmp = "MNBVCXZLKJHGFDSAPOIUYTREWQ0987654321";
        do {
            Random r = new Random();
            ID = "";
            for (int i = 0; i < 3; i++) {
                int k = r.nextInt(tmp.length());
                ID += tmp.charAt(k);
            }
            if (checkOrderID(ID)) {
                return ID;
            }
        } while (true);
    }

    //add new product to order
    public void addPro(Store p, String CusID, String CusName, String CusAdd, String date) {
        System.out.print("Enter product id: ");
        String id = in.nextLine();
        if (!p.checkProductId(id)) {
            System.out.print("Enter quantity: ");
            int quantity = Integer.parseInt(in.nextLine());
            l.add(new OrderInfo(AutoGenID(), CusID, CusName, id, p.getProductName(id), CusAdd, date, quantity, quantity * p.getProductPrice(id)));
        } else {
            System.out.println("Product ID doesn't exist! ");
        }
    }

    //show all order
    public void showOrder() {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", "Customer ID", "Order ID", "Name Customer", "Product ID", "Product Name", "Date", "Address", "Quantity", "Price");
        for (int i = 0; i < l.size(); i++) {
            System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15d%-15.2f\n", l.get(i).getCusID(), l.get(i).getOrderID(), l.get(i).getCusName(), l.get(i).getProductID(), l.get(i).getProductName(), l.get(i).getDate(), l.get(i).getCusAdd(), l.get(i).getQuantity(), l.get(i).getPrice());
        }
    }

    public String saveTxt(String sID) {
        String li = String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", "Customer ID", "Order ID", "Name Customer", "Product ID", "Product Name", "Date", "Address", "Quantity", "Price");
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).getOrderID().equalsIgnoreCase(sID)){
                return li + String.format("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15d%-15.2f\n", l.get(i).getCusID(), l.get(i).getOrderID(), l.get(i).getCusName(), l.get(i).getProductID(), l.get(i).getProductName(), l.get(i).getDate(), l.get(i).getCusAdd(), l.get(i).getQuantity(), l.get(i).getPrice());
            }
        }
        return null;
    }

    //show Order by Customer
    public void showByCusID(String CusID) {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", "Customer ID", "Order ID", "Name Customer", "Product ID", "Product Name", "Date", "Address", "Quantity", "Price");
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).getCusID().equalsIgnoreCase(CusID)) {
                System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15d%-15.2f\n", l.get(i).getCusID(), l.get(i).getOrderID(), l.get(i).getCusName(), l.get(i).getProductID(), l.get(i).getProductName(), l.get(i).getDate(), l.get(i).getCusAdd(), l.get(i).getQuantity(), l.get(i).getPrice());
            }
        }
    }

    //show Order by Order ID
    public void showByOrderID(String id) {
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n", "Customer ID", "Order ID", "Name Customer", "Product ID", "Product Name", "Date", "Address", "Quantity", "Price");
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).getOrderID().equalsIgnoreCase(id)) {
                System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15d%-15.2f\n", l.get(i).getCusID(), l.get(i).getOrderID(), l.get(i).getCusName(), l.get(i).getProductID(), l.get(i).getProductName(), l.get(i).getDate(), l.get(i).getCusAdd(), l.get(i).getQuantity(), l.get(i).getPrice());
            }
        }
    }
}
