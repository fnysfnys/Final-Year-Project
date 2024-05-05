function splitArray(nums, k) {
  let minSum = Number.MAX_VALUE;

  function backtrack(i, count, currentSum) {
    if (count === k && currentSum < minSum) {
      minSum = currentSum;
      return;
    }
    if (i === nums.length || count > k) {
      return;
    }

    backtrack(i + 1, count, currentSum); // Skip element
    backtrack(i + 1, count + 1, currentSum + nums[i]); // Include element
  }

  backtrack(0, 0, 0);
  return minSum;
}
