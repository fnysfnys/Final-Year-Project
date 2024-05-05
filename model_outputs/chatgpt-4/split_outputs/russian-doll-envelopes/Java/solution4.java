class Solution {
    /**
     * [Original docstring]
     */
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a, b) -> a[0] - b[0]);
        return maxEnvelopes

Helper(envelopes, 0, -1, new Integer[envelopes.length][envelopes.length + 1]);
    }

    private int maxEnvelopesHelper(int[][] envelopes, int currentIndex, int previousIndex, Integer[][] memo) {
        if (currentIndex == envelopes.length) {
            return 0;
        }

        if (memo[currentIndex][previousIndex + 1] != null) {
            return memo[currentIndex][previousIndex + 1];
        }

        int taken = 0;
        if (previousIndex == -1 || (envelopes[currentIndex][0] > envelopes[previousIndex][0] && envelopes[currentIndex][1] > envelopes[previousIndex][1])) {
            taken = 1 + maxEnvelopesHelper(envelopes, currentIndex + 1, currentIndex, memo);
        }
        int notTaken = maxEnvelopesHelper(envelopes, currentIndex + 1, previousIndex, memo);

        memo[currentIndex][previousIndex + 1] = Math.max(taken, notTaken);
        return memo[currentIndex][previousIndex + 1];
    }
}

