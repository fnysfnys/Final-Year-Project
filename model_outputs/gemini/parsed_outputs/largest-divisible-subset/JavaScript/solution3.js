function largestDivisibleSubset(nums) {
  nums.sort((a, b) => a - b);
  const result = [];
  const helper = (i) => {
    if (i === nums.length) {
      return result.length > 0;
    }
    for (let j = i; j < nums.length; j++) {
      if (i === 0 || (nums[i] % nums[j] === 0 && helper(j + 1))) {
        result.push(nums[i]);
        if (helper(j + 1)) {
          return true;
        }
        result.pop();
      }
    }
    return false;
  };
  helper(0);
  return result;
}
