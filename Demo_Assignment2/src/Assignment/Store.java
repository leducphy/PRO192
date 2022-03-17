/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author PhiLe
 */
public class Store implements IStore {

    List<Product> l = new ArrayList<>();

    public Store() {
    }
    
    
    @Override
    public void addProduct(Product p) {
        l.add(p);
        System.out.println("Add a product success!");
    }

    @Override
    public boolean checkProductId(String id) {
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).getId().equalsIgnoreCase(id)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String generateProductID() {
        String ID;
        String tmp = "MNBVCXZLKJHGFDSAPOIUYTREWQ0987654321";
        do {            
            Random r = new Random();
            ID = "";
            for (int i = 0; i < 3; i++) {
                int k = r.nextInt(tmp.length());
                ID += tmp.charAt(k);
            }
            if (checkProductId(ID)) {
                return ID;
            }
        } while (true);
    }

    @Override
    public void updatePrice(String productId, double newPrice) {
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).getId().equalsIgnoreCase(productId)) {
                l.get(i).setPrice(newPrice);
                System.out.println("Done!");
                return ;
            }
        }
    }

    @Override
    public void sortByPrice() {
        Collections.sort(l);
    }

    @Override
    public void show() {
        System.out.printf("%-15s%-15s%-15s\n", "Product ID", "Product Name", "Product Price");
        for (int i = 0; i < l.size(); i++) {
            l.get(i).showProduct();
        }
    }

    @Override
    public String getProductName(String productId) {
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).getId().equalsIgnoreCase(productId)) {
                return l.get(i).getName();
            }
        }
        return null;
    }

    @Override
    public double getProductPrice(String productId) {
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).getId().equalsIgnoreCase(productId)) {
                return l.get(i).getPrice();
            }
        }
        return 0;
    }

}
