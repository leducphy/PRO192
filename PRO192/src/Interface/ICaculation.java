/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 * đây là interface
 * interface là gì?
 * - là giao diện chứa trong đó các phương thúa abtract
 * - Phương thức abtract là phương thức chỉ có khai báo và không có xử lý
 * @author PhiLe
 */
public interface ICaculation {
    //ktra có bao nhiêu chữ số
    public int countDigit(int n);
    
    // đếm số từ trong 1 chuỗi
    public int coutWord(String str);
    
    
    
}
