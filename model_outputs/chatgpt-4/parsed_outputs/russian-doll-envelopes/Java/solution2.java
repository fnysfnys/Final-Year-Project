import java.util.Arrays;

class Solution {
    /**
     * [Original docstring]
     */
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a, b) -> a[0] - b[0]);
        int n = envelopes.length;
        int[] tails = new int[n];
        int size = 0;

        for (int[] envelope : envelopes) {
            int i = Arrays.binarySearch(tails, 0, size, envelope[1]);
            if (i < 0) i = -(i + 1);
            tails[i] = envelope[1];
            if (i == size) size++;
        }

        return size;
    }
}