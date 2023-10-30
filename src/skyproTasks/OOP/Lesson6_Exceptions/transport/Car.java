package skyproTasks.OOP.Lesson6_Exceptions.transport;

import skyproTasks.OOP.Lesson6_Exceptions.driver.DriverB;
import skyproTasks.OOP.Lesson6_Exceptions.transport.enumerations.BodyType;

public class Car extends Transport<DriverB> implements Racing {

    private BodyType bodyType;
    public Car(String brand, String model, Double engineVolume, BodyType bodyType, DriverB driverB) {
        super(brand, model, engineVolume, driverB);

        setBodyType(bodyType);
    }

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Кузов автомобиля " + getBrand() + " " + getModel() + " - " + bodyType);
        }
    }

    @Override
    public void startMoving() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " заехал на пит-стоп");
    }

    @Override
    public void bestTimeLap() {
        System.out.println("Лучшее время круга автомобиля " + getBrand() + " " + getModel() + " 03:17");
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void maxSPeed() {
        System.out.println("Максимальная скорость автомобиля " + getBrand() + " " + getModel() + " 180 км/ч");
    }

}

