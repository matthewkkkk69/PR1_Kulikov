package ru.mirea.kulikov.pr1.classes.task1;

/**
 * Клиент класса A (задание 1).
 * Класс вынесен в отдельный файл TestA.java: в одном файле может быть
 * только один public-класс, и его имя должно совпадать с именем файла.
 *
 * @author Куликов М.М., группа УИБО-03-24
 */
class TestA {
    public static void main(String[] args) {
        A a = new A();              // теперь компилируется: есть конструктор A()
        a.print();
        System.out.println();       // print() не переводит строку

        A b = new A("Привет, Java!"); // вызов конструктора A(String)
        b.print();
        System.out.println();
    }
}
