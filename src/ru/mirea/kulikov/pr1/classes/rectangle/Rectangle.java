package ru.mirea.kulikov.pr1.classes.rectangle;

/**
 * Класс Rectangle — прямоугольник (задание №1, часть 1).
 * Поля данных закрыты (private), доступ к ним — через геттеры и сеттеры.
 *
 * @author Куликов М.М., группа УИБО-03-24
 */
public class Rectangle {
    /** Ширина прямоугольника, по умолчанию -1 */
    private double width = -1;
    /** Высота прямоугольника, по умолчанию -1 */
    private double height = -1;

    /** Безаргументный конструктор: значения по умолчанию (-1, -1) */
    public Rectangle() {
    }

    /** Конструктор: прямоугольник с указанными шириной и высотой */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /** Возвращает площадь прямоугольника */
    public double getArea() {
        return width * height;
    }

    /** Возвращает периметр прямоугольника */
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Rectangle[width=" + width + ", height=" + height + "]";
    }
}
