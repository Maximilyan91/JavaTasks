package skyproTasks.OOP.Lesson2_encapsulation.transport;

import java.time.LocalDate;

public class Car {


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

    private final String brand;
    private final String model;
    private final int yearOfProduction;
    private final String countryOfProduction;
    private final String bodyType;
    private final int capacity;
    private float engineVolume;
    private String color;
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
               Key key) {


        if (checkIncorrectData(brand)) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (checkIncorrectData(model)) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (engineVolume <= 0f) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }

        if (checkIncorrectData(color)) {
            this.color = "white";
        } else {
            this.color = color;
        }

        if (yearOfProduction >= 0) {
            this.yearOfProduction = 2000;
        } else {
            this.yearOfProduction = yearOfProduction;
        }

        if (checkIncorrectData(countryOfProduction)) {
            this.countryOfProduction = "default";
        } else {
            this.countryOfProduction = countryOfProduction;
        }

        if (checkIncorrectData(gearBox)) {
            this.gearBox = "manual gearbox";
        } else {
            this.gearBox = gearBox;
        }

        if (checkIncorrectData(bodyType)) {
            this.bodyType = "sedan";
        } else {
            this.bodyType = bodyType;
        }

        if (checkIncorrectData(regNumber)) {
            this.regNumber = "a000aa00";
        } else {
            this.regNumber = regNumber;
        }

        if (capacity <= 0) {
            this.capacity = 5;
        } else {
            this.capacity = capacity;
        }

        this.winterTires = changeTiresForSeason();

        setKey(key);
    }

    private boolean checkIncorrectData(String string) {
        return string == null || string.isEmpty() || string.isBlank();
    }

    public boolean changeTiresForSeason() {
        int month = LocalDate.now().getMonth().getValue();
        return month >= 10 || month <= 3;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getCountryOfProduction() {
        return countryOfProduction;
    }

    public String getGearBox() {
        return gearBox;
    }

    public void setGearBox(String gearBox) {
        this.gearBox = gearBox;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
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

    public Car.Key getKey() {
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
        return "Автомобиль: " + brand + " " + model +
                "\nГод выпуска: " + yearOfProduction +
                "\nЦвет: " + color +
                "\nОбъем двигателя: " + engineVolume + " л." +
                "\nСтрана производства: " + countryOfProduction +
                "\nКоробка передач: " + gearBox +
                "\nКузов: " + bodyType +
                "\nРег. номер: " + regNumber +
                "\nВместимость пассажиров: " + capacity +
                "\nЗимняя резина: " + winterTires +
                "\n" + key;

    }
}
