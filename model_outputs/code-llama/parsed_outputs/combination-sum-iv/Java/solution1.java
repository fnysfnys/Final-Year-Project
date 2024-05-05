class Solution {
    public int combinationSum4(int[] nums, int target) {
       int count = 0;
       for (int i = 0; i < nums.length; i++) {
           for (int j = i; j < nums.length; j++) {
               if (nums[i] + nums[j] == target) {
                   count++;
               }
           }
       }
       return count;
    }
    
}
