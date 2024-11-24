package StrategyDesignPattern.WithStrategyPattern.Strategy;

public class SportsDriveStrategy implements DriveStrategyInterface {
    @Override
    public void drive() {
        System.out.println("Sports drive capabilit");
    }
}
