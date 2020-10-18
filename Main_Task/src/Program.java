import java.util.Scanner;

public class Program {

    /*Реализовать следующие программы:
    1. Приветствовать любого пользователя при вводе его имени через командную строку.
    2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
    3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
    4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
    5. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.*/

    public static void main(String[] args) {
        // task 1
        welcomeUser();

        // task 2
        displayDataInReverseOrder();

        // task 3
        displayRandomValues();

        // task 4
        outputResultOfCountingValues();

        // task 5
        displayNameOfMonth();
    }

    // 1. Приветствовать любого пользователя при вводе его имени через командную строку.
    private static void welcomeUser() {
        System.out.println("--------------- TASK 1 ---------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Welcome, " + name + "!");
    }

    // 2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
    private static void displayDataInReverseOrder() {
        System.out.println("--------------- TASK 2 ---------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter something: ");
        String line = scanner.nextLine();
        System.out.print("Output: ");
        for (int i = line.length() - 1; i >= 0; i--) {
            System.out.print(line.charAt(i));
        }
        System.out.println();
    }

    // 3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
    private static void displayRandomValues() {
        System.out.println("--------------- TASK 3 ---------------");
        int length = setLengthOfArray();
        int[] array = getArrayOfRandomValues(length);
        System.out.println("Output numbers with a new line transition: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.print("Output numbers without switching to a new line: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // 3.1. Метод возвращает значение переменной типа int, которое >= 0. Значение переменной будет задавать размер массива.
    private static int setLengthOfArray() {
        Scanner scanner = null;
        int amount = 0;
        while (true) {
            scanner = new Scanner(System.in);
            System.out.print("Set amount of random numbers: ");
            if (scanner.hasNextInt()) {
                amount = scanner.nextInt();
                if (amount >= 0) {
                    break;
                } else {
                    System.out.println("Input wrong data! Repeat please.");
                }
            } else {
                System.out.println("Input wrong data! Repeat please.");
            }
        }
        return amount;
    }

    // 3.2. Метод возвращает массив типа int, элементы которого инициализированы рандомными значениями в диапозоне [0; 100).
    private static int[] getArrayOfRandomValues(int length) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    // 4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
    private static void outputResultOfCountingValues() {
        System.out.println("--------------- TASK 4 ---------------");
        int length = setLengthOfArray();
        int[] array = getArrayOfIntegerValuesFromCommandLine(length);
        int sum = getSum(array);
        System.out.println("The sum of the numbers is: " + sum);
        int multi = getMultiply(array);
        System.out.println("Multiply of numbers is: " + multi);
    }

    // 4.1. Метод возвращает массив типа int, элементы которого инициализированы значениями из командной строки.
    private static int[] getArrayOfIntegerValuesFromCommandLine(int length) {
        Scanner scanner = null;
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            while (true) {
                System.out.print("Enter an integer value: ");
                scanner = new Scanner(System.in);
                if (scanner.hasNextInt()) {
                    array[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Input wrong data! Repeat please.");
                }
            }
        }
        return array;
    }

    // 4.2. Метод возвращает сумму значений всех элементов массива
    private static int getSum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    // 4.3. Метод возвращает произведение значений всех элементов массива
    private static int getMultiply(int[] array) {
        int multi = 1;
        for (int i : array) {
            multi *= i;
        }
        return multi;
    }

    // 5. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.
    private static void displayNameOfMonth() {
        System.out.println("--------------- TASK 5 ---------------");
        int monthValue = setMonthValue();
        String monthName = getNameOfMonth(monthValue);
        System.out.println("The month is: " + monthName);
    }

    // 5.1. Метод возвращает значение переменной типа int, которое > 0 && < 13.
    private static int setMonthValue() {
        Scanner scanner = null;
        int value = 0;
        while (true) {
            System.out.print("Set month value: ");
            scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value > 0 && value < 13) {
                    break;
                } else {
                    System.out.println("Input wrong data! Repeat please.");
                }
            } else {
                System.out.println("Input wrong data! Repeat please.");
            }
        }
        return value;
    }

    // 5.2. Метод возвращает строку с названием месяца
    private static String getNameOfMonth(int monthValue) {
        String monthName = "";
        switch (monthValue) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
        }
        return monthName;
    }
}
