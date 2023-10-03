package skyproTasks.primitives.coursework1BasicLvl;

public class Employee {

    private static int count;
    private final int id;
    private String name;
    private int salary;
    private int department;

    public Employee(String name, int salary, int department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        id = ++count;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "ФИО сотрудника - " + name +
                ", Департамент - " + department +
                ", Зарплата - " + salary +
                ", ID - " + id;
    }
}
