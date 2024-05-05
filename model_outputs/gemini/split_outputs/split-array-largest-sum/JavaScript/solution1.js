function splitArray(nums, k) {
  const max = Math.max(...nums);
  const sum = nums.reduce((acc, n) => acc + n, 0);
  let left = max, right = sum;

  while (left < right) {
    const mid = Math.floor((left + right) / 2);
    if (isPossible(nums, k, mid)) {
      right = mid;
    } else {
      left = mid + 1;
    }
  }
  return left;
}

function isPossible(nums, k, maxSum) {
  let count = 1, currentSum = 0;
  for (const num of nums) {
    if (currentSum + num > maxSum) {
      count++;
      currentSum = 0;
    }
    if (count > k) {
      return false;
    }
    currentSum += num;
  }
  return true;
}
