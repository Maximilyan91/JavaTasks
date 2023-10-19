package skyproTasks.OOP.Lesson5_Enum.driver;

public class DriverD extends Driver {
    public DriverD(String fullName, boolean validLicense, int experience) {
        super(fullName, validLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println(" Водитель категории D " +  getFullName() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println(" Водитель категории D " +  getFullName() + " закончил движение");

    }

    @Override
    public void reFuel() {
        System.out.println(" Водитель категории D " +  getFullName() + " заправил автомобиль");

    }
}
