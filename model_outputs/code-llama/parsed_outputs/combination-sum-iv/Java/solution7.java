class Solution {
    public int combinationSum4(int[] nums, int target) {
       Arrays.sort(nums);
       int count = 0;
       for (int i = 0; i < nums.length; i++) {
           if (nums[i] <= target) {
               count++;
           }
       }
       return count;
    }
    
}
