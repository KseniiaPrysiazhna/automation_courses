import java.util.Arrays;

public class TaskFive {
    public static void oneToZeroToOne() {
        int[] nums = {0, 1, 0, 0, 1, 1, 0, 1, 1};
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (x == 0) {
                nums[i] = 1;
            } else if (x == 1) {
                nums[i] = 0;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}