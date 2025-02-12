import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeSet;

public class SmallerNumbersThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] sortedUniqueArray = Arrays.stream(nums)
                .sorted()
                .toArray();

        HashMap<Integer, Integer> hashMap = new HashMap();

        for (int k = 0; k < sortedUniqueArray.length; k++){
//            System.out.println("Sorted Array" + k);

            if (!hashMap.containsKey(sortedUniqueArray[k])){
                hashMap.put(sortedUniqueArray[k], k);
            }

        }

        for (int i = 0; i < sortedUniqueArray.length; i++){
            if (hashMap.containsKey(nums[i])){
                nums[i] = hashMap.get(nums[i]);
            }

            else{
                System.out.println("number does not exist");
            }
        }

//        for (int h = 0; h < nums.length; h++){
//            System.out.println(nums[h]);
//        }

        return nums;
    }
}
