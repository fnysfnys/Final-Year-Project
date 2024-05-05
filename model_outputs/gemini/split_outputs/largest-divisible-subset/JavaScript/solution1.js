function largestDivisibleSubset(nums) {
  nums.sort((a, b) => a - b);
  const n = nums.length;
  const dp = Array(n).fill(1);
  const prev = Array(n).fill(-1);
  let maxIndex = 0;
  for (let i = 1; i < n; i++) {
    for (let j = 0; j < i; j++) {
      if (nums[i] % nums[j] === 0 && dp[i] < dp[j] + 1) {
        dp[i] = dp[j] + 1;
        prev[i] = j;
        if (dp[maxIndex] < dp[i]) {
          maxIndex = i;
        }
      }
    }
  }
  const result = [];
  let i = maxIndex;
  while (i >= 0) {
    result.push(nums[i]);
    i = prev[i];
  }
  return result.reverse();
}
