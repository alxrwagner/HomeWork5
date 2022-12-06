import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1(){
        System.out.println("Задача № 1");

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String space = " ";
        String fullName = firstName + space + middleName + space + lastName;

        System.out.println("ФИО сотрудника: " + fullName);
    }

    public static void task2(){
        System.out.println("Задача № 2");

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String space = " ";
        String fullName = firstName + space + middleName + space + lastName;

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());
    }

    public static void task3(){
        System.out.println("Задача № 3");

        String fullName = "Иванов Семён Семёнович";

        System.out.println("Данные ФИО сотрудника — " + fullName.replace("ё", "е"));
    }

    public static void task4(){
        System.out.println("Задача № 4");
        Scanner scanner = new Scanner(System.in);

        String userName = scanner.next();
        String welcome = "Hello, ";

        System.out.println(welcome + userName);
    }

    public static void task5(){
        System.out.println("Задача № 5");
        Scanner scanner = new Scanner(System.in);

        int userInput = scanner.nextInt();

        System.out.println("Температура воздуха сегодня: " + userInput + " градусов");
    }

    public static void task6(){
        System.out.println("Задача № 6");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int day = scanner.nextInt();
        System.out.print("Введите месяц: ");
        int month = scanner.nextInt();
        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        System.out.println(day + ":" + month + ":" + year + ":");
    }

    public static void task7(){
        System.out.println("Задача № 7");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя Ваше: ");
        String fullName = scanner.nextLine();
        System.out.println("Введите имя Вашего помощника: ");
        String nameAssistant = scanner.nextLine();
        System.out.println("Введите колличество сообщений : ");
        int amountLetter = scanner.nextInt();

        System.out.println("Привет, " + fullName + "! Это твой помощник " + nameAssistant + ".\n" +
                "\n" +
                "У тебя " + amountLetter + " новых писем");
    }
}