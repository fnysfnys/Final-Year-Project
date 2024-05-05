function combinationSum4(nums, target) {
  const stack = [[0, []]];
  while (stack.length) {
    const [currentSum, currentList] = stack.pop();
    if (currentSum === target) {
      return true;
    }
    for (const num of nums) {
      if (currentSum + num <= target) {
        stack.push([currentSum + num, [...currentList, num]]);
      }
    }
  }
  return false;
}
