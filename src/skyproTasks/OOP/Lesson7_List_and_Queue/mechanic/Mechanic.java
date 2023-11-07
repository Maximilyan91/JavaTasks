package skyproTasks.OOP.Lesson7_List_and_Queue.mechanic;

import skyproTasks.OOP.Lesson7_List_and_Queue.transport.Transport;

public class Mechanic<T extends Transport<?>> {

    private final String name;

    private final String surName;

    private String workCompany;


    public Mechanic(String name, String surName, String workCompany) {
        this.name = name;
        this.surName = surName;
        this.workCompany = workCompany;
    }

    public void doService(T... transports) {
        for (T transport : transports) {
            System.out.println("Механик " + getSurName()
                    + " " + getName()
                    + " провел техобслуживание автомобиля "
                    + transport.getBrand()
                    + " " + transport.getModel());
        }
    }

    public void fixTheCar(T... transports) {
        for (T transport : transports) {
            System.out.println("Механик " + getSurName()
                    + " " + getName()
                    + " провел техобслуживание автомобиля "
                    + transport.getBrand()
                    + " " + transport.getModel());

        }
    }


    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getWorkCompany() {
        return workCompany;
    }

    public void setWorkCompany(String workCompany) {
        this.workCompany = workCompany;
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", workCompany='" + workCompany + '\'' +
                '}';
    }
}
