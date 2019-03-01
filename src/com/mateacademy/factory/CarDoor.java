package com.mateacademy.factory;

public class CarDoor {
    private boolean doorStatus;
    private boolean windowStatus;

    public CarDoor() {
        this.doorStatus = false;
        this.windowStatus = false;
    }

    public CarDoor(boolean doorStatus, boolean windowStatus) {
        this.doorStatus = doorStatus;
        this.windowStatus = windowStatus;
    }

    public void openDoor() {
        this.doorStatus = true;
    }

    public void closeDoor() {
        this.doorStatus = false;
    }

    public void setDoorStatus() {
        this.doorStatus = !doorStatus;
    }

    public void openWindow() {
        this.windowStatus = true;
    }

    public void closeWindow() {
        this.windowStatus = false;
    }

    public void setWindowStatus() {
        this.windowStatus = !windowStatus;
    }

    public void displayStatus() {
        System.out.println("The door status is: " + this.doorStatus + "\nThe window status is: " + this.windowStatus);
    }
}
