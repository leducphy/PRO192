/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;

/**
 *
 * @author PhiLe
 */
public class Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Order> OD = new ArrayList<>();
        ArrayList<Product> PR = new ArrayList<>();
        IManager m = new Manager(OD, PR);
        while (true) {
            showMenu();
            int option = Common.InputInt("Your option: ");
            switch (option) {
                case 1:
                    m.AddProduct();
//                    m.show();
                    break;
                case 2:
                    System.out.println("[UPDATE]");
                    m.updateProduct();
//                    m.show();
                    break;
                case 3:
                    System.out.println("[PRODUCT]");
                    m.show();
                    break;
                case 4:
                    int size2 = Common.InputInt("[O] Size: ");
                    m.AddOrder(size2);
//                    m.showID();
                    break;
                case 5:
                    m.OrderID();
                    break;
                case 6:
                    m.sortOD();
                    m.showID();
                    break;
                case 7:
                    m.SpecificID();
                    break;
                case 8:

                    break;
                case 0:
                    System.exit(0);
                    break;
            }
        }
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
