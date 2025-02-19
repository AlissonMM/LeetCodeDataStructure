import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static java.awt.AWTEventMulticaster.add;

public class MinimunAbsoluteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {


        List<List<Integer>> allNumbersList = new ArrayList<>();

        HashSet<Integer> hashSet = new HashSet<>();
        int minDifference = Integer.MAX_VALUE;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {


            hashSet.add(arr[i]);

            if (i > 0) {
                minDifference = Math.min(minDifference, Math.abs(arr[i] - arr[i - 1]));

            }
        }

        for (int j = 0; j < arr.length; j++) {
            if (hashSet.contains(arr[j] + minDifference)) {
                List<Integer> twoNumbers = new ArrayList<>();
                twoNumbers.add(arr[j]);
                twoNumbers.add(arr[j] + minDifference);


                allNumbersList.add(twoNumbers);
            }


        }

//        System.out.println(allNumbersList);

        return allNumbersList;
    }
}
