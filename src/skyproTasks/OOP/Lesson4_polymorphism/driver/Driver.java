package skyproTasks.OOP.Lesson4_polymorphism.driver;

public class Driver {

    private String fullName;

    private boolean validLicense;

    private String experience;


    public Driver(String fullName, boolean validLicense, String experience) {
        this.fullName = fullName;
        this.validLicense = validLicense;
        this.experience = experience;
    }

    public String getFullName() {
        return fullName;
    }


    public boolean isValidLicense() {
        return validLicense;
    }

    public void setValidLicense(boolean validLicense) {
        this.validLicense = validLicense;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }
}
