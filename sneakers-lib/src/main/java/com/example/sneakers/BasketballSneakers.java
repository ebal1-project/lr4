package com.example.sneakers;

/**
 * Баскетбольные кроссовки.
 *
 * @author Student
 * @version 1.0
 */
public class BasketballSneakers extends Sneakers {

    /** Название типа. */
    public static final String TYPE = "Баскетбольные";

    /**
     * Создаёт баскетбольные кроссовки.
     *
     * @param name            название модели
     * @param cost            стоимость
     * @param producerName    название производителя
     * @param producerCountry страна производителя
     */
    public BasketballSneakers(String name, double cost,
                              String producerName, String producerCountry) {
        super(name, cost, TYPE, producerName, producerCountry);
    }
}
