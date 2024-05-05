var numberOfArithmeticSlices = function(nums) {
  if (nums.length < 3) return 0;

  let count = 0;

  for (let i = 2; i < nums.length; i++) {
    const n = i - 1;
    count += (n * (n + 1)) / 2;
  }

  return count;
};
