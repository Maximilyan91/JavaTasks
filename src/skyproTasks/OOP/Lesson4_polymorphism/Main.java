package skyproTasks.OOP.Lesson4_polymorphism;

import skyproTasks.OOP.Lesson4_polymorphism.transport.Bus;
import skyproTasks.OOP.Lesson4_polymorphism.transport.Car;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("brand1", "model1", 2.0);
        Car car2 = new Car("brand2", "model2", 1.3);
        Car car3 = new Car("   ", null, -2.8);
        Car car4 = new Car("brand4", "model4", 4.3);

        Bus bus1 = new Bus("brand bus 1", "model bus 1", 4.0);
        Bus bus2 = new Bus("brand bus 2", "model bus 2", 4.0);
        Bus bus3 = new Bus(null, "  ", null);
        Bus bus4 = new Bus("brand bus 4", "model bus 4", 4.0);




        car1.startMoving();
        car4.stopMoving();
        car4.stopMoving();
        car3.stopMoving();
        bus3.stopMoving();
        System.out.println(bus3);
    }
}
