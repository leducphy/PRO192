/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import JacaLanguage.Common;

/**
 *
 * @author PhiLe
 */
public class Main {
    public static void main(String[] args) {
        
        ICaculation C = new Caculation();
        int n = Common.InputInt("Nhap so : ");
        System.out.println(C.countDigit(n));;
        
        
        String str = Common.InputString("Nhap chuoi: ");
        System.out.println(C.coutWord(str));
        
        IConvert i = new IConvert() {
            @Override
            public String toBinary(int n) {
                return "";
            }
        };
        
    }
}
