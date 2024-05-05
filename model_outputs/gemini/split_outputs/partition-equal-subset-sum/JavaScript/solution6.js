var canPartition = function(nums) {
  const totalSum = nums.reduce((a, b) => a + b, 0);
  if (totalSum % 2 !== 0) return false;

  let bestFound = null;

  function explore(index, currentSum, subset) {
    if (currentSum === totalSum / 2) {
      bestFound = subset;
      return;
    }

    if (index >= nums.length || currentSum > totalSum / 2) return;

    explore(index + 1, currentSum + nums[index], [...subset, nums[index]]);
    explore(index + 1, currentSum, subset);
  }

  explore(0, 0, []);
  return bestFound !== null;
};
