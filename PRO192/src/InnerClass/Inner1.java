/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InnerClass;

/**
 * đây là loai inner1 : 1 class sẽ nằm trong 1 class
 *
 * @author PhiLe
 */
public class Inner1 {

    int x = 10;

    public void show() {
        System.out.println("x = " + x);
    }

    class A {

        int x = 5;

        public void show() {
            System.out.println("x = " + x);
        }
    }

    public static void main(String[] args) {
        Inner1 i = new Inner1();
        A a = i.new A();
//        A a = (new Inner1()).new A();
        
        a.show();
        i.show();
    }
}
