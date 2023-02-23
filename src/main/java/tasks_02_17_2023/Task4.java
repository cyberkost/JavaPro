package tasks_02_17_2023;
import java.util.Arrays;

// Написать метод который генерирует двумерный массив длиной N и высотой H.
// Далее заполняет получившийся массив числами от 1 до W по спирали.

public class Task4 {

// Следует завести переменные для верхней/нижней строки и правого/левого столбца и реализовать четыре цикла для прохождения по спирали вправо/вниз/влево/вверх,
// пока не будет достигнуто максимальное значение rows * cols:
    public static int[][] spiral(int rows, int cols) {
        int[][] arr = new int[rows][cols];
        int num = 1;
        int max = rows * cols;
        int rmin = 0;
        int rmax = rows - 1;
        int lmin = 0;
        int lmax = cols - 1;

        while (num <= max) {
            // проход влево по верхней строке, инкремент столбцов
            for (int i = lmin; num <= max && i <= lmax; i++) {
                arr[rmin][i] = num++;
            }
            rmin++;
            // проход вниз по правому краю, инкремент строк
            for (int i = rmin; num <= max && i <= rmax; i++) {
                arr[i][lmax] = num++;
            }
            lmax--;
            // проход вправо по нижней строке, декремент столбцов
            for (int i = lmax; num <= max && i >= lmin; i--) {
                arr[rmax][i] = num++;
            }
            rmax--;
            // проход вверх по левому краю, декремент строк
            for (int i = rmax; num <= max && i >= rmin; i--) {
                arr[i][lmin] = num++;
            }
            lmin++;
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("-- 3 x 4 --");
        for (int[] row : spiral(3, 4)) {
            System.out.println(Arrays.toString(row));
        }
    }
}
