class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
       List<Integer> result = new ArrayList<>();
       int[] dp = new int[nums.length];
       for (int i = 0; i < nums.length; i++) {
           dp[i] = 1;
           for (int j = 0; j < i; j++) {
               if (nums[i] % nums[j] == 0) {
                   dp[i] = Math.max(dp[i], dp[j] + 1);
               }
           }
       }
       int max = 0;
       for (int i = 0; i < nums.length; i++) {
           if (dp[i] > max) {
               max = dp[i];
               result.clear();
               result.add(nums[i]);
           }
       }
       return result;
    }
    
}
