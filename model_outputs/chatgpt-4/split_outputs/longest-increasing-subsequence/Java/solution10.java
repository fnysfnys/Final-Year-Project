public int lengthOfLIS(int[] nums) {
    int n = nums.length;
    int[] dp = new int[n];
    int len = 0;
    for (int num : nums) {
        int i = 0, j = len;
        while (i < j) {
            int mid = (i + j) / 2;
            if (dp[mid] < num) {
                i = mid + 1;
            } else {
                j = mid;
            }
        }
        dp[i] = num;
        if (i == len) {
            len++;
        }
    }
    return len;
}
