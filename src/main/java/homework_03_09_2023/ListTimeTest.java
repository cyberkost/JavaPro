package homework_03_09_2023;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListTimeTest {
//    создать List наполнить его 10М> элементами
//    При наполнении списка сохраняем i- тый элемент в переменную temp
//    для всех случаев сделать замер времени
//    результат вывести в консоль

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }

        //    перебрать for-each loop
        long startTime = System.currentTimeMillis();
        for (int i : list) {
            int temp = i;
        }
        long endTime = System.currentTimeMillis();
        System.out.println("For-each loop: " + (endTime - startTime) + " ms");

        // classic for и вызываем list.size() для каждой итерации
        startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("For loop with list.size(): " + (endTime - startTime) + " ms");

        // classic for, но list.size() определяем в переменную
        startTime = System.currentTimeMillis();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int temp = list.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("For loop with list.size() defined: " + (endTime - startTime) + " ms");

        // classic for, list.size() определяем в переменную, перебираем с конца (i--)
        startTime = System.currentTimeMillis();
        int size2 = list.size();
        for (int i = size2 - 1; i >= 0; i--) {
            int temp = list.get(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("For loop iterating from the end: " + (endTime - startTime) + " ms");

        // используя Iterator
        startTime = System.currentTimeMillis();
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            int temp = it.next();
        }
        endTime = System.currentTimeMillis();
        System.out.println("Iterator: " + (endTime - startTime) + " ms");

        // используя ListIterator
        startTime = System.currentTimeMillis();
        ListIterator<Integer> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            int temp = listIterator.next();
        }
        endTime = System.currentTimeMillis();
        System.out.println("ListIterator: " + (endTime - startTime) + " ms");
    }
}