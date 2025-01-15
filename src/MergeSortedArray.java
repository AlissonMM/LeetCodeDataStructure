import java.util.ArrayList;
import java.util.List;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        List<Integer> list = new ArrayList<>();


        for (int i = 0; i < m; i++) {
            list.add(nums1[i]);
        }

        for (int i = 0; i < n; i++) {
            list.add(nums2[i]);
        }


        list = list.stream()
                .sorted()
                .toList();


        for (int i = 0; i < Math.min(list.size(), nums1.length); i++) {
            nums1[i] = list.get(i);
        }


        for (int i = list.size(); i < nums1.length; i++) {
            nums1[i] = 0;
        }
    }
}
