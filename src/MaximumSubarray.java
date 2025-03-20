import java.util.Arrays;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSum = 0;


        for (int i = 1; i < nums.length; i++) {
            int sum = nums[i] + nums[i - 1];

            if (sum > nums[i]){
                nums[i] = sum;
            }
        }

        nums = Arrays.stream(nums).sorted().toArray();

        maxSum = nums[nums.length -1];

        return maxSum;
    }
}
