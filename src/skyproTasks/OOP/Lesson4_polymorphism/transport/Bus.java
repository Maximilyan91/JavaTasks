package skyproTasks.OOP.Lesson4_polymorphism.transport;

import skyproTasks.OOP.Lesson4_polymorphism.driver.DriverD;

public class Bus extends Transport<DriverD> implements Racing {


    public Bus(String brand, String model, Double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " заехал на пит-стоп");
    }

    @Override
    public void bestTimeLap() {
        System.out.println("Лучшее время круга автобуса " + getBrand() + " " + getModel() + " 03:45");
    }

    @Override
    public void maxSPeed() {
        System.out.println("Максимальная скорость автобуса " + getBrand() + " " + getModel() + " 90 км/ч");
    }
}
