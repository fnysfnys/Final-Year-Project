var canPartition = function(nums) {
  const totalSum = nums.reduce((a, b) => a + b, 0);
  if (totalSum % 2 !== 0) return false; // Impossible to split into equal halves

  function backtrack(index, currentSum) {
    if (currentSum === totalSum / 2) return true;
    if (index >= nums.length || currentSum > totalSum / 2) return false;

    return backtrack(index + 1, currentSum + nums[index]) || backtrack(index + 1, currentSum);
  }

  return backtrack(0, 0);
};
