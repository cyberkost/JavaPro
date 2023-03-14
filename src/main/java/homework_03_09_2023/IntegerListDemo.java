package homework_03_09_2023;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class IntegerListDemo {
// В классе IntegerListDemo создайте список целых чисел. Продемонстрируйте как:
// добавить в список элемент (в начало и в конец)
// узнать длину списка
// удалить элемент из списка (по индексу и без)
// узнать пустой список или нет
// обойти список и вывести на консоль каждый элемент.

    public static void main(String[] args) {
        LinkedList<Integer> IntegerListDemo = new LinkedList<>(List.of(1, 2, 3, 4, 5));
        IntegerListDemo.addFirst(5);
        IntegerListDemo.addLast(1);
        System.out.println(IntegerListDemo);
        System.out.println(IntegerListDemo.size());
        IntegerListDemo.remove(3);
        System.out.println(IntegerListDemo);
        IntegerListDemo.removeFirst();
        System.out.println(IntegerListDemo);
        IntegerListDemo.removeLast();
        System.out.println(IntegerListDemo);
        System.out.println(IntegerListDemo.isEmpty());
        for (int i : IntegerListDemo) {
            System.out.println(i);
        }

// Могут ли реализации интерфейса java.util.List хранить одинаковые элементы (дубликаты)?
// Напишите код программы, который демонстрирует ответ на этот вопрос.

        List<String> myList = new ArrayList<>(List.of("apple", "banana", "cherry", "banana"));
        System.out.println(myList);
    }
}
