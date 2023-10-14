package skyproTasks.OOP.Lesson4_polymorphism.transport;

public class Bus extends Transport implements Racing {

    public Bus(String brand, String model, Double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " заехал на пит-стоп");
    }

    @Override
    public void bestTimeLap() {
        System.out.println("Лучшее время круга автобуса " + getBrand() + " " + getModel() + " 03:45");
    }

    @Override
    public void maxSPeed() {
        System.out.println("Максимальная скорость автобуса " + getBrand() + " " + getModel() + " 90 км/ч");
    }
}
