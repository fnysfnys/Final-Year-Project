public boolean canPartition(int[] nums) {
  int sum = Arrays.stream(nums).sum();
  if (sum % 2 != 0) return false;
  int targetSum = sum / 2;
  return branchAndBound(nums, 0, targetSum, 0);
}

private boolean branchAndBound(int[] nums, int index, int targetSum, int currentSum) {
  if (currentSum == targetSum) return true;
  if (index >= nums.length || currentSum > targetSum) return false;
  // Prune branches exceeding target sum
  if (currentSum + nums[index] > targetSum) return false;
  // Explore including the current element
  if (branchAndBound(nums, index+1, targetSum, currentSum + nums[index])) return true;
  // Explore excluding the current element
  return branchAndBound(nums, index+1, targetSum, currentSum);
}
