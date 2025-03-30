import java.util.HashMap;
import java.util.Optional;

public class RangeSumQuery {

 int [] nums;
    HashMap<String, Integer> hashmap;
    public RangeSumQuery(int[] nums) {
        this.nums = nums;

         hashmap = new HashMap<>();
        }


    public int sumRange(int left, int right) {
        String verifyHash = String.valueOf(left)+String.valueOf(right);
        Integer valueInRange = hashmap.get(verifyHash);
        if (valueInRange != null){
            return valueInRange;
        }

        else {
            int approximatedValue = Integer.MIN_VALUE;
            int approximatedIndex = Integer.MIN_VALUE;
            for (int i = left; i <= right; i++){
                verifyHash = String.valueOf(left)+String.valueOf(i);
                valueInRange = hashmap.get(verifyHash);

                if (valueInRange != null){
                    approximatedValue = valueInRange;
                    approximatedIndex = i;
                }

            }

            if (approximatedValue != Integer.MIN_VALUE){
                valueInRange = approximatedValue;
                for (int i = approximatedIndex + 1; i <= right; i++){
                    valueInRange += nums[i];
                }


                hashmap.put(verifyHash, valueInRange);
                return valueInRange;
            }

            else {
                valueInRange = 0;
                for (int i = left; i <= right; i++){
                    valueInRange += nums[i];
                }
                hashmap.put(verifyHash, valueInRange);
                return valueInRange;
            }

        }

    }
}

