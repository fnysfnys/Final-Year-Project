function largestDivisibleSubset(nums) {
  nums.sort((a, b) => a - b);
  const result = [];
  for (const num of nums) {
    if (result.length === 0 || (num % result[result.length - 1] === 0)) {
      result.push(num);
    }
  }
  return result;
}
