import java.util.*;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int maxIndex = 0;

        for (int i = 1; i < n; ++i) {
            for (int j = 0; j < i; ++j) {
                if (nums[i] % nums[j] == 0 && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    if (dp[i] > dp[maxIndex]) {
                        maxIndex = i;
                    }
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        int temp = nums[maxIndex];
        int currentDp = dp[maxIndex];
        for (int i = maxIndex; i >= 0; --i) {
            if (temp % nums[i] == 0 && dp[i] == currentDp) {
                result.add(nums[i]);
                temp = nums[i];
                currentDp--;
            }
        }

        Collections.reverse(result);
        return result;
    }
}
