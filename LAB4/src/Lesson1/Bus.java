/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson1;

/**
 *
 * @author PhiLe
 */
public class Bus {
    protected int tripNum, vehicleNum, revenue;
    protected String driverName;

    public Bus() {
    }

    public Bus(int tripNum, int vehicleNum, int revenue, String driverName) {
        this.tripNum = tripNum;
        this.vehicleNum = vehicleNum;
        this.revenue = revenue;
        this.driverName = driverName;
    }

    public int getTripNum() {
        return tripNum;
    }

    public void setTripNum(int tripNum) {
        this.tripNum = tripNum;
    }

    public int getVehicleNum() {
        return vehicleNum;
    }

    public void setVehicleNum(int vehicleNum) {
        this.vehicleNum = vehicleNum;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }
    
    
}
