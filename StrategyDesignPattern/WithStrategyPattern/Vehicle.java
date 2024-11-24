package StrategyDesignPattern.WithStrategyPattern;

import StrategyDesignPattern.WithStrategyPattern.Strategy.DriveStrategyInterface;

public class Vehicle {
    // object create -> DriveStrategyInterface
    DriveStrategyInterface driveStrategyObject;

    // Constructor vehicle class - obj
    Vehicle(DriveStrategyInterface driveObj) {
        this.driveStrategyObject = driveObj;
    }

    public void drive() {
        driveStrategyObject.drive();
    }
}
