/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson4;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



/**
 *
 * @author PhiLe
 */
public class HangThucPham {
    String code;
    String name;
    double price;
    Date productDate;
    Date ExpirateDate;

    public HangThucPham() {
    }

    public HangThucPham(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
        
    }

    public HangThucPham(Date productDate, Date ExpirateDate) {
        this.productDate = productDate;
        this.ExpirateDate = ExpirateDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getProductDate() {
        return productDate;
    }

    public void setProductDate(Date productDate) {
        this.productDate = productDate;
    }

    public Date getExpirateDate() {
        return ExpirateDate;
    }

    public void setExpirateDate(Date ExpirateDate) {
        this.ExpirateDate = ExpirateDate;
    }

    @Override
    public String toString() {
        SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
        String s1 = SDF.format(productDate);
        String s2 = SDF.format(ExpirateDate);
        return "Item code: " + code + "\n" + "Product name: " + name + "\n" + "Price: " + price + "\n" + "Production date: " + s1 + "\n" + "Expiration date: " + s2;
    }
    
    public void NSX(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        this.productDate = cal.getTime();
    }
    
    public void HSD(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        this.ExpirateDate = cal.getTime();
    }
    
    public boolean CheckN(boolean N) {
        if(this.name == "" || this.name.isEmpty()) {
            System.out.println("Code is not empty");
        } else {
            N = false;
        }
        return N;
    }
    
    public boolean CheckC(boolean C) {
         if(this.code == "" || this.code.isEmpty()) {
            System.out.println("Name is not empty");
        } else {
            C = false;
        }
        return C;
    }
    
    public boolean CheckPE(boolean PE) {
        if(this.productDate.compareTo(this.ExpirateDate) < 0) {
            PE = false;
        } else {
            System.out.println("Nhap lai vi ngay het han < ngay san xuat ~");
        }
        return PE;
    }
    
    public void checkHSD() {
        Date today = new Date();
        today.getTime();
        SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
        String s = SDF.format(today);
        if(this.getExpirateDate().compareTo(today) < 0) {
            System.out.println("Hom nay: " + s + " -> Het han");
        } else {
            System.out.println("Hom nay: " + s + " -> Con han");
        }
    }
}