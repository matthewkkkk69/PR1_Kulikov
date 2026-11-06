package ru.mirea.kulikov.pr1.basics;

/**
 * Практическая работа №1, задание 3.
 * Массив создаётся с помощью инициализации (как в Си),
 * в цикле for считаются сумма и среднее арифметическое элементов.
 *
 * @author Куликов М.М., группа УИБО-03-24
 */
public class ArraySumFor {

    public static void main(String[] args) {
        // Инициализация массива списком значений, как в языке Си
        int[] numbers = {12, -5, 34, 7, 0, 19, 23, -8, 41, 15};

        int sum = 0;
        System.out.print("Элементы массива: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            sum += numbers[i];
        }
        System.out.println();

        // Приводим сумму к double, чтобы деление не было целочисленным
        double average = (double) sum / numbers.length;

        System.out.println("Количество элементов: " + numbers.length);
        System.out.println("Сумма элементов: " + sum);
        System.out.printf("Среднее арифметическое: %.2f%n", average);
    }
}
