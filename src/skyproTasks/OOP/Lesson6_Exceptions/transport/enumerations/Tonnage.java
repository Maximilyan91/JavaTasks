package skyproTasks.OOP.Lesson6_Exceptions.transport.enumerations;

public enum Tonnage {
    N1(0, 3.5f), N2(3.5f, 12), N3(12, 0);

    private final float minWeight;
    private final float maxWeight;

    Tonnage(float minWeight, float maxWeight) {
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString() {
        if (minWeight == 0) {
            return "Грузоподъемность до " + maxWeight + " тонн";
        } else if (maxWeight == 0) {
            return "Грузоподъемность свыше " + minWeight + " тонн";
        } else {
            return "Грузоподъемность свыше " + minWeight + " тонн. До " + maxWeight + " тонн";
        }


    }
}
