var maxRotateFunction = function(nums) {
  let n = nums.length;
  let sum = 0;
  let maxF = 0;
  const indexMap = new Map();
  
  for (let i = 0; i < n; i++) {
    sum += nums[i];
    indexMap.set(nums[i], i);
    maxF = Math.max(maxF, F(i, nums, sum, indexMap));
  }
  
  return maxF;
};

function F(k, nums, sum, indexMap) {
  let f = 0;
  for (let i = 0; i < nums.length; i++) {
    const num = nums[i];
    const prevIndex = indexMap.get(num);
    const diff = i * num - ((n - k - 1) * num);
    indexMap.set(num, i);
    f += diff;
  }
  return f + (k * sum);
}
