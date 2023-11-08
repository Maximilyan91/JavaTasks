package skyproTasks.OOP.Lesson7_List_and_Queue.transport;


import skyproTasks.OOP.Lesson7_List_and_Queue.driver.Driver;
import skyproTasks.OOP.Lesson7_List_and_Queue.exception.CantPassDiagnosticException;
import skyproTasks.OOP.Lesson7_List_and_Queue.mechanic.Mechanic;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport<T extends Driver> {

    private final String brand;
    private final String model;
    private Double engineVolume;
    private List<Mechanic> mechanicList = new ArrayList<>();
    private T driver;

    public Transport(String brand, String model, Double engineVolume, T driver) {
        this.brand = checkCorrectString(brand) ? brand : "default brand";
        this.model = checkCorrectString(model) ? model : "default model";
        setEngineVolume(engineVolume);
        this.driver = driver;
    }

    public abstract void printType();

    public abstract void startMoving();

    public abstract void stopMoving();

    public void addMechanic(Mechanic mechanic) {
        mechanicList.add(mechanic);
    }

    public abstract void passDiagnostic() throws CantPassDiagnosticException;

    public boolean checkCorrectString(String s) {
        return s != null && !s.isEmpty() && !s.isBlank();
    }

    public String getMechanicList() {
        return "У автомобиля " + brand + " " + model
                + " водитель " + getDriver().getFullName()
                + " есть механики " + mechanicList;
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Double engineVolume) {
        if (engineVolume != null && engineVolume < 0) {
            this.engineVolume = Math.abs(engineVolume);
        } else if (engineVolume == null || engineVolume == 0) {
            this.engineVolume = 1.0;
        } else {
            this.engineVolume = engineVolume;
        }

    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
