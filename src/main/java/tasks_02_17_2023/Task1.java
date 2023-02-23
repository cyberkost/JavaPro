package tasks_02_17_2023;

// Дан массив чисел в котором все числа имеют повторения, кроме одного числа. Найти это число

public class Task1 {
// Для решения этой задачи можно использовать побитовое исключающее ИЛИ (XOR) над всеми числами в массиве.
// Побитовое XOR двух чисел возвращает 1, если только один из двух битов равен 1, и 0 в противном случае.
// Поскольку все числа в массиве, кроме одного, повторяются, то при побитовом XOR всех чисел в массиве все повторяющиеся числа будут "взаимно уничтожены" и останется только одно число, которое не имеет пары.
    public static int findUniqueNumber(int[] arr) {
        int result = 0;
        for (int j : arr) {
            result = result ^ j;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, 2, 3, 1, 5, 3, 1, 10, 2};
        int uniqueNumber = findUniqueNumber(arr);
        System.out.println(uniqueNumber);
    }
}
