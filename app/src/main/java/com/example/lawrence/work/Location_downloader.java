package com.example.lawrence.work;

public class Location_downloader {
    double longitude, latitude, number;
    String name;

    public Location_downloader(double latitude, double longitude, double number, String name){

        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.number = number;

    }

    public Location_downloader(){}

    public double getLongitude(){
        return longitude;
    }

    public void setLongitude(double longitude){
        this.longitude = longitude;
    }

    public double getLatitude(){
        return  latitude;
    }

    public  void setLatitude(double latitude){
        this.latitude = latitude;
    }

    public  double getNumber(){return  number;}
    public  void  setNumber(double number){this.number = number;}

    public String getName(){return  name;}
    public  void  setName(String name){this.name = name;}

}
