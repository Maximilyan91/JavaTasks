package skyproTasks.OOP.Lesson4_polymorphism.transport;

import skyproTasks.OOP.Lesson4_polymorphism.driver.DriverD;

public class Truck extends Transport<DriverD> implements Racing{

    public Truck(String brand, String model, Double engineVolume, DriverD driverD) {
        super(brand, model, engineVolume, driverD);
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " заехал на пит-стоп");
    }

    @Override
    public void bestTimeLap() {
        System.out.println("Лучшее время круга грузовика " + getBrand() + " " + getModel() + " 04:10");
    }

    @Override
    public void maxSPeed() {
        System.out.println("Максимальная скорость грузовика " + getBrand() + " " + getModel() + " 120 км/ч");
    }
}
