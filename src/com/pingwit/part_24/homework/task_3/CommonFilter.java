package com.pingwit.part_24.homework.task_3;

/* Проблема этого класса в том, что на каждую новую букву, тебе необходимо создавать отдельный метод.
Можно просто заменить 3 метода, на один, который вторым параметром будет принимать фильтр.
Для решения данной задачи этот класс можно удалить и использовать метод removeIf() у коллекции. Этот метод принимает предикат
 */
public class CommonFilter {
    boolean nameStartsWithA(User user) {
        return user.getName().startsWith("A");
    }

    boolean nameStartsWithP(User user) {
        return user.getName().startsWith("P");
    }

    boolean nameStartsWithE(User user) {
        return user.getName().startsWith("E");
    }

}

