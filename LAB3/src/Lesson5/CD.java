/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson5;

/**
 *
 * @author PhiLe
 */
public class CD {
    private int cdCode;
    private String cdTitle;
    private String singer;
    private int songNumber;
    private int cost;

    public CD() {
    }

    public CD(int cdCode, String cdTitle, String singer, int songNumber, int cost) {
        this.cdCode = cdCode;
        this.cdTitle = cdTitle;
        this.singer = singer;
        this.songNumber = songNumber;
        this.cost = cost;
    }

    public int getCdCode() {
        return cdCode;
    }

    public void setCdCode(int cdCode) {
        this.cdCode = cdCode;
    }

    public String getCdTitle() {
        return cdTitle;
    }

    public void setCdTitle(String cdTitle) {
        this.cdTitle = cdTitle;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getSongNumber() {
        return songNumber;
    }

    public void setSongNumber(int songNumber) {
        this.songNumber = songNumber;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "CD{" + "cdCode=" + cdCode + ", cdTitle=" + cdTitle + ", singer=" + singer + ", songNumber=" + songNumber + ", cost=" + cost + '}';
    }
    
    public void showCD(){
        System.out.printf("%-10d %-20s %-20s %-10d %-20d \n",cdCode,cdTitle,singer,songNumber,cost);
    }
}
