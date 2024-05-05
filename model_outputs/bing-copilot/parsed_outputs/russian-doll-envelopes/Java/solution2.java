import java.util.Arrays;

class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        int N = envelopes.length;
        if (N == 0) return 0;

        // Sort the envelopes based on width and height
        Arrays.sort(envelopes, (a, b) -> Integer.compare(a[0], b[0]));

        int[] dp = new int[N];
        int maxEnvelope = 1;
        Arrays.fill(dp, 1);

        for (int i = 1; i < N; ++i) {
            for (int j = 0; j < i; ++j) {
                if (envelopes[i][0] > envelopes[j][0] && envelopes[i][1] > envelopes[j][1]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxEnvelope = Math.max(maxEnvelope, dp[i]);
        }

        return maxEnvelope;
    }

    public static void main(String[] args) {
        int[][] envelopes1 = {{5, 4}, {6, 4}, {6, 7}, {2, 3}};
        System.out.println("Example 1: " + new Solution().maxEnvelopes(envelopes1)); // Output: 3

        int[][] envelopes2 = {{1, 1}, {1, 1}, {1, 1}};
        System.out.println("Example 2: " + new Solution().maxEnvelopes(envelopes2)); // Output: 1
    }
}
