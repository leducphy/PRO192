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
public interface IOrderList {
    public boolean checkCustomerID(String id);
    public String generateCustomerID();
    public boolean checkCustomerId(String id);
    public boolean checkOrderId(String id);
    public String getDate();
    public void addOrder(Store p);
    public void printByCustomerId(Store p, String id);
    public void printByOrderId(Store p, String id);
    public void print(String sID);
    public void show();
}
