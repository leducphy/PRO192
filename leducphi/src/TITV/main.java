
import com.sun.glass.ui.SystemClipboard;
import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        int d;
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        MyDate md = new MyDate(day, month, year);
        md.printDay();
        md.printMonth();
        md.printYear();
        md.printDate();

    }
}
