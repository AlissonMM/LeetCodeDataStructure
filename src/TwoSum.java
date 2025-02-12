import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {

        int[] answer = new int[2];

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            int expectedNum = target - nums[i];

            if (map.containsKey(expectedNum)){
                answer[0] = i;
                answer[1] = map.get(expectedNum);
            }

            else{
                map.put(nums[i], i);
            }
        }

//        for (int h = 0; h < answer.length; h++){
//            System.out.println(answer[h]);
//        }

        return answer;

    }
}
