import java.util.HashMap;

class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int count = 0;
        HashMap<Long, Integer>[] dp = new HashMap[nums.length];
        for (int i = 0; i < nums.length; i++) {
            dp[i] = new HashMap<>();
            for (int j = 0; j < i; j++) {
                long diff = (long) nums[i] - nums[j];
                int prevCount = dp[j].getOrDefault(diff, 0);
                int currCount = dp[i].getOrDefault(diff, 0);
                dp[i].put(diff, currCount + prevCount + 1);
                count += prevCount;
            }
        }
        return count;
    }
}
