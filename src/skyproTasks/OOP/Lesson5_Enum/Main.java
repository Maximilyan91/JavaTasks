package skyproTasks.OOP.Lesson5_Enum;
import skyproTasks.OOP.Lesson5_Enum.driver.DriverB;
import skyproTasks.OOP.Lesson5_Enum.transport.Car;
import skyproTasks.OOP.Lesson5_Enum.transport.Transport;
import skyproTasks.OOP.Lesson5_Enum.transport.enumerations.BodyType;

public class Main {

    public static void main(String[] args) {
        Car car = new Car(
                "Toyota",
                "Prius",
                1.8, BodyType.SEDAN,
                new DriverB("Max",
                        true,
                        13));

        printMessage(car);

        car.printType();
    }

    public static void printMessage(Transport<?> transport) {
        System.out.println(
                "Водитель " + transport.getDriver().getFullName()
                + " управляет автомобилем " + transport.getBrand()
                + " " + transport.getModel()
                + " и будет участвовать в заезде");
    }
}
