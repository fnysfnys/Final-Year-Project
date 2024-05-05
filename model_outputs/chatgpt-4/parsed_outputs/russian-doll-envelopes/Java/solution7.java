import java.util.Arrays;

class Solution {
    /**
     * [Original docstring]
     */
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a, b) -> a[1] - b[1]);
        int[] dp = new int[envelopes.length];
        Arrays.fill(dp, 1);

        for (int i = 1; i < envelopes.length; i++) {
            for (int j = 0; j < i; j++) {
                if (envelopes[i][0] > envelopes[j][0] && envelopes[i][1] > envelopes[j][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int max = 1;
        for (int count : dp) {
            max = Math.max(max, count);
        }

        return max;
    }
}