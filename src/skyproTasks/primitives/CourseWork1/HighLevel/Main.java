package skyproTasks.primitives.CourseWork1.HighLevel;

public class Main {
    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee("Андрей Бенедиктович Фарс", 10000, 1);
        employeeBook.addEmployee("Сюзанна Калитковна Блеск", 3000, 2);
        employeeBook.addEmployee("Борис Илларионович Пупкин", 8000, 3);
        employeeBook.addEmployee("Джони Савельевич Подливкин", 2000, 2);
        employeeBook.addEmployee("Сосик Витальевич Шишкин", 1222, 2);

        employeeBook.printAllEmpls();
        System.out.println();
        employeeBook.deleteEmployeeById(5);

        employeeBook.printAllEmpls();
        System.out.println();
        employeeBook.addEmployee("Андрей Бенедиктович Фарс", 10000, 1);

        employeeBook.printAllEmpls();
        System.out.println();
        employeeBook.changeSalaryByName("Борис Илларионович Пупкин", 3500);
        employeeBook.changeDepartmentByName("Джони Савельевич Подливкин", 5);
        employeeBook.printAllEmpls();
    }

}




