package Assignment;



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {

    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public static int InputInt(String message) {
        int m;

        while (true) {
            try {
                System.out.print(message);
                m = Integer.parseInt(in.readLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid input, try again!");
            }
        }
        return m;
    }
    
    public static double InputDouble(String message) {
        double n;

        while (true) {
            try {
                System.out.print(message);
                n = Double.parseDouble(in.readLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid input, try again!");
            }
        }
        return n;
    }

    // Double Function
    public static String InputString(String message2) {
        String k;
        
        while (true) {
            try {
                System.out.print(message2);
                k = in.readLine();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input, try again!");
            }
        }
        return k;
        
    }

    public static Date InputDate(String message2, String pattern) {
        Date k;
        SimpleDateFormat f = new SimpleDateFormat(pattern);
        while (true) {
            try {
                System.out.print(message2);
                k = f.parse(in.readLine());
                break;
            } catch (Exception e) {
                System.out.println("Invalid input, try again! ");
            }
        }
        return k;
    }

    public static char InputChar(String message) {
        char c;
        while (true) {
            try {
                System.out.print(message);
                c = (char)in.read();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input, try again!");
            }
        }
        return c;
    }
    
    
}