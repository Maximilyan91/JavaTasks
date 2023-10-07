package skyproTasks.OOP.Lesson3_Inheritance.transport;

public class Bus extends Transport{


    public Bus(String brand, String model, int yearOfProduction, String countryOfProduction, String color) {
        super(brand, model, yearOfProduction, countryOfProduction, color);
    }

    public Bus(String brand, String model, int yearOfProduction, String countryOfProduction, String color, int maxSpeed) {
        super(brand, model, yearOfProduction, countryOfProduction, color, maxSpeed);
    }
}
