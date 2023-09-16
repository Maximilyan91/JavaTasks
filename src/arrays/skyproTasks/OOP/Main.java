package arrays.skyproTasks.OOP;

public class Main {

        public static void main (String[] args){

            Car ladaGranta = new Car("Lada", "Granta",
                    1.7f, "Yellow", 2015, "Russia");
            System.out.println(ladaGranta + "\n");

            Car audiA8 = new Car("Audi", "A8 50 L TDI quattro",
                    3.0f, "Black", 2020, "Germany");
            System.out.println(audiA8 + "\n");

            Car bmwZ8 = new Car("BMW", "Z8",
                    3.0f, "Black", 2021, "Germany");
            System.out.println(bmwZ8 + "\n");

            Car kiaSportage = new Car("Kia", "Sportage",
                    2.4f, "Red", 2018, "South Korea");
            System.out.println(kiaSportage + "\n");

            Car hyundaiAvante = new Car("Hyundai", "Avante",
                    1.6f, "Orange", 2016, "South Korea");
            System.out.println(hyundaiAvante + "\n");

            Car testCar = new Car("", "Avante",
                    -2, "", 0, "");
            System.out.println(testCar + "\n");
        }



    }

