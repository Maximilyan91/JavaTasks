package skyproTasks.OOP.Lesson5_Enum.transport;


import skyproTasks.OOP.Lesson5_Enum.driver.Driver;

public abstract class Transport<T extends Driver> {

    private final String brand;
    private final String model;
    private Double engineVolume;

    private T driver;

    public Transport(String brand, String model, Double engineVolume, T driver) {
        this.brand = checkCorrectString(brand) ? brand : "default brand";
        this.model = checkCorrectString(model) ? model : "default model";
        setEngineVolume(engineVolume);
        this.driver = driver;
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

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
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
