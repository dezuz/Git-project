package com.mateacademy.factory;

public class CarWheel {
    private double wheelStatus;

    public CarWheel() {
        this.wheelStatus = Math.random();
    }

    public CarWheel(double wheelStatus) {
        this.wheelStatus = wheelStatus;
    }

    public void setWheelStatus(double wheelStatus) {
        this.wheelStatus = wheelStatus;
    }

    public void setNewWheel() {
        this.wheelStatus = 1;
    }

    public void wipeOffWheel(double wipeOffPercent) {
        if (this.wheelStatus - (wipeOffPercent / 100) < 0) {
            errorMessage();
        }
        else {
            this.wheelStatus -= (wipeOffPercent / 100);
        }
    }

    private void errorMessage() {
        System.out.println("Your wheel status is lower than 0, please write correct percent");
    }

    public double getWheelStatus() {
        return this.wheelStatus;
    }

    public void displayStatus() {
        System.out.println("The wheel status is: " + this.wheelStatus);
    }
}
