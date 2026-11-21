package com.example.sneakers;

/**
 * Базовый класс для кроссовок.
 * <p>
 * Конкретные виды кроссовок (футбольные, баскетбольные и т.д.)
 * реализуются через наследование от этого класса.
 * Производитель хранится в приватном внутреннем классе {@link Producer}
 * (композиция), поэтому снаружи доступен только через методы
 * {@link #getProducerName()} и {@link #getProducerCountry()}.
 *
 * @author Student
 * @version 1.0
 */
public abstract class Sneakers {

    /** Название модели. */
    private final String name;

    /** Стоимость. */
    private final double cost;

    /** Тип кроссовок (футбольные, баскетбольные и т.п.). */
    private final String type;

    /** Производитель. */
    private final Producer producer;

    /**
     * Создаёт кроссовки.
     *
     * @param name            название модели
     * @param cost            стоимость
     * @param type            тип кроссовок
     * @param producerName    название производителя
     * @param producerCountry страна производителя
     */
    protected Sneakers(String name, double cost, String type,
                       String producerName, String producerCountry) {
        this.name = name;
        this.cost = cost;
        this.type = type;
        this.producer = new Producer(producerName, producerCountry);
    }

    /**
     * Возвращает название модели.
     *
     * @return название модели
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает стоимость.
     *
     * @return стоимость
     */
    public double getCost() {
        return cost;
    }

    /**
     * Возвращает тип кроссовок.
     *
     * @return тип кроссовок
     */
    public String getType() {
        return type;
    }

    /**
     * Возвращает название производителя.
     *
     * @return название производителя
     */
    public String getProducerName() {
        return producer.getName();
    }

    /**
     * Возвращает страну производителя.
     *
     * @return страна производителя
     */
    public String getProducerCountry() {
        return producer.getCountry();
    }

    @Override
    public String toString() {
        return String.format("%s '%s', тип: %s, цена: %.2f, производитель: %s",
                getClass().getSimpleName(), name, type, cost, producer);
    }

    /**
     * Производитель кроссовок. Приватный внутренний класс.
     */
    private class Producer {

        /** Название производителя. */
        private final String name;

        /** Страна производителя. */
        private final String country;

        /**
         * Создаёт производителя.
         *
         * @param name    название
         * @param country страна
         */
        Producer(String name, String country) {
            this.name = name;
            this.country = country;
        }

        /**
         * Возвращает название производителя.
         *
         * @return название
         */
        String getName() {
            return name;
        }

        /**
         * Возвращает страну производителя.
         *
         * @return страна
         */
        String getCountry() {
            return country;
        }

        @Override
        public String toString() {
            return name + " (" + country + ")";
        }
    }
}
