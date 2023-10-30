package skyproTasks.OOP.Lesson6_Exceptions.driver;

public class DriverB extends Driver {
    public DriverB(String fullName, boolean validLicense, int experience) {
        super(fullName, validLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println(" Водитель категории В " +  getFullName() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println(" Водитель категории В " +  getFullName() + " закончил движение");

    }

    @Override
    public void reFuel() {
        System.out.println(" Водитель категории В " +  getFullName() + " заправил автомобиль");

    }
}
