import java.time.LocalDate;

public class Main {
    public static void main (String[] args) {
        task1();
        task2();
        task3();
    }

    public static void checkForLeapYear (int year) {

        if ((year >= 1582 && year % 4 == 0 && year % 100 != 0)||(year >= 1582 && year % 400 == 0)) {
            System.out.println(year + "  год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }

    }

    public static void task1 () {
        checkForLeapYear(2026);
    }

    public static void checkMobilePhone (int operationSystem, int yearOfManufacture) {

        int currentYear = LocalDate.now().getYear();
        if (operationSystem == 1 && yearOfManufacture == currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (operationSystem == 0 && yearOfManufacture == currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (operationSystem == 1 && yearOfManufacture < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (operationSystem == 0 && yearOfManufacture < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Для вашего устройства нет подходящей версии");
        }

    }

    public static void task2 () {
        checkMobilePhone(1, 2003);
    }

    public static int calculateDeliveryTime (int distance) {

        int deliveryDays = 0;
        if (distance <= 20) {
            deliveryDays++;
        } else if (distance <= 60) {
            deliveryDays+=2;
        } else if (distance <= 100) {
            deliveryDays+=3;
        }
        return deliveryDays;

    }

    public static void task3 () {
        int distance = 95;
        int deliveryDays = calculateDeliveryTime(distance);
        if (deliveryDays != 0) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Свыше 100 км доставка не осуществляется");
        }
    }

}