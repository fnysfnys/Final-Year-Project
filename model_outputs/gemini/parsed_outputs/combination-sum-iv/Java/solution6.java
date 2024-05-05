class Solution {
    public int combinationSum4(int[] nums, int target) {
      if (target == 0) {
        return 1;
      }
      int count = 0;
      for (int num : nums) {
        if (target - num >= 0 && combinationSum4(nums, target - num) > 0) {
          count += 1;
        }
      }
      return count;
    }
    
}
