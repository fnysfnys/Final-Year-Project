import java.math.BigInteger;

public int combinationSum4(int[] nums, int target) {
    BigInteger[] dp = new BigInteger[target + 1];
    dp[0] = BigInteger.ONE;
    
    for (int i = 1; i <= target; i++) {
        dp[i] = BigInteger.ZERO;
        for (int num : nums) {
            if (i - num >= 0) {
                dp[i] = dp[i].add(dp[i - num]);
            }
        }
    }
    
    return dp[target].intValue();
}
