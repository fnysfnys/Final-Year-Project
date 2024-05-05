import java.util.*;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] dp = new int[n];
        int[] prev = new int[n];
        int maxIndex = 0;

        Arrays.fill(dp, 1);
        Arrays.fill(prev, -1);

        for (int i = 0; i < n; ++i) {
            for (int j = i - 1; j >= 0; --j) {
                if (nums[i] % nums[j] == 0 && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                    maxIndex = dp[i] > dp[maxIndex] ? i : maxIndex;
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = maxIndex; i != -1; i = prev[i]) {
            result.add(nums[i]);
        }

        return result;
    }
}
