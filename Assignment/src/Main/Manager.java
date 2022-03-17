/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author PhiLe
 */
public class Manager implements IManager {

    ArrayList<Order> OD;
    ArrayList<Product> PR;

    Manager(ArrayList<Order> OD, ArrayList<Product> PR) {
        this.OD = OD;
        this.PR = PR;
    }

    @Override
    public void AddProduct() {
        int size = Common.InputInt("[P] Size: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Product #" + (i + 1) + " ");
            Product pro = new Product();
            pro.inputProduct();
            PR.add(pro);
        }
    }

    @Override
    public void show() {
        for (Product item : PR){
            item.showProduct();
        }
    }

    @Override
    public void updateProduct() {
        String up = Common.InputString("Product ID: ");
        for (Product item : PR){
            if (up.equalsIgnoreCase(item.getId())){
                double tmpPrice = Common.InputDouble("New price: ");
                item.setPrice(tmpPrice);
            }
        }
    }

    @Override
    public void AddOrder(int size2) {
        for (int i = 0; i < size2; i++) {
            System.out.println("Order #" + (i + 1) + " ");
            Order order = new Order();
            order.inputOrder();
            OD.add(order);
        }
    }


    @Override
    public void OrderID() {
        String oid = Common.InputString("Order ID: ");
        for (Order item : OD){
            if (oid.equalsIgnoreCase(item.getId())){
                item.showOrder();
                break;
            }
        }
    }

    @Override
    public void showID() {
        for (Order item : OD){
            item.showOrder();
        }
    }

    @Override
    public void sortOD() {
        Collections.sort(PR, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                if (o1.getPrice() > o2.getPrice()) {
                    return 1;
                } else if (o1.getPrice() < o2.getPrice()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
    }

    @Override
    public void SpecificID() {

    }

}
