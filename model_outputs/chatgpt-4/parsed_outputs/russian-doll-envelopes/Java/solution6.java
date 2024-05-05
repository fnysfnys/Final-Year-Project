class Solution {
    /**
     * [Original docstring]
     */
    public int maxEnvelopes(int[][] envelopes) {
        return maxEnvelopesHelper(envelopes, -1, 0);
    }

    private int maxEnvelopesHelper(int[][] envelopes, int prevIndex, int currIndex) {
        if (currIndex == envelopes.length) {
            return 0;
        }

        int taken = 0;
        if (prevIndex == -1 || (envelopes[currIndex][0] > envelopes[prevIndex][0] && envelopes[currIndex][1] > envelopes[prevIndex][1])) {
            taken = 1 + maxEnvelopesHelper(envelopes, currIndex, currIndex + 1);
        }
        int notTaken = maxEnvelopesHelper(envelopes, prevIndex, currIndex + 1);

        return Math.max(taken, notTaken);
    }
}