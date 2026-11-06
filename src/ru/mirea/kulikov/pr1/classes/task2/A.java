package ru.mirea.kulikov.pr1.classes.task2;

/**
 * Практическая работа 1 «Классы», задание 2.
 * Программа выведет false: поле x типа boolean является полем данных
 * (переменной экземпляра) и при создании объекта получает значение
 * по умолчанию false. Явный конструктор не объявлен, поэтому
 * используется конструктор по умолчанию.
 *
 * @author Куликов М.М., группа УИБО-03-24
 */
public class A {
    boolean x;

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.x);
    }
}
