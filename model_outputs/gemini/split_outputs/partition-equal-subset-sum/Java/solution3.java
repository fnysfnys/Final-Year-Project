public boolean canPartition(int[] nums) {
  int sum = Arrays.stream(nums).sum();
  if (sum % 2 != 0) return false;
  int targetSum = sum / 2;
  int n = nums.length;
  int allPossibleSums = (1 << n) - 1;
  // Check if targetSum can be formed using bit manipulation
  return (allPossibleSums & (1 << targetSum)) != 0;
}
