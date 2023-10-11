package skyproTasks.OOP.Lesson4_polymorphism.transport;


import java.util.Objects;

import static java.lang.Math.abs;

public abstract class Transport {

    private final String brand;
    private final String model;
    private Double engineVolume;

    public Transport(String brand, String model, Double engineVolume) {
        this.brand = checkCorrectString(brand) ? brand : "default brand";
        this.model = checkCorrectString(model) ? model : "default model";
        setEngineVolume(engineVolume);
        }

    public abstract void startMoving();
    public abstract void stopMoving();

    public boolean checkCorrectString(String s) {
        return s != null && !s.isEmpty() && !s.isBlank();
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
        if ( engineVolume != null && engineVolume < 0) {
            this.engineVolume = Math.abs(engineVolume);
        } else if (engineVolume == null || engineVolume == 0) {
            this.engineVolume = 1.0;
        } else {
            this.engineVolume = engineVolume;
        }

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
