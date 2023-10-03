package skyproTasks.primitives.CourseWork1.MiddleLevel;

public class Coursework {

    private static final Employee[] employees = {
            new Employee("Андрей Бенедиктович Фарс", 10000, 1),
            new Employee("Сюзанна Калитковна Блеск", 20000, 2),
            new Employee("Борис Илларионович Пупкин", 30000, 3),
            new Employee("Джони Савельевич Подливкин", 10000, 2),
            null
    };

    public static void printAllEmpls() {
        for (Employee empl : employees) {
            System.out.println(empl);
        }
    }

    public static int allSalaries() {
        int sum = 0;
        for (Employee empl : employees) {
            if (empl != null) {
                sum += empl.getSalary();
            }
        }
        return sum;
    }

    public static Employee findEmplWithMinSalary() {
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

    public static Employee findEmplWithMaxSalary() {
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

    public static double averageSalary() {
        int count = 0;
        for (Employee empl : employees) {
            if (empl != null) {
                count++;
            }
        }
        return (double) allSalaries() / count;
    }

    public static void getAllNames() {
        for (Employee empl : employees) {
            if (empl != null) {
                System.out.println(empl.getName());
            }
        }
    }

    /**
     * Повышенная сложность
     */


    public static void indexingSalary(int percent) {
        double dividedPercent = (double) percent / 100;
        for (Employee empl : employees) {
            if (empl != null) {
                double index = empl.getSalary() * dividedPercent;
                empl.setSalary(empl.getSalary() + (int) index);
            }
        }
    }

    public static Employee findEmplWithMinSalaryOfDepartment(int department) {
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

    public static Employee findEmplWithMaxSalaryOfDepartment(int department) {
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

    public static double averageSalaryOfDepartment(int department) {
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

    public static void indexingSalaryofDepartment(int department, int percent) {
        double dividedPercent = (double) percent / 100;
        for (Employee empl : employees) {
            if (empl != null && empl.getDepartment() == department) {
                double index = empl.getSalary() * dividedPercent;
                empl.setSalary(empl.getSalary() + (int) index);
            }
        }
    }

    public static void printAllEmplsOfDepartment(int department) {
        for (Employee empl : employees) {
            if (empl != null && department == empl.getDepartment()) {
                System.out.println("ФИО сотрудника - " + empl.getName() +
                        ", Зарплата - " + empl.getSalary() +
                        ", ID - " + empl.getId());
            }
        }
    }

    public static void printLowerSalaryEmpls(int valueOfSalary) {
        System.out.println("Сотрудники с зарплатой меньше указанной: ");
        for (Employee empl : employees) {
            if (empl != null && empl.getSalary() < valueOfSalary) {
                System.out.println("ID - " + empl.getId() +
                        ", ФИО сотрудника - " + empl.getName() +
                        ", Зарплата - " + empl.getSalary());
            }
        }
    }

    public static void printHigherSalaryEmpls(int valueOfSalary) {
        System.out.println("Сотрудники с зарплатой выше или равной указанной: ");
        int count = 0;
        for (Employee empl : employees) {
            if (empl != null && empl.getSalary() >= valueOfSalary) {
                ++count;
                System.out.println("ID - " + empl.getId() +
                        ", ФИО сотрудника - " + empl.getName() +
                        ", Зарплата - " + empl.getSalary());
            }
        }
    }
}

