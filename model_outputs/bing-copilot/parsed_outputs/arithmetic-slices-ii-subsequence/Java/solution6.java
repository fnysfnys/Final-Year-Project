class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int count = 0;
        Map<Long, Integer>[] dp = new HashMap[n];
        for (int i = 0; i < n; i++) {
            dp[i] = new HashMap<>();
            for (int j = 0; j < i; j++) {
                long diff = (long) nums[i] - nums[j];
                dp[i].put(diff, dp[i].getOrDefault(diff, 0) + 1);
                if (dp[j].containsKey(diff)) {
                    count += dp[j].get(diff);
                    dp[i].put(diff, dp[i].get(diff) + dp[j].get(diff));
                }
            }
        }
        return count;
    }
    
}
