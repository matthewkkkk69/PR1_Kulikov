package ru.mirea.kulikov.pr1.basics;

/**
 * Практическая работа №1, задание 6.
 * Вывод первых 10 чисел гармонического ряда 1 + 1/2 + 1/3 + ... + 1/n
 * с форматированием вывода (System.out.printf).
 * Для каждого n выводится член ряда 1/n и частичная сумма H(n).
 *
 * @author Куликов М.М., группа УИБО-03-24
 */
public class HarmonicSeries {

    /** Количество выводимых членов ряда */
    public static final int COUNT = 10;

    public static void main(String[] args) {
        System.out.println("Первые " + COUNT + " чисел гармонического ряда");
        System.out.println("+----+--------+----------+------------+");
        System.out.printf("| %-2s | %-6s | %-8s | %-10s |%n",
                "n", "1/n", "значение", "сумма H(n)");
        System.out.println("+----+--------+----------+------------+");

        double sum = 0.0;
        for (int n = 1; n <= COUNT; n++) {
            double term = 1.0 / n;   // 1.0, чтобы деление было вещественным
            sum += term;
            System.out.printf("| %2d | %6s | %8.4f | %10.4f |%n",
                    n, "1/" + n, term, sum);
        }
        System.out.println("+----+--------+----------+------------+");
    }
}
