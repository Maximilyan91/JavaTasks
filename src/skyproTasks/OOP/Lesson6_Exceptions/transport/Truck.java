package skyproTasks.OOP.Lesson6_Exceptions.transport;

import skyproTasks.OOP.Lesson6_Exceptions.driver.DriverD;
import skyproTasks.OOP.Lesson6_Exceptions.transport.enumerations.Tonnage;

public class Truck extends Transport<DriverD> implements Racing {

    private Tonnage tonnage;

    public Truck(String brand, String model, Double engineVolume, Tonnage tonnage, DriverD driverD) {
        super(brand, model, engineVolume, driverD);
        setTonnage(tonnage);
    }

    @Override
    public void printType() {
        if (tonnage == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Кузов автомобиля " + getBrand() + " " + getModel() + " - " + tonnage);
        }
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
    public void passDiagnostic() {
        System.out.println( "Грузовик " + getBrand() + " " + getModel() + " прошел диагностику");
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

    public Tonnage getTonnage() {
        return tonnage;
    }

    public void setTonnage(Tonnage tonnage) {
        this.tonnage = tonnage;
    }
}
