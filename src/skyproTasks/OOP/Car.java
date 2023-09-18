package skyproTasks.OOP;

public class Car {

    private final String brand;
    private final String model;
    private final float engineVolume;
    private final String color;
    private final int yearOfProduction;
    private final String countryOfProduction;

    public Car(String brand, String model, float engineVolume, String color,
               int yearOfProduction, String countryOfProduction) {

        if (brand == null || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (engineVolume <= 0f) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color == null || color.isEmpty()) {
            this.color = "white";
        } else {
            this.color = color;
        }

        if (yearOfProduction >= 0) {
            this.yearOfProduction = 2000;
        } else {
            this.yearOfProduction = yearOfProduction;
        }
        if (countryOfProduction == null || countryOfProduction.isEmpty()) {
            this.countryOfProduction = "default";
        } else {
            this.countryOfProduction = countryOfProduction;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getCountryOfProduction() {
        return countryOfProduction;
    }

    @Override
    public String toString() {
        return "Автомобиль: " + brand + " " + model +
                "\nГод выпуска: " + yearOfProduction +
                "\nЦвет: " + color +
                "\nОбъем двигателя: " + engineVolume + " л." +
                "\nСтрана производства: " + countryOfProduction;

    }
}
