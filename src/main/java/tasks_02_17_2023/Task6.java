package tasks_02_17_2023;
import java.util.ArrayList;

//[1 1 5 4 1 9 2 4 6] n = 11
//вернуть длину минимальной последовательности
//которая в сумме дает n
//в массиве все числа положительные

public class Task6 {
    public static ArrayList<Integer> getSequence(int[] nums, int n) {
        ArrayList<Integer> minSeq = new ArrayList<>();
        int sum = 0;
        int start = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum > n && start <= i) {
                sum -= nums[start];
                start++;
            }
            if (sum == n) {
                for (int j = start; j <= i; j++) {
                    minSeq.add(nums[j]);
                }
                return minSeq;
            }
        }
        return minSeq;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 5, 4, 1, 9, 2, 4, 6};
        int n = 11;
        System.out.println(getSequence(nums, n));
    }
}