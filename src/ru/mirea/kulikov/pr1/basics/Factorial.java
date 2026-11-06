package ru.mirea.kulikov.pr1.basics;

import java.util.Scanner;

/**
 * Практическая работа №1, задание 7.
 * Вычисление факториала числа с помощью статического метода класса
 * (используется цикл for) и проверка работы метода.
 *
 * @author Куликов М.М., группа УИБО-03-24
 */
public class Factorial {

    /** Максимальное n, для которого n! помещается в тип long */
    public static final int MAX_N = 20;

    /**
     * Вычисляет n! = 1 * 2 * ... * n.
     *
     * @param n целое число от 0 до 20
     * @return факториал числа n (0! = 1)
     * @throws IllegalArgumentException если n < 0 или n > 20
     */
    public static long factorial(int n) {
        if (n < 0 || n > MAX_N) {
            throw new IllegalArgumentException(
                    "Факториал вычисляется для 0 <= n <= " + MAX_N
                    + ", получено: " + n);
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        // 1. Проверка метода на известных значениях
        int[] tests = {0, 1, 5, 10, 20};
        long[] expected = {1L, 1L, 120L, 3628800L, 2432902008176640000L};

        System.out.println("Проверка метода factorial():");
        for (int i = 0; i < tests.length; i++) {
            long actual = factorial(tests[i]);
            String status = (actual == expected[i]) ? "OK" : "ОШИБКА";
            System.out.printf("%2d! = %-20d ожидалось %-20d %s%n",
                    tests[i], actual, expected[i], status);
        }

        // 2. Проверка обработки недопустимого значения
        try {
            factorial(-3);
        } catch (IllegalArgumentException e) {
            System.out.println("factorial(-3): " + e.getMessage());
        }

        // 3. Вычисление факториала числа, введённого с клавиатуры
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите целое число от 0 до " + MAX_N + ": ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            if (n >= 0 && n <= MAX_N) {
                System.out.println(n + "! = " + factorial(n));
            } else {
                System.out.println("Число вне допустимого диапазона.");
            }
        } else {
            System.out.println("Вы ввели не целое число");
        }
        sc.close();
    }
}
