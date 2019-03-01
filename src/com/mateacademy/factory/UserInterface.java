package com.mateacademy.factory;

import java.time.LocalDate;
import java.util.Scanner;

public class UserInterface {

    private final Scanner scanner = new Scanner(System.in);
    private double inputDouble;
    private int inputInteger;
    private String inputString;
    private CarDoor carDoor = new CarDoor();
    private CarWheel carWheel = new CarWheel();
    private LocalDate date = LocalDate.now();
    private Car car = new Car(date);

    public void userAction(int usersInput) {

        switch(usersInput) {
            case 1: {
                carDoor.openDoor();
                break;
            }
            case 2: {
                carDoor.closeDoor();
                break;
            }
            case 3: {
                carDoor.openWindow();
                break;
            }
            case 4: {
                carDoor.closeWindow();
                break;
            }
            case 5: {
                carDoor.setDoorStatus();
                break;
            }
            case 6: {
                carDoor.setWindowStatus();
                break;
            }
            case 7: {
                setWheelStatus();
                break;
            }
            case 8 : {
                carWheel.setNewWheel();
                break;
            }
            case 9 : {
                setWipeOffWheels();
                break;
            }
            case 10 : {
                setEngineType();
                break;
            }
            case 11 : {
                setMaxSpeed();
                break;
            }
            case 12 : {
                setTimeUpTo100();
                break;
            }
            case 13 : {
                setPassengersCapacity();
                break;
            }
            case 14 : {
                setCurrentPassengers();
                break;
            }
            case 15 : {
                setCurrentSpeed();
                break;
            }
            case 16 : {
                car.addPassenger();
                break;
            }
            case 17 : {
                car.removePassenger();
                break;
            }
            case 18 : {
                car.removeAllPassengers();
                break;
            }
            case 19 : {
                setNumberOfWheels();
                break;
            }
            case 20 : {
                car.removeWheels();
                break;
            }
            case 21 : {
                setNumberOfDoors();
                break;
            }
            case 22 : {
                car.currentMaxSpeed();
                System.out.println();
                break;
            }
            case 23 : {
                carDoor.displayStatus();
                break;
            }
            case 24 : {
                carWheel.displayStatus();
                break;
            }
            case 25 : {
                car.displayStatus();
                break;
            }
        }
    }

    private void setWheelStatus() {
        System.out.println("Write wheel status..");
        inputString = scanner.nextLine();
        inputDouble = Double.parseDouble(inputString);
        carWheel.setWheelStatus(inputDouble);
    }

    private void setWipeOffWheels() {
        System.out.println("Write wipe off wheels in percent..");
        inputString = scanner.nextLine();
        inputDouble = Double.parseDouble(inputString);
        carWheel.wipeOffWheel(inputDouble);
    }

    private void setEngineType() {
        System.out.println("Write engine type..");
        inputString = scanner.nextLine();
        car.setEngineType(inputString);
    }

    private void setMaxSpeed() {
        System.out.println("Write maximum speed..");
        inputString = scanner.nextLine();
        inputDouble = Double.parseDouble(inputString);
        car.setMaxSpeed(inputDouble);
    }

    private void setTimeUpTo100() {
        System.out.println("Write overclocking time up to 100 km/h..");
        inputString = scanner.nextLine();
        inputDouble = Double.parseDouble(inputString);
        car.setTimeUpTo100(inputDouble);
    }

    private void setPassengersCapacity() {
        System.out.println("Write passengers capacity..");
        inputString = scanner.nextLine();
        inputInteger = Integer.parseInt(inputString);
        car.setPassengersCapacity(inputInteger);
    }

    private void setCurrentPassengers() {
        System.out.println("Write number of passengers in car..");
        inputString = scanner.nextLine();
        inputInteger = Integer.parseInt(inputString);
        car.setPassengersInCar(inputInteger);
    }

    private void setCurrentSpeed() {
        System.out.println("Write current car speed..");
        inputString = scanner.nextLine();
        inputDouble = Double.parseDouble(inputString);
        car.setCurrentSpeed(inputDouble);
    }

    private void setNumberOfWheels() {
        System.out.println("Write number of wheels..");
        inputString = scanner.nextLine();
        inputInteger = Integer.parseInt(inputString);
        car.addWheels(inputInteger);
    }

    private void setNumberOfDoors() {
        System.out.println("Write number of doors..");
        inputString = scanner.nextLine();
        inputInteger = Integer.parseInt(inputString);
        car.addDoors(inputInteger);
    }

    public static void main(String[] args) {
        UserInterface userInterface = new UserInterface();

        System.out.println("There is your car, what would you like to do?" +
                "\n ...Hint: its necessary to fill field 1 or 2, 3 or 4, 7, 10, 11, 12, 13, 14, 15 before using car..." +
                "\n There is an options: " +
                "\n 1. Open door." +
                "\n 2. Close door." +
                "\n 3. Open window." +
                "\n 4. Close window." +
                "\n 5. Change door status." +
                "\n 6. Change window status." +
                "\n 7. Set wheel status." +
                "\n 8. Set a new wheel." +
                "\n 9. Wipe off a wheel." +
                "\n 10. Set engine type." +
                "\n 11. Set maximum speed." +
                "\n 12. Set overclocking time to 100 km/h." +
                "\n 13. Set passengers capacity." +
                "\n 14. Set number of passengers in car." +
                "\n 15. Set current car speed." +
                "\n 16. Add passenger." +
                "\n 17. Remove passenger." +
                "\n 18. Remove all passengers." +
                "\n 19. Add wheel(s)." +
                "\n 20. Remove wheel(s)." +
                "\n 21. Add doors." +
                "\n 22. Show current maximum speed." +
                "\n 23. Display doors and windows status." +
                "\n 24. Display wheels status." +
                "\n 25. Display car status. ");

        do {
            System.out.println("Choose your option: ");
            userInterface.inputString = userInterface.scanner.nextLine();
            userInterface.inputInteger = Integer.parseInt(userInterface.inputString);
            userInterface.userAction(userInterface.inputInteger);
        }
        while(userInterface.inputInteger <= 25);
    }
}
