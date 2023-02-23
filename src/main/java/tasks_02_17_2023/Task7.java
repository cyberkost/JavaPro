package tasks_02_17_2023;

//вам необходимо проверить массив на наличие повторений чисел

public class Task7 {
    public static boolean isDuplicated(int[] nums) {
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] nums = {0, 5, 1, 1, 8, 9, 3, 2, 6};
        if (isDuplicated(nums)) {
            System.out.println("Duplicate Found");
        } else {
            System.out.println("Duplicate not Found");
        }
    }
}