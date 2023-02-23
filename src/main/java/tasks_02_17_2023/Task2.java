package tasks_02_17_2023;

// Дан массив чисел, в котором есть все числа от 0 до N.
// Все эти числа в единственном экземпляре. Расположены в разнобой.
// Одно число в этом массиве пропущено (Например {1 0 2 8 6 5 4 7} - это 3).
// Найти пропущенное число

public class Task2 {

// Для решения этой задачи можно вычислить сумму всех чисел от 0 до N по формуле, затем вычесть из этой суммы сумму всех чисел в массиве.
// Результатом будет пропущенное число.
    public static int findMissingNumber(int[] arr, int langArr) {
        int expectedSum = (langArr * (langArr + 1)) / 2;
        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 8, 6, 5, 4, 7};
        int langArr = 8;
        int missingNumber = findMissingNumber(arr, langArr);
        System.out.println(missingNumber);

    }
}
