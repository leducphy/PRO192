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
public class Citybus extends Bus {

    protected int routerNum, kilo;

    public Citybus() {
        
    }

    public Citybus(int routerNum, int kilo, int tripNum, int vehicleNum, int revenue, String driverName) {
        super(tripNum, vehicleNum, revenue, driverName);
        this.routerNum = routerNum;
        this.kilo = kilo;
    }

    

    public int getRouterNum() {
        return routerNum;
    }

    public void setRouterNum(int routerNum) {
        this.routerNum = routerNum;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public void inputCityBus() {
        this.tripNum = (Common.InputInt("Trip number: "));
        this.driverName = (Common.InputString("Driver name: "));
        this.vehicleNum = (Common.InputInt("Vehicle number: "));
        this.routerNum=(Common.InputInt("Router number: "));
        this.kilo=(Common.InputInt("Travel kilometers: "));
        this.revenue=(Common.InputInt("Revenue: "));
    }

    public void show() {
        System.out.printf("%-18d%-18s%-18d%-18d%-18d%-18d", this.tripNum, this.driverName, this.vehicleNum, this.routerNum, this.kilo, this.revenue);
        System.out.println("");
    }

}
