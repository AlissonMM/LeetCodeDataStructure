import java.util.HashMap;
import java.util.List;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            if (!hashMap.containsKey(nums[i])){
                hashMap.put(nums[i], i);
            }

            else {
                int result = Math.abs(i - hashMap.get(nums[i]));
                if (result <= k){

                    return true;
                }

                hashMap.put(nums[i], i);

            }


        }



        return false;
    }

}
