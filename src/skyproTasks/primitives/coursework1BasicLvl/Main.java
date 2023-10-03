package skyproTasks.primitives.coursework1BasicLvl;

public class Main {
    public static void main(String[] args) {
        Coursework.printAllEmpls();
        System.out.println("Сумма затрат на зарплаты составляет: " + Coursework.allSalaries());
        System.out.println("Сотрудник с минимальной зарплатой: " + Coursework.findEmplWithMinSalary());
        System.out.println("Сотрудник с максимальной зарплатой: " + Coursework.findEmplWithMaxSalary());
        System.out.println("Средняя зарплата по всем сотрудникам: " + Coursework.averageSalary());
        Coursework.getAllNames();
        }
    }



