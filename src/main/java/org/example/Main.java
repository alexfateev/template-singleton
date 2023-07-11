package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();
        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер спика: ");
        int size = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int limit = scanner.nextInt();
        logger.log("Создаем и наполняем список");
        List<Integer> list = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            list.add(rnd.nextInt(limit));
        }
        logger.log("Вот случайный список");
        list.stream().forEach(System.out::print);
        System.out.println();
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        int treshold = scanner.nextInt();
        Filter filter = new Filter(treshold);
        logger.log("Запускаем фильтрацию");
        List<Integer> result = filter.filterOut(list);
        logger.log("Выводим результат на экран");
        result.stream().forEach(System.out::print);
        System.out.println();
        logger.log("Завершаем программу");
    }
}