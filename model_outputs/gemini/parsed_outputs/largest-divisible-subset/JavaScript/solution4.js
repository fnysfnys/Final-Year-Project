function largestDivisibleSubset(nums) {
  nums.sort((a, b) => a - b);
  const memo = {};
  const helper = (i) => {
    if (i in memo) {
      return memo[i];
    }
    const res = [];
    for (let j = i; j < nums.length; j++) {
      if (i === 0 || (nums[i] % nums[j] === 0 && helper(j + 1).length > res.length)) {
        const cand = helper(j + 1).concat(nums[i]);
        res.push(...cand);
      }
    }
    return memo[i] = res;
  };
  return helper(0);
}
