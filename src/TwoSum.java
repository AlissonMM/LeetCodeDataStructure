public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        int[] answer = new int[2];

        for (int i = 0; i < nums.length; i++){
            int currentNum = nums[i];

            for (int j = i + 1; j < nums.length; j++){
                if (currentNum + nums[j] == target){
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }

        for (int h = 0; h < answer.length; h++){
            System.out.println(answer[h]);
        }
        return answer;

    }
}
