public int numberOfArithmeticSlices(int[] nums) {
    int n = nums.length;
    int count = 0;
    Map<Integer, Integer>[] dp = new HashMap[n];
    for (int i = 0; i < n; i++) {
        dp[i] = new HashMap<>();
        for (int j = 0; j < i; j++) {
            long diff = (long) nums[i] - nums[j];
            if (diff <= Integer.MIN_VALUE || diff > Integer.MAX_VALUE) continue;
            int d = (int) diff;
            int prevCount = dp[j].getOrDefault(d, 0);
            count += prevCount;
            dp[i].put(d, dp[i].getOrDefault(d, 0) + prevCount + 1);
        }
    }
    return count;
}
