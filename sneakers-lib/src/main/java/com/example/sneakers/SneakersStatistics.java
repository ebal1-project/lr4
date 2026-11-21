package com.example.sneakers;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * Статистика по коллекции кроссовок.
 * <p>
 * Методы работают только с базовым классом {@link Sneakers}, поэтому
 * добавление нового типа кроссовок не требует их изменения.
 *
 * @author Student
 * @version 1.0
 */
public final class SneakersStatistics {

    /** Утилитный класс, экземпляры не создаются. */
    private SneakersStatistics() {
    }

    /**
     * Подсчитывает количество различных производителей.
     *
     * @param sneakers список кроссовок
     * @return количество уникальных производителей
     */
    public static long countProducers(List<? extends Sneakers> sneakers) {
        return sneakers.stream()
                .map(Sneakers::getProducerName)
                .distinct()
                .count();
    }

    /**
     * Подсчитывает среднюю стоимость обуви по каждому производителю.
     *
     * @param sneakers список кроссовок
     * @return отображение «название производителя - средняя стоимость»
     */
    public static Map<String, Double> averageCostByProducer(
            List<? extends Sneakers> sneakers) {
        return sneakers.stream().collect(Collectors.groupingBy(
                Sneakers::getProducerName,
                TreeMap::new,
                Collectors.averagingDouble(Sneakers::getCost)));
    }

    /**
     * Подсчитывает среднюю стоимость обуви по каждому типу.
     *
     * @param sneakers список кроссовок
     * @return отображение «тип - средняя стоимость»
     */
    public static Map<String, Double> averageCostByType(
            List<? extends Sneakers> sneakers) {
        return sneakers.stream().collect(Collectors.groupingBy(
                Sneakers::getType,
                TreeMap::new,
                Collectors.averagingDouble(Sneakers::getCost)));
    }
}
