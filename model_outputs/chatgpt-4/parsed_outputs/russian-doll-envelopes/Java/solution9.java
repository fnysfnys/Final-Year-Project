import java.util.Arrays;

class Solution {
    /**
     * [Original docstring]
     */
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a, b) -> a[0] - b[0]);
        Integer[][] memo = new Integer[envelopes.length][envelopes.length];
        return maxEnvelopesHelper(envelopes, -1, 0, memo);
    }

    private int maxEnvelopesHelper(int[][] envelopes, int previousIndex, int currentIndex, Integer[][] memo) {
        if (currentIndex == envelopes.length) {
            return 0;
        }

        if (memo[previousIndex + 1][currentIndex] != null) {
            return memo[previousIndex + 1][currentIndex];
        }

        int taken = 0;
        if (previousIndex == -1 || (envelopes[currentIndex][0] > envelopes[previousIndex][0] && envelopes[currentIndex][1] > envelopes[previousIndex][1])) {
            taken = 1 + maxEnvelopesHelper(envelopes, currentIndex, currentIndex + 1, memo);
        }
        int notTaken = maxEnvelopesHelper(envelopes, previousIndex, currentIndex + 1, memo);

        memo[previousIndex + 1][currentIndex] = Math.max(taken, notTaken);
        return memo[previousIndex + 1][currentIndex];
    }
}