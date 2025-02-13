import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> tripletsList = new ArrayList<>();
        HashSet<List<Integer>> uniqueTriplets = new HashSet<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hashMap.clear();

            for (int j = 0; j < nums.length; j++) {

                if (j == i) {
                    continue;
                }

                int sum = nums[i] + nums[j];

                if (!hashMap.containsKey(-sum)) {
                    hashMap.put(nums[j], sum);
                } else {
                    if (sum + (-sum) == 0) {
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(-sum);


                        Collections.sort(triplet);


                        if (!uniqueTriplets.contains(triplet)) {
                            uniqueTriplets.add(triplet);
                            tripletsList.add(triplet);
                        }
                    }
                }
            }
        }

        System.out.println(tripletsList);

        return tripletsList;
    }
}
