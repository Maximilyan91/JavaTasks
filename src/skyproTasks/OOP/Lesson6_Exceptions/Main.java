package skyproTasks.OOP.Lesson6_Exceptions;
import skyproTasks.OOP.Lesson6_Exceptions.driver.Driver;
import skyproTasks.OOP.Lesson6_Exceptions.driver.DriverB;
import skyproTasks.OOP.Lesson6_Exceptions.transport.Car;
import skyproTasks.OOP.Lesson6_Exceptions.transport.Transport;
import skyproTasks.OOP.Lesson6_Exceptions.transport.enumerations.BodyType;

public class Main {

    public static void main(String[] args) {

        DriverB max = new DriverB("Max",
                true,
                13);

        Car car = new Car(
                "Toyota",
                "Prius",
                1.8, BodyType.SEDAN, max);



        printMessage(car);

        car.printType();
        car.passDiagnostic();
    }



    public static void printMessage(Transport<?> transport) {
        System.out.printf("Водитель %s " +
                "управляет автомобилем %s %s " +
                "и будет участвовать в заезде%n",
                transport.getDriver().getFullName(),
                transport.getBrand(),
                transport.getModel());
    }
}
