package ru.mirea.kulikov.pr1.basics;

/**
 * Практическая работа №1, задание 5.
 * Вывод на экран аргументов командной строки в цикле for.
 * Аргументы задаются в IntelliJ IDEA:
 *   Run -> Edit Configurations -> Program arguments,
 * либо при запуске из консоли:
 *   java ru.mirea.kulikov.pr1.basics.CommandLineArgs a b c
 *
 * @author Куликов М.М., группа УИБО-03-24
 */
public class CommandLineArgs {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Аргументы командной строки не переданы.");
            return;
        }
        System.out.println("Количество аргументов: " + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }
}
