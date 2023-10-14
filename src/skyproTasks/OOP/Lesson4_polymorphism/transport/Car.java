package skyproTasks.OOP.Lesson4_polymorphism.transport;

public class Car extends Transport implements Racing {

    public Car(String brand, String model, Double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void startMoving() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " заехал на пит-стоп");
    }

    @Override
    public void bestTimeLap() {
        System.out.println("Лучшее время круга автомобиля " + getBrand() + " " + getModel() + " 03:17");
    }

    @Override
    public void maxSPeed() {
        System.out.println("Максимальная скорость автомобиля " + getBrand() + " " + getModel() + " 180 км/ч");
    }
}

