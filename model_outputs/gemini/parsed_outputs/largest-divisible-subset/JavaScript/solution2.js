function largestDivisibleSubset(nums) {
  nums.sort((a, b) => a - b);
  const n = nums.length;
  const dp = Array(n).fill(1);
  let maxLen = 1;
  for (let i = 1; i < n; i++) {
    for (let j = 0; j < i; j++) {
      if (nums[i] % nums[j] === 0 && dp[i] < dp[j] + 1) {
        dp[i] = dp[j] + 1;
        maxLen = Math.max(maxLen, dp[i]);
      }
    }
  }
  const result = [];
  for (let i = n - 1; i >= 0; i--) {
    if (dp[i] === maxLen) {
      result.push(nums[i]);
      maxLen--;
    }
  }
  return result.reverse();
}
