import java.util.*;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int[] dp = new int[n];
        int[] prev = new int[n];
        int maxIndex = 0;
        
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
            prev[i] = -1;
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    prev[i] = j;
                }
            }
            if (dp[i] > dp[maxIndex]) {
                maxIndex = i;
            }
        }
        
        List<Integer> largestSubset = new ArrayList<>();
        while (maxIndex != -1) {
            largestSubset.add(nums[maxIndex]);
            maxIndex = prev[maxIndex];
        }
        Collections.reverse(largestSubset);
        return largestSubset;
    }
}
