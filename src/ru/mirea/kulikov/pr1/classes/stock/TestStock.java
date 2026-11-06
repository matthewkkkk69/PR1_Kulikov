package ru.mirea.kulikov.pr1.classes.stock;

/**
 * Клиент класса Stock: акции SBER «ПАО Сбербанк»,
 * цена закрытия 281.50, текущая цена 282.87.
 *
 * @author Куликов М.М., группа УИБО-03-24
 */
public class TestStock {

    public static void main(String[] args) {
        Stock stock = new Stock("SBER", "ПАО Сбербанк");
        stock.setPreviousClosingPrice(281.50);
        stock.setCurrentPrice(282.87);

        System.out.println("Акции: " + stock);
        System.out.printf("Цена закрытия предыдущего дня: %.2f руб.%n",
                stock.getPreviousClosingPrice());
        System.out.printf("Текущая цена:                  %.2f руб.%n",
                stock.getCurrentPrice());
        System.out.printf("Изменение стоимости:           %+.2f%%%n",
                stock.getChangePercent());
    }
}
