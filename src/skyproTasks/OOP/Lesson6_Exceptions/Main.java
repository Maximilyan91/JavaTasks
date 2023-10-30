package skyproTasks.OOP.Lesson6_Exceptions;

import skyproTasks.OOP.Lesson6_Exceptions.driver.DriverB;
import skyproTasks.OOP.Lesson6_Exceptions.driver.DriverD;
import skyproTasks.OOP.Lesson6_Exceptions.exceptions.CantPassDiagnosticException;
import skyproTasks.OOP.Lesson6_Exceptions.transport.Bus;
import skyproTasks.OOP.Lesson6_Exceptions.transport.Car;
import skyproTasks.OOP.Lesson6_Exceptions.transport.Transport;
import skyproTasks.OOP.Lesson6_Exceptions.transport.enumerations.BodyType;
import skyproTasks.OOP.Lesson6_Exceptions.transport.enumerations.Capacity;

public class Main {

    public static void main(String[] args) throws CantPassDiagnosticException {

        DriverB max = new DriverB("Max",
                true,
                13);

        Car car = new Car(
                "Toyota",
                "Prius",
                1.8, BodyType.SEDAN, max);

        Transport<DriverD> bus = new Bus("Икарус", "87456", 10.0, Capacity.MIDDLE,
                new DriverD("Петрович",
                        false,
                        10));


        printMessage(car);

        car.printType();
        car.passDiagnostic();
        passDiagnostic(car, bus);
    }

    public static void passDiagnostic(Transport<?>... transports) throws CantPassDiagnosticException {
        try {
            for (Transport<?> transport : transports) {
                transport.passDiagnostic();
            }
        } catch (CantPassDiagnosticException e) {
            System.out.println(e.getMessage());
        }

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
