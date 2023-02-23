package tasks_02_17_2023;
import java.util.LinkedList;
import java.util.List;

// Дан массив чисел. Найти число состоящее из собственных делителей.
// Например число 128 состоит из 1 2 и 8. 128 % 1 == 0 , 128 % 2 == 0 и 128 % 8 == 0.
// Вот такие числа надо найти.

public class Task3 {
    public static List<Integer> selfDiv(int first, int last) {
        List<Integer> list = new LinkedList<>();
        for (int i = first; i <= last; i++) {
            int j = i;
            for (; j > 0; j /= 10) {
                if ((j % 10 == 0) || (i % (j % 10) != 0)) {
                    break;
                }
            }
            if(j == 0) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(selfDiv(121, 299));
    }
}
