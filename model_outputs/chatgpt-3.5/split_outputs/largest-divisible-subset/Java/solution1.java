import java.util.*;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int maxLen = 1, maxIndex = 0;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    if (dp[i] > maxLen) {
                        maxLen = dp[i];
                        maxIndex = i;
                    }
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        int currentLen = maxLen, currentVal = nums[maxIndex];
        for (int i = maxIndex; i >= 0; i--) {
            if (currentLen == dp[i] && currentVal % nums[i] == 0) {
                result.add(nums[i]);
                currentLen--;
                currentVal = nums[i];
            }
        }

        Collections.reverse(result);
        return result;
    }
}
