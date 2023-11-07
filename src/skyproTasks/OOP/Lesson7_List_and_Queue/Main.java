package skyproTasks.OOP.Lesson7_List_and_Queue;

import skyproTasks.OOP.Lesson7_List_and_Queue.driver.DriverB;
import skyproTasks.OOP.Lesson7_List_and_Queue.driver.DriverD;
import skyproTasks.OOP.Lesson7_List_and_Queue.exception.CantPassDiagnosticException;
import skyproTasks.OOP.Lesson7_List_and_Queue.transport.Bus;
import skyproTasks.OOP.Lesson7_List_and_Queue.transport.Car;
import skyproTasks.OOP.Lesson7_List_and_Queue.transport.Transport;
import skyproTasks.OOP.Lesson7_List_and_Queue.transport.enumeration.BodyType;
import skyproTasks.OOP.Lesson7_List_and_Queue.transport.enumeration.Capacity;

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
