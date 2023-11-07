package skyproTasks.OOP.Lesson7_List_and_Queue.transport.enumeration;

public enum Capacity {
    VERY_SMALL(0, 10),
    SMALL(0, 25),
    MIDDLE(40, 50),
    HIGH(60, 80),
    VERY_HIGH(100, 120);

    private final int lowerBound;
    private final int upperBound;

    Capacity(int lowerBound, int upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public String toString() {
        return lowerBound == 0 ?
                "Вместимость до " + upperBound + " мест."
                : "Вместимость от - " + lowerBound + " мест, до " + upperBound + " мест";
    }
}
