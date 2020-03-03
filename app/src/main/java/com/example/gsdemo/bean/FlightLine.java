package com.example.gsdemo.bean;

/**
 * Create by 张瀛煜 on 2020-03-02 ：）
 */
public class FlightLine {

    /**
     * id : 1
     * flightNum : 3U8633
     * price : 500
     * time : 08:12
     * aircraft : C919
     * date : 2019-01-01
     */

    private int id;
    private String flightNum;
    private int price;
    private String time;
    private String aircraft;
    private String date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
