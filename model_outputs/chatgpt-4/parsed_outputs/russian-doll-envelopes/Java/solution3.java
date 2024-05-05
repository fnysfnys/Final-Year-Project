import java.util.Arrays;

class Solution {
    /**
     * [Original docstring]
     */
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a, b) -> a[0] - b[0]);
        int count = 1;
        int[] lastEnvelope = envelopes[0];

        for (int[] envelope : envelopes) {
            if (envelope[0] > lastEnvelope[0] && envelope[1] > lastEnvelope[1]) {
                count++;
                lastEnvelope = envelope;
            }
        }

        return count;
    }
}