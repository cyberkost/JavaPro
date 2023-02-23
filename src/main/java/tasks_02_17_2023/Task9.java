package tasks_02_17_2023;
import java.util.Arrays;
import java.util.Scanner;

// Заполнить массив числами Фибоначчи

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = 0;
        long b = 1;
        long[] arrayFib = new long[scanner.nextInt()];
        arrayFib[0] = a;
        arrayFib[1] = b;
//      {0, 1, 1, 2, 3, 8, 13, 21, 34, 55}
        for (int i = 1; i < arrayFib.length; i++) {
            arrayFib[i] = a + b;
            a = arrayFib[i - 1];
            b = arrayFib[i];
        }
        System.out.println(Arrays.toString(arrayFib));
    }
}