class Solution {
    public boolean canPartition(int[] nums) {
      int sum = Arrays.stream(nums).sum();
      if (sum % 2 != 0) return false; // Sum must be even for equal subsets
      return canPartitionHelper(nums, 0, sum/2);
    }
    
    private boolean canPartitionHelper(int[] nums, int index, int targetSum) {
      if (targetSum == 0) return true;
      if (index >= nums.length || targetSum < 0) return false;
      return canPartitionHelper(nums, index+1, targetSum) || canPartitionHelper(nums, index+1, targetSum - nums[index]);
    }
    
}
