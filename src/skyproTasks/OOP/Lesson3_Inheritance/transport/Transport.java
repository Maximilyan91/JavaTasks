package skyproTasks.OOP.Lesson3_Inheritance.transport;

public class Transport {

    private String brand;
    private String model;
    private int yearOfProduction;
    private String countryOfProduction;
    private String color;
    private int maxSpeed;

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
}
