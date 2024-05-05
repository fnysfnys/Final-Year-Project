var canPartition = function(nums) {
  const totalSum = nums.reduce((a, b) => a + b, 0);
  if (totalSum % 2 !== 0) return false;

  const subsetSum = (1 << totalSum) - 1;
  let currentSum = 0;

  for (const num of nums) {
    currentSum |= currentSum << num;
  }

  return (currentSum & subsetSum) === subsetSum;
};
