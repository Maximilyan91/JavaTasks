package skyproTasks.OOP.Lesson4_polymorphism;
import skyproTasks.OOP.Lesson4_polymorphism.driver.DriverB;
import skyproTasks.OOP.Lesson4_polymorphism.transport.Car;
import skyproTasks.OOP.Lesson4_polymorphism.transport.Transport;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(
                "Toyota",
                "Prius",
                1.8,
                new DriverB("Max",
                        true,
                        13));

        printMessage(car);
    }

    public static void printMessage(Transport<?> transport) {
        System.out.println(
                "Водитель " + transport.getDriver().getFullName()
                + " управляет автомомбилем " + transport.getBrand()
                + " " + transport.getModel()
                + " и будет участвовать в заезде");
    }
}
