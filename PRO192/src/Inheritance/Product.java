/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 * Đây là lóp cha, chứa những thành phần chung của Electric,Ceramic và Food Từ
 * khóa final, có nghĩa cuối cùng, chốt,k thể thay đổi. 
 * Có thể đặt truớc 1. khai báo class: thì lớp đó sẽ không được kế thừa 
 * 2. khai báo thuộc tính: thudc tính đó phải được khởi tạo 1 giá trị 
 * 3. khai báo phương thức
 *
 * @author PhiLe
 */
public class Product {

    private String code, name, make;
    private double price;
    final static double SALEOFF = 10;

    public Product() {

    }

   
    public Product(String code, String name, String make, double price) {
        this.code = code;
        this.name = name;
        this.make = make;
        this.price = price;

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return code + "\t" + name + "\t" + make + "\t" + price;
    }

}
