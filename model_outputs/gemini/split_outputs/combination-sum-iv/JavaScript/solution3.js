function combinationSum4(nums, target) {
  const result = [];
  function backtrack(currentSum, currentList) {
    if (currentSum === target) {
      result.push([...currentList]);
      return;
    }
    for (const num of nums) {
      if (currentSum + num <= target) {
        backtrack(currentSum + num, [...currentList, num]);
      }
    }
  }
  backtrack(0, []);
  return result.length;
}
