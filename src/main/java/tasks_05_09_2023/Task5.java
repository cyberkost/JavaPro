package tasks_05_09_2023;

//У нас есть массив чисел длиной N и число K.
//Нам нужно найти все подмассивы массива, в которых сумма элементов равна K.
//Подмассив может быть любой длины, а числа могут быть как положительными, так и отрицательными.

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        int[] arr = {1, 12, -10, 25, 31, 49, 15, 4, 53, -20};
        int k = 80;
        findSomeNumber(arr, k);
    }

    public static void findSomeNumber(int[] arr, int k) {
        int n = arr.length;
        int left = 0, right = 0, sum = 0;
        while (right < n) {
            sum += arr[right];
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            if (sum == k) {
                System.out.println(Arrays.toString(Arrays.copyOfRange(arr, left, right + 1)));
            }
            right++;
        }
    }
}
