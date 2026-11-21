package com.example.sneakers;

/**
 * Беговые кроссовки.
 *
 * @author Student
 * @version 1.0
 */
public class RunningSneakers extends Sneakers {

    /** Название типа. */
    public static final String TYPE = "Беговые";

    /**
     * Создаёт беговые кроссовки.
     *
     * @param name            название модели
     * @param cost            стоимость
     * @param producerName    название производителя
     * @param producerCountry страна производителя
     */
    public RunningSneakers(String name, double cost,
                           String producerName, String producerCountry) {
        super(name, cost, TYPE, producerName, producerCountry);
    }
}
