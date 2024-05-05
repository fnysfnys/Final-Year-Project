const memo = {};
var canPartition = function(nums) {
  const totalSum = nums.reduce((a, b) => a + b, 0);
  if (totalSum % 2 !== 0) return false;

  function dp(index, currentSum) {
    if (currentSum === totalSum / 2) return true;
    if (index >= nums.length || currentSum > totalSum / 2) return false;

    const key = `${index}-${currentSum}`;
    if (memo[key] !== undefined) return memo[key];

    memo[key] = dp(index + 1, currentSum + nums[index]) || dp(index + 1, currentSum);
    return memo[key];
  }

  return dp(0, 0);
};
