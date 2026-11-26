package lesson1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- 1 ---");
        printThreeWords();

        System.out.println("\n--- 2 ---");
        checkSumSign();

        System.out.println("\n--- 3 ---");
        printColor();

        System.out.println("\n--- 4 ---");
        compareNumbers();

        System.out.println("\n--- 5 ---");
        System.out.println(isSumInRange(7, 8));   // true
        System.out.println(isSumInRange(15, 10)); // false

        System.out.println("\n--- 6 ---");
        printNumberSign(-5);
        printNumberSign(0);

        System.out.println("\n--- 7 ---");
        System.out.println(isNegative(-3)); // true
        System.out.println(isNegative(0));  // false

        System.out.println("\n--- 8 ---");
        printStringMultipleTimes("Привет, Java!", 3);

        System.out.println("\n--- 9 ---");
        System.out.println("2024: " + isLeapYear(2024)); // true
        System.out.println("1900: " + isLeapYear(1900)); // false
        System.out.println("2000: " + isLeapYear(2000)); // true

        System.out.println("\n--- 10 ---");
        invertArray();

        System.out.println("\n--- 11 ---");
        fillArrayUpTo100();

        System.out.println("\n--- 12 ---");
        multiplyLessThanSix();

        System.out.println("\n--- 13 ---");
        fillDiagonals(5);

        System.out.println("\n--- 14 ---");
        int[] customArr = createFilledArray(5, 42);
        System.out.println(Arrays.toString(customArr));
    }

    // 1. Печать трёх слов в столбец
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // 2. Проверка знака суммы двух чисел
    public static void checkSumSign() {
        int a = 10;
        int b = -15;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // 3. Определение цвета по значению
    public static void printColor() {
        int value = 55;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // 4. Сравнение двух чисел
    public static void compareNumbers() {
        int a = 7;
        int b = 12;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    // 5. Проверка суммы в диапазоне от 10 до 20 включительно
    public static boolean isSumInRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // 6. Печать знака числа (0 считается положительным)
    public static void printNumberSign(int number) {
        if (number >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    // 7. Проверка, является ли число отрицательным
    public static boolean isNegative(int number) {
        return number < 0;
    }

    // 8. Печать строки указанное количество раз
    public static void printStringMultipleTimes(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    // 9. Проверка високосного года
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // 10. Замена 0 на 1 и 1 на 0 в массиве
    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // 11. Заполнение массива длиной 100 значениями от 1 до 100
    public static void fillArrayUpTo100() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    // 12. Умножение чисел меньше 6 на 2
    public static void multiplyLessThanSix() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    // 13. Заполнение обеих диагоналей квадратного массива единицами
    public static void fillDiagonals(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i][i] = 1;                // главная диагональ

        }
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    // 14. Создание массива длиной len, заполненного значением initialValue
    public static int[] createFilledArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
