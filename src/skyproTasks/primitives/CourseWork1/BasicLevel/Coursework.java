package skyproTasks.primitives.CourseWork1.BasicLevel;

public class Coursework {

    private static final Employee[] employees = {
            new Employee("Андрей Бенедиктович Фарс", 10000, 1),
            new Employee("Сюзанна Калитковна Блеск", 3000, 2),
            new Employee("Борис Илларионович Пупкин", 8000, 3),
            new Employee("Джони Савельевич Подливкин", 2000, 2),
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

        return (double) allSalaries() / employees.length;
    }

    public static void getAllNames() {
        for (Employee empl : employees) {
            if (empl != null) {
                System.out.println(empl.getName());
            }
        }
    }
}
