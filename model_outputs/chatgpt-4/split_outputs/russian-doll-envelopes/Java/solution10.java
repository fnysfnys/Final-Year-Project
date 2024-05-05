import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    /**
     * [Original docstring]
     */
    public int maxEnvelopes(int[][] envelopes) {
        // Remove duplicate widths
        Set<Integer> widths = new HashSet<>();
        envelopes = Arrays.stream(envelopes).filter(e -> widths.add(e[0])).toArray(int[][]::new);

        Arrays.sort(envelopes, (a, b) -> a[0] - b[0]);
        int[] tails = new int[envelopes.length];
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
