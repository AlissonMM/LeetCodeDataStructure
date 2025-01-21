public class RemoveElement {

    public int[] removeElement(int[] nums, int val) {
        int [] expectedNums = new int[nums.length];
        int j = 0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val){
                expectedNums[j] = nums[i];

                j++;
            }

        }




        return expectedNums;
    }
}
