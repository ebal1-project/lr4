package com.example.app;

import com.example.sneakers.BasketballSneakers;
import com.example.sneakers.FootballSneakers;
import com.example.sneakers.RunningSneakers;
import com.example.sneakers.Sneakers;
import com.example.sneakers.SneakersStatistics;
import com.example.sneakers.TennisSneakers;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Консольное приложение для демонстрации библиотеки sneakers-lib.
 *
 * @author Student
 * @version 1.0
 */
public final class Main {

    /** Утилитный класс, экземпляры не создаются. */
    private Main() {
    }

    /**
     * Точка входа.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        List<Sneakers> shoes = createShoes();

        System.out.println("=== Список кроссовок (" + shoes.size() + " шт.) ===");
        shoes.forEach(System.out::println);
        printStatistics(shoes);

        // Пункт 7: добавляем новый тип, методы статистики не меняются
        System.out.println("\n=== Добавлен новый тип: теннисные кроссовки ===");
        shoes.add(new TennisSneakers("Court Ace", 130.0, "Wilson", "США"));
        shoes.add(new TennisSneakers("Gel-Resolution", 150.0, "Asics", "Япония"));
        shoes.add(new TennisSneakers("Barricade", 170.0, "Adidas", "Германия"));
        shoes.subList(shoes.size() - 3, shoes.size()).forEach(System.out::println);
        printStatistics(shoes);
    }

    /**
     * Создаёт список из 10 кроссовок разных типов и производителей.
     *
     * @return изменяемый список кроссовок
     */
    private static List<Sneakers> createShoes() {
        List<Sneakers> shoes = new ArrayList<>();
        shoes.add(new FootballSneakers("Phantom GT", 220.0, "Nike", "США"));
        shoes.add(new FootballSneakers("Predator", 200.0, "Adidas", "Германия"));
        shoes.add(new FootballSneakers("Future", 180.0, "Puma", "Германия"));
        shoes.add(new BasketballSneakers("LeBron 20", 250.0, "Nike", "США"));
        shoes.add(new BasketballSneakers("Harden Vol. 7", 140.0, "Adidas", "Германия"));
        shoes.add(new BasketballSneakers("All Star", 90.0, "Converse", "США"));
        shoes.add(new RunningSneakers("Pegasus", 120.0, "Nike", "США"));
        shoes.add(new RunningSneakers("Ultraboost", 190.0, "Adidas", "Германия"));
        shoes.add(new RunningSneakers("Gel-Kayano", 160.0, "Asics", "Япония"));
        shoes.add(new RunningSneakers("Velocity", 110.0, "Puma", "Германия"));
        return shoes;
    }

    /**
     * Выводит статистику: число производителей и средние цены.
     *
     * @param shoes список кроссовок
     */
    private static void printStatistics(List<Sneakers> shoes) {
        System.out.println("\nКоличество производителей: "
                + SneakersStatistics.countProducers(shoes));

        System.out.println("\nСредняя стоимость по производителям:");
        printMap(SneakersStatistics.averageCostByProducer(shoes));

        System.out.println("\nСредняя стоимость по типам:");
        printMap(SneakersStatistics.averageCostByType(shoes));
    }

    /**
     * Выводит отображение «ключ - средняя стоимость».
     *
     * @param map отображение для вывода
     */
    private static void printMap(Map<String, Double> map) {
        map.forEach((key, value) ->
                System.out.printf("  %-15s %8.2f%n", key, value));
    }
}
