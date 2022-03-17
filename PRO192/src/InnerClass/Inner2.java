/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InnerClass;

/**
 * đây là inner2 : 1 class sẽ nằm trong class của 1 lớp khác
 *
 * @author PhiLe
 */
public class Inner2 {

    int x = 10;

    public void show() {
        System.out.println("x = " + x);
    }

    public Inner2() {
        // tạo 1 class nằm trong phương thức này
        class A {

            int x = 5;

            public void show() {
                System.out.println("x = " + x);
            }
        }
        A a= new A();
        a.show();
    }

    
    public static void main(String[] args) {
        Inner2 i = new Inner2();
        i.show();
    }
}
