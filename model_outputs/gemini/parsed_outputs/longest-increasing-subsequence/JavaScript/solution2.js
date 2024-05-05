var lengthOfLIS = function(nums) {
  const memo = new Map();

  function lis(i) {
    if (memo.has(i)) return memo.get(i);
    if (i === nums.length) return 0;

    let maxLength = 1;
    for (let j = 0; j < i; j++) {
      if (nums[j] < nums[i]) {
        maxLength = Math.max(maxLength, 1 + lis(j));
      }
    }
    memo.set(i, maxLength);
    return maxLength;
  }

  return lis(0);
};
