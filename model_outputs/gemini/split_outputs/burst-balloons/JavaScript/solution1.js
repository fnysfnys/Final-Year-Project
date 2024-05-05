var maxCoins = function(nums) {
  const n = nums.length;
  const dp = Array(n + 2).fill(-Infinity); // Padded for boundary handling
  for (let i = 1; i <= n; i++) {
    dp[i] = nums[i - 1];
  }

  const memo = {};
  function solve(left, right) {
    if (left > right) return 0;
    if (memo[`${left}-${right}`]) return memo[`${left}-${right}`];

    let max = 0;
    for (let i = left; i <= right; i++) {
      const burst = dp[left - 1] * dp[i] * dp[right + 1];
      const leftSum = solve(left, i - 1);
      const rightSum = solve(i + 1, right);
      max = Math.max(max, burst + leftSum + rightSum);
    }
    memo[`${left}-${right}`] = max;
    return max;
  }

  return solve(1, n);
};
