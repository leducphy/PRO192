/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

/**
 *
 * @author PhiLe
 */
public class Product implements Comparable<Product> {

    private String id;
    private String name;
    private double price;

    public Product() {
    }

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        if (this.price < o.price) {
            return -1;
        }else if (this.price>o.price) {
            return 1;
        }else {
            return 0;
        }
    }
    
    public void showProduct(){
        System.out.printf("%-15s%-15s%-15.2f\n", getId(), getName(), getPrice());
    }

}
