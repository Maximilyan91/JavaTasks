package skyproTasks.primitives.CourseWork1.HighLevel;

public class Employee {

    private static int count = 1;
    private final int id;
    private String fullName;
    private int salary;
    private int department;

    public Employee(String fullName, int salary, int department) {
        this.fullName = fullName;
        this.salary = salary;
        this.department = department;
        this.id = count++;

    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ФИО сотрудника - " + fullName +
                ", Департамент - " + department +
                ", Зарплата - " + salary +
                ", ID - " + id;
    }
}
