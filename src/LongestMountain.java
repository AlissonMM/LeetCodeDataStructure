import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestMountain {
    public int longestMountain(int[] arr) {
        if (arr.length < 3) return 0;

        int maxLength = 0;

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {

                int left = i - 1;
                int right = i + 1;


                while (left > 0 && arr[left] > arr[left - 1]) {
                    left--;
                }


                while (right < arr.length - 1 && arr[right] > arr[right + 1]) {
                    right++;
                }


                int mountainSize = right - left + 1;


                maxLength = Math.max(maxLength, mountainSize);
            }
        }

        System.out.println(maxLength);

        return maxLength;
    }
}
