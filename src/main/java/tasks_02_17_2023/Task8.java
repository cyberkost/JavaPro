package tasks_02_17_2023;
import java.util.Arrays;

//Дан массив и число n
//Вывести на экран два любых числа из массива которые
//в сумме дают n за O(n) либо написать что таких
//чисел нет
//[0 1 5 4 8 9 3 2 6] n = 13

public class Task8 {
    public static void findPair(int[] arr, int n) {
        Arrays.sort(arr);
        int a = 0;
        int b = arr.length - 1;
        while (a < b) {
            int s = arr[a] + arr[b];
            if (s == n) {
                System.out.println("First number is: " + arr[a]);
                System.out.println("Second number is: " + arr[b]);
                a++;
                b--;
            } else if (s < n) {
                a++;
            } else b--;
        }
        System.out.println("Pair not found");
    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 5, 4, 8, 9, 3, 2, 6};
        int n = 13;
        findPair(arr, n);
    }
}