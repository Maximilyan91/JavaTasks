package skyproTasks.primitives.CourseWork1.HighLevel;

public class EmployeeBook {

    private static final int EMPLOYEE_SIZE = 10;

    private final Employee[] employees = new Employee[EMPLOYEE_SIZE];

    public void printAllEmpls() {
        for (Employee empl : employees) {
            System.out.println(empl);
        }
    }

    public int allSalaries() {
        int sum = 0;
        for (Employee empl : employees) {
            if (empl != null) {
                sum += empl.getSalary();
            }
        }
        return sum;
    }

    public Employee findEmplWithMinSalary() {
        int minSalary = Integer.MAX_VALUE;
        Employee minSalaryEmpl = employees[0];
        for (Employee empl : employees) {
            if (empl != null && empl.getSalary() < minSalary) {
                minSalary = empl.getSalary();
                minSalaryEmpl = empl;
            }
        }
        return minSalaryEmpl;
    }

    public Employee findEmplWithMaxSalary() {
        int maxSalary = 0;
        Employee maxSalaryEmpl = employees[0];
        for (Employee empl : employees) {
            if (empl != null && empl.getSalary() > maxSalary) {
                maxSalary = empl.getSalary();
                maxSalaryEmpl = empl;
            }
        }
        return maxSalaryEmpl;
    }

    public double averageSalary() {
        int count = 0;
        for (Employee empl : employees) {
            if (empl != null) {
                count++;
            }
        }
        return (double) allSalaries() / count;
    }

    public void getAllNames() {
        for (Employee empl : employees) {
            if (empl != null) {
                System.out.println(empl.getFullName());
            }
        }
    }

    /**
     * Повышенная сложность
     */


    public void indexingSalary(int percent) {
        double dividedPercent = (double) percent / 100;
        for (Employee empl : employees) {
            if (empl != null) {
                double index = empl.getSalary() * dividedPercent;
                empl.setSalary(empl.getSalary() + (int) index);
            }
        }
    }

    public Employee findEmplWithMinSalaryOfDepartment(int department) {
        int minSalary = Integer.MAX_VALUE;
        Employee minSalaryEmpl = employees[0];
        for (Employee empl : employees) {
            if (empl != null && empl.getSalary() < minSalary && department == empl.getDepartment()) {
                minSalary = empl.getSalary();
                minSalaryEmpl = empl;
            }
        }
        return minSalaryEmpl;
    }

    public Employee findEmplWithMaxSalaryOfDepartment(int department) {
        int maxSalary = 0;
        Employee maxSalaryEmpl = employees[0];
        for (Employee empl : employees) {
            if (empl != null && department == empl.getDepartment() && empl.getSalary() > maxSalary) {
                maxSalary = empl.getSalary();
                maxSalaryEmpl = empl;
            }
        }
        return maxSalaryEmpl;
    }

    public double averageSalaryOfDepartment(int department) {
        int count = 0;
        int sum = 0;
        for (Employee empl : employees) {
            if (empl != null && department == empl.getDepartment()) {
                sum += empl.getSalary();
                ++count;
            }
        }
        return (double) sum / count;
    }

    public void indexingSalaryofDepartment(int department, int percent) {
        double dividedPercent = (double) percent / 100;
        for (Employee empl : employees) {
            if (empl != null && empl.getDepartment() == department) {
                double index = empl.getSalary() * dividedPercent;
                empl.setSalary(empl.getSalary() + (int) index);
            }
        }
    }

    public void printAllEmplsOfDepartment(int department) {
        for (Employee empl : employees) {
            if (empl != null && department == empl.getDepartment()) {
                System.out.println("ФИО сотрудника - " + empl.getFullName() +
                        ", Зарплата - " + empl.getSalary() +
                        ", ID - " + empl.getId());
            }
        }
    }

    public void printLowerSalaryEmpls(int valueOfSalary) {
        System.out.println("Сотрудники с зарплатой меньше указанной: ");
        for (Employee empl : employees) {
            if (empl != null && empl.getSalary() < valueOfSalary) {
                System.out.println("ID - " + empl.getId() +
                        ", ФИО сотрудника - " + empl.getFullName() +
                        ", Зарплата - " + empl.getSalary());
            }
        }
    }

    public void printHigherSalaryEmpls(int valueOfSalary) {
        System.out.println("Сотрудники с зарплатой выше или равной указанной: ");
        int count = 0;
        for (Employee empl : employees) {
            if (empl != null && empl.getSalary() >= valueOfSalary) {
                ++count;
                System.out.println("ID - " + empl.getId() +
                        ", ФИО сотрудника - " + empl.getFullName() +
                        ", Зарплата - " + empl.getSalary());
            }
        }
    }

    /**
     * Сложный уровень
     **/

    public int checkEmptyIndex() {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void addEmployee(String fullName, int salary, int department) {
        int index = checkEmptyIndex();
        if (index == -1) {
            System.out.println("Хранилище заполнено");
        } else {
            employees[index] = new Employee(fullName, salary, department);
        }
    }

    public void deleteEmployeeByName(String fullName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getFullName().equals(fullName)) {
                employees[i] = null;
                System.out.println("Сотрудник " + fullName + " удален");
            } else {
                System.out.println("Сотрудник " + fullName + " не найден");
            }
        }
    }

    public void deleteEmployeeById(int id) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getId() == id) {
                employees[i] = null;
                System.out.println("Сотрудник с номером ID - " + id + " удален");
            } else {
                System.out.println("Сотрудник с номером ID - " + id + " не найден");
            }
        }
    }

    public void changeSalaryByName(String fullName, int newSalary) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getFullName().equals(fullName)) {
                employees[i].setSalary(newSalary);
                System.out.println("Зарплата сотруднику " + fullName + " изменена на " + newSalary);
            } else {
                System.out.println("Сотрудник с именем " + fullName + " не найден");
            }
        }
    }

    public void changeDepartmentByName(String fullName, int newDept) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getFullName().equals(fullName)) {
                employees[i].setDepartment(newDept);
                System.out.println("Отдел сотрудника " + fullName + " изменена на " + newDept);
            } else {
                System.out.println("Сотрудник с именем " + fullName + " не найден");
            }
        }
    }
}

