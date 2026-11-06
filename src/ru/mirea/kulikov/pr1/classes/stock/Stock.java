package ru.mirea.kulikov.pr1.classes.stock;

/**
 * Класс Stock — акции компании (задание №2, часть 1).
 *
 * @author Куликов М.М., группа УИБО-03-24
 */
public class Stock {
    /** Обозначение (тикер) акций */
    private String symbol;
    /** Наименование акций */
    private String name;
    /** Стоимость акций на момент закрытия предыдущего дня */
    private double previousClosingPrice;
    /** Стоимость акций в настоящий момент */
    private double currentPrice;

    /** Конструктор: акции с указанными обозначением и наименованием */
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    /**
     * Возвращает процент изменения стоимости акций
     * с previousClosingPrice на currentPrice.
     * Если цена закрытия не задана (равна 0), возвращает 0.
     */
    public double getChangePercent() {
        if (previousClosingPrice == 0) {
            return 0;
        }
        return (currentPrice - previousClosingPrice) / previousClosingPrice * 100;
    }

    @Override
    public String toString() {
        return symbol + " (" + name + ")";
    }
}
