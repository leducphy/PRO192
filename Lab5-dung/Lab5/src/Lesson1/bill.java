/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson1;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author PhiLe
 */
public class bill {

    private int id;
    private Date invoice;
    private String customerName;
    private String roomCode;
    private float unitPrice;

    public bill() {
    }

    public bill(int id, Date invoice, String customerName, String roomCode, float unitPrice) {
        this.id = id;
        this.invoice = invoice;
        this.customerName = customerName;
        this.roomCode = roomCode;
        this.unitPrice = unitPrice;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getInvoice() {
        return invoice;
    }

    public void setInvoice(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        this.invoice = calendar.getTime();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    Scanner sc = new Scanner(System.in);

    public void Input() {
        System.out.print("Nhap ma hoa don: ");
        this.id = Integer.parseInt(sc.nextLine());
        ValitDate date = new ValitDate();
        invoice = date.CheckDate("Nhập ngày giao dịch(dd/MM/yyyy): ", "dd/MM/yyyy");
        System.out.print("Nhap ten khach hang: ");
        customerName = sc.nextLine();
        System.out.print("Nhap ma phong: ");
        roomCode = sc.nextLine();
        System.out.print("Nhap don gia: ");
        unitPrice = sc.nextFloat();
    }
    DecimalFormat d = new DecimalFormat();
    SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public String toString() {
        return "Ma hoa don " + this.id
                + " Ngay giao dich " + f.format(invoice)
                + " Ten khach hang " + this.customerName
                + " Ma phong " + this.roomCode
                + " Don gia " + this.unitPrice;
    }

}
