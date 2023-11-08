package skyproTasks.OOP.Lesson7_List_and_Queue;

import skyproTasks.OOP.Lesson7_List_and_Queue.driver.DriverB;
import skyproTasks.OOP.Lesson7_List_and_Queue.driver.DriverD;
import skyproTasks.OOP.Lesson7_List_and_Queue.exception.CantPassDiagnosticException;
import skyproTasks.OOP.Lesson7_List_and_Queue.mechanic.Mechanic;
import skyproTasks.OOP.Lesson7_List_and_Queue.transport.Bus;
import skyproTasks.OOP.Lesson7_List_and_Queue.transport.Car;
import skyproTasks.OOP.Lesson7_List_and_Queue.transport.Transport;
import skyproTasks.OOP.Lesson7_List_and_Queue.transport.enumeration.BodyType;
import skyproTasks.OOP.Lesson7_List_and_Queue.transport.enumeration.Capacity;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws CantPassDiagnosticException {

        DriverB max = new DriverB("Max",
                true,
                13);

        Car car = new Car(
                "Toyota",
                "Prius",
                1.8, BodyType.SEDAN, max);

        Car car2 = new Car(
                "Volkswagen",
                "Touareg",
                3.0, BodyType.SUV,max);
        Transport<DriverD> bus = new Bus("Икарус", "87456", 10.0, Capacity.MIDDLE,
                new DriverD("Петрович",
                        true,
                        10));


//        printMessage(car);
//
//        car.printType();
//        car.passDiagnostic();
//        passDiagnostic(car, bus);

        List<Transport<?>> racersCars = new ArrayList<>();
        racersCars.add(car);
        racersCars.add(car2);
        racersCars.add(bus);


        Mechanic mechanic1 = new Mechanic("Alex", "Bublikov", "STO");
        Mechanic mechanic2 = new Mechanic("Pavel", "Zyablikov", "STO2");
        Mechanic mechanic3 = new Mechanic("Andrey", "Pupkin", "STO3");
        Mechanic mechanic4 = new Mechanic("Victor", "Lupkin", "STO4");


//        mechanic1.doService(car, car2, bus);
//
//        car.addMechanic(mechanic1);
//        car.addMechanic(mechanic2);
//        car.addMechanic(mechanic3);
//        car.addMechanic(mechanic4);

//        System.out.println(car.getMechanicList());

        ServiceStation<Transport<?>> station = new ServiceStation<>();

        station.addInQueue(car);
        station.addInQueue(car2);
        station.addInQueue(bus);
        station.doCarInspection();

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
