import java.util.Arrays;
import java.util.Comparator;

class Solution {

    public int maxEnvelopes(int[][] envelopes) {

        int n = envelopes.length;

        Arrays.sort(envelopes, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {

                if (a[0] == b[0]) {
                    return b[1] - a[1]; 
                }

                return a[0] - b[0]; 
            }
        });

        int[] lis = new int[n];
        int size = 0;

        for (int i = 0; i < n; i++) {

            int height = envelopes[i][1];

            int left = 0;
            int right = size;

            while (left < right) {

                int mid = (left + right) / 2;

                if (lis[mid] < height) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            lis[left] = height;

            if (left == size) {
                size = size + 1;
            }
        }

        return size;
    }
}