/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InnerClass;

/**
 * đây là inner3 : 1 class nằm trong câu lệnh của 1 class khác
 *
 * @author PhiLe
 */
public class Inner3 {

    public static void main(String[] args) {
        Animal a = new Animal() {
            @Override
            public void eat() {
                System.out.println("eatttt");
            }

            @Override
            public void sleep() {
                System.out.println("sleep");
            }
        };
        a.go();
        a.eat();
        a.sleep();
    }
}

//abtract class là 1 lớp mà có ít nhất 1 method abstract
//
abstract class Animal {

    public void go() {
        System.out.println("Goooooooo");
    }
    public abstract void eat();
    public abstract void sleep();
}
