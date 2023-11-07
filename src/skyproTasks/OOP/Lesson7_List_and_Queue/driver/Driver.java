package skyproTasks.OOP.Lesson7_List_and_Queue.driver;

public abstract class Driver {

    private final String fullName;

    private boolean validLicense;

    private int experience;


    public Driver(String fullName, boolean validLicense, int experience) {
        this.fullName = fullName;
        setValidLicense(validLicense);
        this.experience = experience;
    }

    public abstract void startMoving();
    public abstract void stopMoving();
    public abstract void reFuel();

    public String getFullName() {
        return fullName;
    }

    public boolean isValidLicense() {
        return validLicense;
    }

    public void setValidLicense(boolean validLicense) {
        if (validLicense) {
            this.validLicense = true;
        } else {
            throw new IllegalArgumentException("Необходимо указать тип прав!");
        }


    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", validLicense=" + validLicense +
                ", experience=" + experience +
                '}';
    }
}
