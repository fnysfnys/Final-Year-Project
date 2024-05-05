const memo = {};
function combinationSum4(nums, target) {
  if (memo[target] !== undefined) {
    return memo[target];
  }
  if (target === 0) {
    return 1;
  }
  let count = 0;
  for (const num of nums) {
    if (target >= num) {
      count += combinationSum4(nums, target - num);
    }
  }
  memo[target] = count;
  return count;
}
