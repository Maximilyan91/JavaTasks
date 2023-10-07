package skyproTasks.OOP.Lesson3_Inheritance.transport;

import java.util.Objects;

public class Transport {

    private final String brand;
    private final String model;
    private final int yearOfProduction;
    private final String countryOfProduction;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int yearOfProduction, String countryOfProduction, String color) {
        this(brand, model, yearOfProduction, countryOfProduction, color, 0);
    }

    public Transport(String brand, String model, int yearOfProduction, String countryOfProduction, String color, int maxSpeed) {

        if (checkIncorrectData(brand)) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (checkIncorrectData(model)) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (yearOfProduction >= 0) {
            this.yearOfProduction = 2000;
        } else {
            this.yearOfProduction = yearOfProduction;
        }

        if (checkIncorrectData(countryOfProduction)) {
            this.countryOfProduction = "default";
        } else {
            this.countryOfProduction = countryOfProduction;
        }

        if (checkIncorrectData(color)) {
            this.color = "white";
        } else {
            this.color = color;
        }

        setMaxSpeed(maxSpeed);
    }



    public boolean checkIncorrectData(String string) {
        return string == null || string.isEmpty() || string.isBlank();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getCountryOfProduction() {
        return countryOfProduction;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        if (checkIncorrectData(color)) {
            color = "white";
        }
        this.color = color;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed < 0) {
            maxSpeed = Math.abs(maxSpeed);
        }
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", countryOfProduction='" + countryOfProduction + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return yearOfProduction == transport.yearOfProduction && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(countryOfProduction, transport.countryOfProduction) && Objects.equals(color, transport.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, yearOfProduction, countryOfProduction, color);
    }
}
