package com.mateacademy.factory;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private final int PRODUCTION_DATE;
    private String engineType;
    private double maxSpeed;
    private double timeUpTo100;
    private int passengersCapacity;
    private int passengersInCar;
    private double currentSpeed;
    private List<CarWheel> carWheels = new ArrayList<>();
    private List<CarDoor> carDoors = new ArrayList<>();

    public Car(int productionDate) {
        this.PRODUCTION_DATE = productionDate;
        addDoors(4);
        addWheels(4);
    }

    public Car(int productionDate, String engineType, double maxSpeed, double timeUpTo100, int passengerCapacity, int passengersInCar, double speed) {
        this.PRODUCTION_DATE = productionDate;
        this.engineType = engineType;
        this.maxSpeed = maxSpeed;
        this.timeUpTo100 = timeUpTo100;
        this.passengersCapacity = passengerCapacity;
        this.passengersInCar = passengersInCar;
        this.currentSpeed = speed;
        addDoors(4);
        addWheels(4);
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void setTimeUpTo100(double timeUpTo100) {
        this.timeUpTo100 = timeUpTo100;
    }

    public void setPassengersCapacity(int passengersCapacity) {
        this.passengersCapacity = passengersCapacity;
    }

    public void setPassengersInCar(int passengersInCar) {
        this.passengersInCar = passengersInCar;
    }

    public void setCurrentSpeed(double speed) {
        this.currentSpeed = speed;
    }

    public void addPassenger() {
        if (passengersInCar >= passengersCapacity) {
            System.out.println("There is no place");
        }
        else {
            this.passengersInCar++;
        }
    }

    public void removePassenger() {
        if (passengersInCar == 0) {
            System.out.println("There is no passengers in car");
        }
        else {
            this.passengersInCar--;
        }
    }

    public void removeAllPassengers() {
        if (passengersInCar == 0) {
            System.out.println("There is no passengers in car");
        }
        else {
            this.passengersInCar = 0;
        }
    }

    public CarDoor getDoor(int index) {
        return carDoors.get(index);
    }

    public CarWheel getWheel(int index) {
        return carWheels.get(index);
    }

    public void removeWheels() {
        carWheels.clear();
    }

    public void addWheels(int number) {
        for (int i = 0; i < number; i++) {
            carWheels.add(new CarWheel());
        }
    }

    public void addDoors(int number) {
        for (int i = 0; i < number; i++) {
            carDoors.add(new CarDoor());
        }
    }

    public void currentMaxSpeed() {
        this.maxSpeed = (passengersInCar == 0) ? 0 : mostWipedOffWheel();
        System.out.println(this.maxSpeed);
    }

    private double mostWipedOffWheel() {
        double mostWipedWheel = 1;

        for (int i = 0; i < carWheels.size(); i++) {
            if (mostWipedWheel > carWheels.get(i).getWheelStatus()) {
                mostWipedWheel = carWheels.get(i).getWheelStatus();
            }
        }
        return maxSpeed * mostWipedWheel;
    }

    public void displayStatus() {
        System.out.println("The production date is: " + this.PRODUCTION_DATE
                + "\nThe engine type is: " + this.engineType
                + "\nThe car maximum speed is: " + this.maxSpeed
                + "\nThe overclocking time to 100 km/h is: " + this.timeUpTo100
                + "\nThe passengers capacity is: " + this.passengersCapacity
                + "\nThe number of passengers in car is: " + this.passengersInCar
                + "\nThe current speed is: " + this.currentSpeed);
    }
}
