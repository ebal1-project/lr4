# Лабораторная работа №3, вариант 3 (кроссовки)

Maven-проект из двух модулей:

- `sneakers-lib` - библиотека (иерархия классов, статистика), собирается в `.jar`
- `sneakers-app` - консольное приложение, использует `sneakers-lib`

## Структура

```
lab3/
├── pom.xml                      родительский pom
├── docs/uml.puml                UML-диаграмма (PlantUML)
├── sneakers-lib/
│   ├── pom.xml
│   └── src/main/java/com/example/sneakers/
│       ├── Sneakers.java            базовый класс + приватный внутренний Producer
│       ├── FootballSneakers.java
│       ├── BasketballSneakers.java
│       ├── RunningSneakers.java
│       ├── TennisSneakers.java      новый тип (п. 7)
│       └── SneakersStatistics.java  пп. 4-6
└── sneakers-app/
    ├── pom.xml
    └── src/main/java/com/example/app/Main.java
```

## Сборка и запуск (из папки `lab3`)

```
mvn clean package
java -jar sneakers-app/target/sneakers-app-1.0.jar
```

Результат сборки:

- `sneakers-lib/target/sneakers-lib-1.0.jar` - библиотека
- `sneakers-app/target/sneakers-app-1.0.jar` - приложение (зависимость лежит в `sneakers-app/target/lib/`)

JavaDoc: `mvn javadoc:javadoc` (результат в `sneakers-lib/target/reports/apidocs`).

Если в консоли Windows вместо русских букв «кракозябры»: `chcp 65001`.

## Инициализация проекта с нуля (для отчёта)

```
mvn archetype:generate -DgroupId=com.example -DartifactId=lab3-parent -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

Здесь pom.xml уже готовые, так что архетип нужен только чтобы описать в отчёте, как проект инициализируется.
