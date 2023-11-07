package skyproTasks.OOP.Lesson7_List_and_Queue.driver;

public class DriverС extends Driver {
    public DriverС(String fullName, boolean validLicense, int experience) {
        super(fullName, validLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println(" Водитель категории С " +  getFullName() + " начал движение");
    }

    @Override
    public void stopMoving() {
        System.out.println(" Водитель категории С " +  getFullName() + " закончил движение");

    }

    @Override
    public void reFuel() {
        System.out.println(" Водитель категории С " +  getFullName() + " заправил автомобиль");

    }
}
