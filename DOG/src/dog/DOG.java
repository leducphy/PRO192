/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dog;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PhiLe
 */
public class DOG {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // TODO code application logic here
        ArrayList<Intro> dogs = new ArrayList<>();

        while (true) {
            displayMenu();
            System.out.print("Your option: ");
            int option = Integer.parseInt(sc.nextLine());
            if (option == 1) {
                Intro d = inputIntro();
                dogs.add(d);
            } else if (option == 2) {
                for (int i = 0; i < dogs.size(); i++) {
                    System.out.println(dogs.get(i));
                }
            } else if (option == 3) {
                System.out.print("Input number: ");
                int chooseOne = Integer.parseInt(sc.nextLine());
                System.out.println("Dog No." + chooseOne + "\n" + dogs.get(chooseOne));
            } else if (option == 4) {
                System.out.print("Input number: ");
                int chooseOne = Integer.parseInt(sc.nextLine());
                dogs.remove(chooseOne);
            } else {
                System.exit(0);
            }
           
        }

    }

    static Intro inputIntro() {
        Scanner sc = new Scanner(System.in);
        Intro dog = new Intro();
        System.out.print("Enter Name: ");
        dog.setName(sc.nextLine());
        System.out.print("Enter Age: ");
        dog.setAge(Integer.parseInt(sc.nextLine()));
        System.out.print("Enter Color: ");
        dog.setColor(sc.nextLine());
        return dog;
    }

    static void displayMenu() {
        System.out.println("======dog management ==== ");
        System.out.println("1. add new Dog");
        System.out.println("2. display dogs");
        System.out.println("3. display a dog");
        System.out.println("4. delete dog");
        System.out.println("5. exit");
    }

}
