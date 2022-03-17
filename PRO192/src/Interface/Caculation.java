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
public class Caculation implements ICaculation, IConvert {

    @Override
    public int countDigit(int n) {       
        int cout = 0;
        while (n > 0) {            
            cout++;
            n/=10;
        }
        return cout;
    }

    @Override
    public int coutWord(String str) {
        int cout = 0;
        String[] s = str.trim().split(" ");
        for (String item : s) {
            if(!item.trim().isEmpty()) cout++;
        }
        return cout;
    }

    @Override
    public String toBinary(int n) {
        return "";
    }
    
}
