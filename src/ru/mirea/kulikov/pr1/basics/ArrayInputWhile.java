package ru.mirea.kulikov.pr1.basics;

import java.util.Scanner;

/**
 * Практическая работа №1, задание 4.
 * Массив вводится пользователем с клавиатуры; сумма элементов
 * считается циклами do while и while; находятся максимальный
 * и минимальный элементы.
 *
 * @author Куликов М.М., группа УИБО-03-24
 */
public class ArrayInputWhile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ввод размера массива с проверкой (hasNextInt)
        int n = 0;
        while (n <= 0) {
            System.out.print("Введите количество элементов массива (n > 0): ");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n <= 0) {
                    System.out.println("Количество должно быть положительным.");
                }
            } else {
                System.out.println("Вы ввели не целое число.");
                sc.next(); // пропускаем некорректный ввод
            }
        }

        int[] arr = new int[n];
        int k = 0;
        while (k < n) {
            System.out.print("Введите элемент [" + k + "]: ");
            if (sc.hasNextInt()) {
                arr[k] = sc.nextInt();
                k++;
            } else {
                System.out.println("Вы ввели не целое число, повторите ввод.");
                sc.next();
            }
        }

        // 1) Сумма с помощью цикла do while
        int sumDoWhile = 0;
        int i = 0;
        do {
            sumDoWhile += arr[i];
            i++;
        } while (i < arr.length);

        // 2) Сумма с помощью цикла while; одновременно ищем max и min
        int sumWhile = 0;
        int max = arr[0];
        int min = arr[0];
        int j = 0;
        while (j < arr.length) {
            sumWhile += arr[j];
            if (arr[j] > max) {
                max = arr[j];
            }
            if (arr[j] < min) {
                min = arr[j];
            }
            j++;
        }

        System.out.print("Введённый массив: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("Сумма (цикл do while): " + sumDoWhile);
        System.out.println("Сумма (цикл while):    " + sumWhile);
        System.out.println("Максимальный элемент:  " + max);
        System.out.println("Минимальный элемент:   " + min);

        sc.close();
    }
}
