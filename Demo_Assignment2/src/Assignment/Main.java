/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment;

import java.util.Scanner;

/**
 *
 * @author PhiLe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IStore p = new Store();
        IOrderList o = new OrderList();
        Order od = new Order();
        Scanner in = new Scanner(System.in);
        do {
            showMenu();
            System.out.print("Select your choice: ");
            int option = Integer.parseInt(in.nextLine());
            switch (option){
                case 1:
                    String name = Common.InputString("Product name: ");
                    double price = Common.InputDouble("Price: ");
                    p.addProduct(new Product(p.generateProductID(), name, price));
                    break;
                case 2:
                    String id = Common.InputString("Product ID: ");
                    if (!p.checkProductId(id)){
                        double newPrice = Common.InputDouble("New price: ");
                        p.updatePrice(id, newPrice);
                    }else {
                        System.out.println("Product ID doesn't exist");
                    }
                    break;
                case 3:
                    p.show();
                    break;
                case 4:
                    o.addOrder((Store) p);
                    break;
                case 5:
//                    o.show();
                    String orderID = Common.InputString("Order ID: ");
                    if (!o.checkOrderId(orderID)) {
                        o.printByOrderId((Store) p, orderID);
                    }
                    break;
                case 6:
                    p.sortByPrice();
                    p.show();
                    break;
                case 7:
//                    o.show();
                    System.out.print("Customer ID: ");
                    String CusID = in.nextLine();
                    if (!o.checkCustomerId(CusID)){
                        o.printByCustomerId((Store) p, CusID);
                    }else {
                        System.out.println("Customer ID doesn't exist");
                    }
                    break;
                case 8:
//                    o.show();
                    String sID = Common.InputString("Specific ID Order: ");
                    o.print(sID);
                    break;
                case 0:
                    System.exit(0);
                    break;

            }
        }while(true);
         
    }
    
    static void showMenu() {
        System.out.println("*** ORDERS MANAGEMENT SYSTEM ***");
        System.out.println("1. Add new product");
        System.out.println("2. Update price for particular product");
        System.out.println("3. List of all available products");
        System.out.println("4. Create new Order");
        System.out.println("5. Print information of an Order by Order ID");
        System.out.println("6. Sort all products by product price as ascending ");
        System.out.println("7. Print information of all Orders by a specific customer ID");
        System.out.println("8. Export information of a specific Order ID to text file");
        System.out.println("0. Exit...");
    }
    
}
