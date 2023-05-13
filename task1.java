/*
 * Задача 1.
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
 */

import java.util.LinkedList;

public class task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i < 6; i++) {
            list.add(i);
        }

        System.out.println("Изначальный список: " + list);
        System.out.println("Перевёрнутый список: " + (reverse(list)));
    }

    public static LinkedList<Integer> reverse(LinkedList<Integer> array) {
        LinkedList<Integer> reverseList = new LinkedList<>();
        for (int i = 0; i < array.size(); i++) {
            reverseList.add(i, array.get(array.size() - i - 1));
        }
        return reverseList;
    }
}