
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author PhiLe
 */
public class PreMax {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = {1,2,4,3};

        int max = arr[0];
        int preMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                preMax = max;
                max = arr[i];
            }
            
            if (arr[i]> preMax && arr[i]<max) {
                preMax = arr[i];
            }
        }
        System.out.println(preMax);
    }
}
