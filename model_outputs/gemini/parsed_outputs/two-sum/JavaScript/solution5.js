function twoSum(nums, target) {
  nums.sort((a, b) => a - b);
  for (let i = 0; i < nums.length; i++) {
    const complement = target - nums[i];
    const index = binarySearch(nums, complement, i + 1);
    if (index !== -1) {
      return [i, index];
    }
  }
  throw new Error('No two sum solution found');
}

function binarySearch(arr, target, start) {
  let left = start;
  let right = arr.length - 1;
  while (left <= right) {
    const mid = Math.floor((left + right) / 2);
    if (arr[mid] === target) {
      return mid;
    } else if (arr[mid] < target) {
      left = mid + 1;
    } else {
      right = mid - 1;
    }
  }
  return -1;
}
