import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum+= nums[i];
        }

        int lastPosition = nums.length ;

        int expectedSum = lastPosition * (lastPosition + 1) / 2;



        int numberMissing = expectedSum - sum;


        return numberMissing;

    }
}
