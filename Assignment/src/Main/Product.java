/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author PhiLe
 */
public class Product {

    private String name, id;
    private double price;

    public Product() {
    }

    public Product(String name, String id, double price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + "\t" + id + "\t" + price ;
    }
    
    public void inputProduct(){
        setName(Common.InputString("Product name: "));
        setId(Common.InputString("Product ID: "));
        setPrice(Common.InputDouble("Product price: "));
    }
    public void showProduct(){
        System.out.println(this.name+ "\t" + this.id + "\t" + this.price);
    }
    
    
}
