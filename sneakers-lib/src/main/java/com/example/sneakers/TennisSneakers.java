package com.example.sneakers;

/**
 * Теннисные кроссовки.
 * <p>
 * Новый тип, добавленный по пункту 7 задания. Методы подсчёта статистики
 * в {@link SneakersStatistics} при этом не менялись: они работают с
 * базовым классом {@link Sneakers}.
 *
 * @author Student
 * @version 1.0
 */
public class TennisSneakers extends Sneakers {

    /** Название типа. */
    public static final String TYPE = "Теннисные";

    /**
     * Создаёт теннисные кроссовки.
     *
     * @param name            название модели
     * @param cost            стоимость
     * @param producerName    название производителя
     * @param producerCountry страна производителя
     */
    public TennisSneakers(String name, double cost,
                          String producerName, String producerCountry) {
        super(name, cost, TYPE, producerName, producerCountry);
    }
}
