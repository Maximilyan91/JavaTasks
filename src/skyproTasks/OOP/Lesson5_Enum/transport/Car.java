package skyproTasks.OOP.Lesson5_Enum.transport;

import skyproTasks.OOP.Lesson5_Enum.driver.DriverB;

public class Car extends Transport<DriverB> implements Racing {

    private final BodyType bodyType;

    public Car(String brand, String model, Double engineVolume, DriverB driverB, BodyType bodyType) {
        super(brand, model, engineVolume, driverB);
        this.bodyType = bodyType;
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

    public BodyType getBodyType() {
        return bodyType;
    }

    public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        WAGOON("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");
        private final String bodyType;

        BodyType(String bodyType) {
            this.bodyType = bodyType;
        }

        public String getBodyType() {
            return bodyType;
        }

        @Override
        public String toString() {
            return "Тип кузова: "
                    + bodyType;
        }

    }
}

