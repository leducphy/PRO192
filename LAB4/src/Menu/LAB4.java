/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;

/**
 *
 * @author PhiLe
 */
public class LAB4 {

    public static void main(String[] args) {
        while (true) {
            int op = Common.InputInt("*[LAB 4]Chọn bài : ");
            switch (op) {
                case 1:
                    Lesson1.Lesson1.main(args);
                    break;
                case 2:
                    Lesson2.Lesson2.main(args);
                    break;
                case 3:
                    Lesson3.Lesson3.main(args);
                    break;
                case 4:
                    Lesson4.Lesson4.main(args);
                    break;
                case 5:
                    Lesson5.Lesson5.main(args);
                    break;
                case 0:
                    System.exit(0);

            }
        }

    }
}
