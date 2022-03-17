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
public class OrderInfo {
    private String OrderID, CusID, CusName, ProductID, ProductName, CusAdd;
    private String date;
    private int quantity;
    private double price;

    public OrderInfo() {
    }

    public OrderInfo(String OrderID, String CusID, String CusName, String ProductID, String ProductName, String CusAdd, String date, int quantity, double price) {
        this.OrderID = OrderID;
        this.CusID = CusID;
        this.CusName = CusName;
        this.ProductID = ProductID;
        this.ProductName = ProductName;
        this.CusAdd = CusAdd;
        this.date = date;
        this.quantity = quantity;
        this.price = price;
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

    public String getCusName() {
        return CusName;
    }

    public void setCusName(String CusName) {
        this.CusName = CusName;
    }

    public String getProductID() {
        return ProductID;
    }

    public void setProductID(String ProductID) {
        this.ProductID = ProductID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getCusAdd() {
        return CusAdd;
    }

    public void setCusAdd(String CusAdd) {
        this.CusAdd = CusAdd;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
