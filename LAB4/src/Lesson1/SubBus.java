/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson1;

import Menu.Common;

/**
 *
 * @author PhiLe
 */
public class SubBus extends Bus {

    protected String destination;
    protected int travelDays;

    public SubBus() {
        
    }

    public SubBus(String destination, int travelDays, int tripNum, int vehicleNum, int revenue, String driverName) {
        super(tripNum, vehicleNum, revenue, driverName);
        this.destination = destination;
        this.travelDays = travelDays;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTravelDays() {
        return travelDays;
    }

    public void setTravelDays(int travelDays) {
        this.travelDays = travelDays;
    }

    public void inputSubBus() {
        this.tripNum = (Common.InputInt("Trip number: "));
        this.driverName = (Common.InputString("Driver name: "));
        this.vehicleNum = (Common.InputInt("Vehicle number: "));
        this.destination = (Common.InputString("Destination: "));
        this.travelDays = (Common.InputInt("Number of travel days: "));
        this.revenue = (Common.InputInt("Revenue: "));
    }

    public void show() {
        System.out.printf("%-18d%-18s%-18d%-18s%-18d%-18d", this.tripNum, this.driverName, this.vehicleNum, this.destination, this.travelDays, this.revenue);
        System.out.println("");
    }

}
