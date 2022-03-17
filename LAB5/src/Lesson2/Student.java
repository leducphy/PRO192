        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson2;

/**
 *
 * @author PhiLe
 */
public class Student extends Person{
    private int point1;
    private int point2;

    public Student() {
        super();
    }

    public Student(int point1, int point2, String Name, String Address) {
        super(Name, Address);
        this.point1 = point1;
        this.point2 = point2;
    }

    public int getPoint1() {
        return point1;
    }

    public void setPoint1(int point1) {
        this.point1 = point1;
    }

    public int getPoint2() {
        return point2;
    }

    public void setPoint2(int point2) {
        this.point2 = point2;
    }
    
    public void caculate(){
        
    }

    @Override
    public String toString() {
        return super.toString() + "\tPoint 1: " + point1 + "\tPoint 2: " + point2;
    }
    
    
    
    
}
