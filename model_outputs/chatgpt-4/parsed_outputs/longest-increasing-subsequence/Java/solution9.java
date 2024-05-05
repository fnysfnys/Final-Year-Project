class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        int maxLength = 0;
        for (int num : nums) {
            int maxVal = 0;
            for (int i = 0; i < maxLength; i++) {
                if (num > dp[i]) {
                    maxVal = Math.max(maxVal, dp[i]);
                }
            }
            if (maxVal == 0 || num > maxVal) {
                dp[maxLength++] = num;
            } else {
                int idx = Arrays.binarySearch(dp, 0, maxLength, maxVal);
                dp[idx + 1] = num;
            }
        }
        return maxLength;
    }
}
