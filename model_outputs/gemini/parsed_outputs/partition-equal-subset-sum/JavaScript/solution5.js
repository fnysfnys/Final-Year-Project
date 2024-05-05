var canPartition = function(nums) {
  const sortedNums = nums.sort((a, b) => b - a);
  let sum1 = 0, sum2 = 0;

  for (const num of sortedNums) {
    if (sum1 <= sum2) {
      sum1 += num;
    } else {
      sum2 += num;
    }
  }

  return Math.abs(sum1 - sum2) <= 1;
};
