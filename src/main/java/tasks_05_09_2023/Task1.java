package tasks_05_09_2023;

// Проверить массивы на монотонность

public class Task1 {
    private static boolean isMono(int[] array) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                decreasing = false;
            } else if (array[i] < array[i - 1]) {
                increasing = false;
            }
        }
        return increasing || decreasing;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 1, 2, 3, 4, 6, 8, 8, 9};
        int[] array2 = {80, 75, 75, 75, 75, 75, 74, 73, 5, 5, 5};
        int[] array3 = {10, 10, 11, 11, 12, 12, 13, 12};
        System.out.println(isMono(array1));
        System.out.println(isMono(array2));
        System.out.println(isMono(array3));
    }
}
