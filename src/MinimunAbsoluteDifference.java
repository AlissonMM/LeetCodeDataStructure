import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static java.awt.AWTEventMulticaster.add;

public class MinimunAbsoluteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {


        List<List<Integer>> allNumbersList = new ArrayList<>();

        int minDifference = Integer.MAX_VALUE;

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {

            if (i > 0) {
                minDifference = Math.min(minDifference, Math.abs(arr[i] - arr[i - 1]));

            }
        }

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] - arr[j-1] == minDifference){
                allNumbersList.add(Arrays.asList(arr[j - 1], arr[j]));
            }


        }

//        System.out.println(allNumbersList);

        return allNumbersList;
    }
}
