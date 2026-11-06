package ru.mirea.kulikov.pr1.classes.rectangle;

/**
 * Клиент класса Rectangle: создаёт два прямоугольника и выводит
 * ширину, высоту, площадь и периметр каждого (в указанном порядке).
 *
 * @author Куликов М.М., группа УИБО-03-24
 */
public class TestRectangle {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        printRectangle("Прямоугольник 1", r1);
        printRectangle("Прямоугольник 2", r2);

        // Проверка безаргументного конструктора
        Rectangle r0 = new Rectangle();
        System.out.println("Безаргументный конструктор: " + r0);
    }

    /** Вспомогательный метод вывода характеристик прямоугольника */
    private static void printRectangle(String title, Rectangle r) {
        System.out.println(title + ":");
        System.out.printf("  ширина   = %.2f%n", r.getWidth());
        System.out.printf("  высота   = %.2f%n", r.getHeight());
        System.out.printf("  площадь  = %.2f%n", r.getArea());
        System.out.printf("  периметр = %.2f%n", r.getPerimeter());
    }
}
