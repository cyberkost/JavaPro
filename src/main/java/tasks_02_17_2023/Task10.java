package tasks_02_17_2023;

// Найти два минимальных элемента в массиве

public class Task10 {
    public static void findMin() {
        int[] array = {222, 31, 144, 3, 5, 88, 99, -1, 10};
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min1) {
                min2 = min1;
                min1 = array[i];
            } else if (array[i] < min2 && array[i] != min1) {
                min2 = array[i];
            }
        }
        if (min2 != Integer.MAX_VALUE) {
            System.out.println("Второй по минимальности элемент в массиве: " + min2);
        } else {
            System.out.println("Второго по минимальности элемента нет");
        }
        System.out.println("Минимальный элемент в массиве: " + min1);
    }

    public static void main(String[] args) {
        findMin();
    }
}