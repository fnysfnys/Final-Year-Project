var maxRotateFunction = function(nums) {
  function F(k, n, sum, fPrev) {
    if (k === n) return fPrev;
    const f = fPrev + sum - n * nums[k] + k * nums[(k + 1) % n];
    return F(k + 1, n, sum, f);
  }
  
  const n = nums.length;
  const sum = nums.reduce((acc, num) => acc + num, 0);
  return F(0, n, sum, 0);
};
