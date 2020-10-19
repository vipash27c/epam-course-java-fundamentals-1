import java.util.Scanner;

public class Program {

/*1. Ввести n чисел с консоли.
2. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
3. Вывести числа в порядке возрастания (убывания) значений их длины.
4. Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.
5. Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.
6. Найти количество чисел, содержащих только четные цифры, а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.
7. Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.
8. Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.*/

    public static void main(String[] args) {
        // task 1
        int length = setAmountOfValues();
        
    }

    // 1. Ввести n чисел с консоли.
    private static int setAmountOfValues() {
        Scanner scanner = null;
        int n = 0;
        while (true) {
            scanner = new Scanner(System.in);
            System.out.print("Enter n numbers. n: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n >= 0) {
                    break;
                } else {
                    System.out.println("Input wrong data! Repeat please.");
                }
            } else {
                System.out.println("Input wrong data! Repeat please.");
            }
        }
        return n;
    }
}
