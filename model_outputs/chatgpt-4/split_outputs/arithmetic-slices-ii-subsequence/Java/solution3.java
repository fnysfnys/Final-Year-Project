class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        int count = 0;
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                dp[i][j] = 2;
            }
        }

        for (int j = 2; j < n; j++) {
            int i = j - 2;
            int k = j - 1;
            while (i >= 0 && k > i) {
                long diff1 = (long)nums[j] - nums[k];
                long diff2 = (long)nums[k] - nums[i];
                if (diff1 == diff2) {
                    dp[i][j] = dp[i][k] + 1;
                    count += (dp[i][j] - 3 + 1);
                    k--;
                } else if (diff1 < diff2) {
                    i--;
                } else {
                    k--;
                }
            }
        }
        return count;
    }
}
