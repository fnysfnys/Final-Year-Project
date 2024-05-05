class Solution {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int tests = minutesToTest / minutesToDie + 1;
        int pigs = 0;
        int[] dp = new int[buckets + 1];
        while (dp[buckets] < pigs) {
            pigs++;
            for (int i = buckets; i > 0; i--) {
                dp[i] = dp[i] + dp[i - 1] + 1;
            }
        }
        return pigs;
    }
}
