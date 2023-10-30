package skyproTasks.OOP.Lesson6_Exceptions.transport;

import skyproTasks.OOP.Lesson6_Exceptions.driver.DriverD;
import skyproTasks.OOP.Lesson6_Exceptions.exceptions.CantPassDiagnosticException;
import skyproTasks.OOP.Lesson6_Exceptions.transport.enumerations.Capacity;

public class Bus extends Transport<DriverD> implements Racing {

    private Capacity capacity;
    public Bus(String brand, String model, Double engineVolume, Capacity capacity, DriverD driver) {
        super(brand, model, engineVolume, driver);

        setCapacity(capacity);
    }

    @Override
    public void printType() {
        if (capacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Вместимость автобуса " + getBrand() + " " + getModel() + " - " + capacity);
        }
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
    public void passDiagnostic() throws CantPassDiagnosticException {
        throw new CantPassDiagnosticException("Автобус не может проходить диагностику");
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

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }
}
