function splitArray(nums, k) {
  const targetSum = Math.floor(nums.reduce((acc, n) => acc + n, 0) / k);
  let currentSum = 0, count = 0;
  const res = Math.max(...nums);

  for (const num of nums) {
    if (currentSum + num > targetSum) {
      count++;
      currentSum = 0;
    }
    currentSum += num;
    res = Math.max(res, currentSum);
  }

  return count < k ? res : Math.max(...nums);
}
