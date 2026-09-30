# Ян — Java 11 test assignment

Решение второй части тестового задания для стажировки QA Engineer Java.

## Требования

- JDK 11
- консоль в кодировке UTF-8

## Структура

- `NumberOperations` — сравнение двух целых чисел, сложение, вычитание, деление и умножение;
- `StringComparison` — сравнение двух введённых строк;
- `EvenNumbers` — вывод чётных значений из заданного массива.

## Компиляция

Из корня проекта:

```shell
javac -encoding UTF-8 -d out src/main/java/ru/yan/qa/*.java
```

## Запуск

```shell
java -cp out ru.yan.qa.NumberOperations
java -cp out ru.yan.qa.StringComparison
java -cp out ru.yan.qa.EvenNumbers
```

Для `NumberOperations` и `StringComparison` данные вводятся пользователем через консоль.
