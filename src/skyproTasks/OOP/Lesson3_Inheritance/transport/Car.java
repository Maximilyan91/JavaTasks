package skyproTasks.OOP.Lesson3_Inheritance.transport;

import java.time.LocalDate;

public class Car extends Transport {


    public static class Key {

        private final boolean remoteStartEngine;
        private final boolean keylessAccess;

        public Key(boolean remoteStartEngine, boolean keylessAccess) {
            this.remoteStartEngine = remoteStartEngine;
            this.keylessAccess = keylessAccess;
        }

        public boolean isRemoteStartEngine() {
            return remoteStartEngine;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return (remoteStartEngine ? " с удаленным запуском двигателя ":" Без удаленного запуска двигателя ") +
             (keylessAccess ? " бесключевой доступ ":" бесключевой доступ отсутствует ");
        }
    }
    private final String bodyType;
    private final int capacity;
    private float engineVolume;
    private String gearBox;
    private String regNumber;
    private boolean winterTires;
    private  Key key;



    public Car(String brand,
               String model,
               float engineVolume,
               String color,
               int yearOfProduction,
               String countryOfProduction,
               String gearBox,
               String bodyType,
               String regNumber,
               int capacity,
               Key key,
               int maxSpeed) {

        super(brand, model, yearOfProduction, countryOfProduction, color, maxSpeed);

        setEngineVolume(engineVolume);
        setGearBox(gearBox);

        if (checkIncorrectData(bodyType)) {
            this.bodyType = "sedan";
        } else {
            this.bodyType = bodyType;
        }

        setRegNumber(regNumber);

        if (capacity <= 0) {
            this.capacity = 5;
        } else {
            this.capacity = capacity;
        }

        this.winterTires = changeTiresForSeason();

        setKey(key);
    }
    public Car(String brand,
               String model,
               float engineVolume,
               String color,
               int yearOfProduction,
               String countryOfProduction,
               String gearBox,
               String bodyType,
               String regNumber,
               int capacity,
               Key key) {
        this(brand,
                model,
                engineVolume,
                color,
                yearOfProduction,
                countryOfProduction,
                gearBox,
                bodyType,
                regNumber,
                capacity,
                key,
                0);
    }

    public boolean changeTiresForSeason() {
        int month = LocalDate.now().getMonth().getValue();
        return month >= 10 || month <= 3;
    }


    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        if (engineVolume <= 0f) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {
        if (checkIncorrectData(gearBox)) {
            this.gearBox = "manual gearbox";
        } else {
            this.gearBox = gearBox;
        }
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (checkIncorrectData(regNumber)) {
            this.regNumber = "a000aa00";
        } else {
            this.regNumber = regNumber;
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isWinterTires() {
        return winterTires;
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = winterTires;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false, false);
        }
        this.key = key;
    }

    @Override
    public String toString() {
        return "Автомобиль: " + getBrand() + " " + getModel() +
                "\nГод выпуска: " + getYearOfProduction() +
                "\nЦвет: " + getColor() +
                "\nОбъем двигателя: " + engineVolume + " л." +
                "\nСтрана производства: " + getCountryOfProduction() +
                "\nКоробка передач: " + gearBox +
                "\nКузов: " + bodyType +
                "\nРег. номер: " + regNumber +
                "\nВместимость пассажиров: " + capacity +
                "\nЗимняя резина: " + winterTires +
                "\n" + key +
                "\nМаксимальная скорость: " + getMaxSpeed();

    }
}
