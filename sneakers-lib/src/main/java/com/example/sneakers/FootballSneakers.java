package com.example.sneakers;

/**
 * Футбольные кроссовки (бутсы).
 *
 * @author Student
 * @version 1.0
 */
public class FootballSneakers extends Sneakers {

    /** Название типа. */
    public static final String TYPE = "Футбольные";

    /**
     * Создаёт футбольные кроссовки.
     *
     * @param name            название модели
     * @param cost            стоимость
     * @param producerName    название производителя
     * @param producerCountry страна производителя
     */
    public FootballSneakers(String name, double cost,
                            String producerName, String producerCountry) {
        super(name, cost, TYPE, producerName, producerCountry);
    }
}
