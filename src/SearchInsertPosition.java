public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int expectedPosition = 0;
        int differenceBetween = 0;
        int leastDifferentPosition = 99999999;
        int leastDifferentSubtraction = 99999;

        for (int i = 0; i < nums.length; i++){
            if (target == nums[i]){
                return i;
            }

            else{

                if (target > nums[i]){
                    differenceBetween = target - nums[i];
                }

                else if (nums[i] > target){
                    differenceBetween = nums[i] - target;
                }


                if (differenceBetween < leastDifferentSubtraction && target > nums[i]){
                    leastDifferentSubtraction = differenceBetween;


                    leastDifferentPosition = i + 1;
                }


                else if (differenceBetween < leastDifferentSubtraction && target < nums[i]){
                    leastDifferentSubtraction = differenceBetween;


                    leastDifferentPosition = i ;
                }
            }


        }

        expectedPosition = leastDifferentPosition;

        return expectedPosition;

    }
}
