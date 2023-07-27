/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javabook;

/**
 *
 * @author firatmacbook
 */
public class Vehicle {
   private int seatNumber;
   private int fuelcap;
   private int wheels;

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public Vehicle(int seatNumber, int fuelcap, int wheels) {
        this.seatNumber = seatNumber;
        this.fuelcap = fuelcap;
        this.wheels = wheels;
    }
    
}
